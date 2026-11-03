package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.lf2;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class SnapshotFlowManagerImpl {
    public static final int $stable = 8;
    private final Object lock = new Object();

    public abstract void clearWatchSet$runtime(lf2 lf2Var);

    public abstract void commitSubscriptionChanges$runtime();

    public abstract void dispose$runtime();

    public final Object getLock() {
        return this.lock;
    }

    public abstract ps0 readObserverFor$runtime(lf2 lf2Var);

    public abstract void reportSnapshotFlowCancellation$runtime(lf2 lf2Var);

    public final <T> T runAndWatch$runtime(lf2 lf2Var, os0 os0Var) {
        Snapshot takeSnapshot = Snapshot.Companion.takeSnapshot(readObserverFor$runtime(lf2Var));
        clearWatchSet$runtime(lf2Var);
        try {
            Snapshot makeCurrent = takeSnapshot.makeCurrent();
            try {
                T t = (T) os0Var.invoke();
                takeSnapshot.dispose();
                commitSubscriptionChanges$runtime();
                return t;
            } finally {
                takeSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            takeSnapshot.dispose();
            throw th;
        }
    }

    public abstract void watch$runtime(lf2 lf2Var, Object obj);
}
