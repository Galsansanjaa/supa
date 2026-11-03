package androidx.compose.foundation.lazy.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PriorityTask {
    private static final int Low = 0;
    private final int priority;
    private final PrefetchRequest request;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int High = 1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final int getHigh() {
            return PriorityTask.High;
        }

        public final int getLow() {
            return PriorityTask.Low;
        }
    }

    public PriorityTask(int i, PrefetchRequest prefetchRequest) {
        this.priority = i;
        this.request = prefetchRequest;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final PrefetchRequest getRequest() {
        return this.request;
    }
}
