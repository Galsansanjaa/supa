package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;
    private T mainThreadValue;
    private final AtomicReference<ThreadMap> map;
    private final Object writeMutex;

    public SnapshotThreadLocal() {
        ThreadMap threadMap;
        threadMap = SnapshotThreadLocalKt.emptyThreadMap;
        this.map = new AtomicReference<>(threadMap);
        this.writeMutex = new Object();
    }

    public final T get() {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        return currentThreadId == Thread_androidKt.getMainThreadId() ? this.mainThreadValue : (T) this.map.get().get(currentThreadId);
    }

    public final void set(T t) {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        if (currentThreadId == Thread_androidKt.getMainThreadId()) {
            this.mainThreadValue = t;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(currentThreadId, t)) {
                return;
            }
            this.map.set(threadMap.newWith(currentThreadId, t));
        }
    }
}
