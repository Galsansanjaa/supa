package defpackage;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class mk2 implements ObserverHandle {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mk2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$1((ts0) obj);
                return;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$1((ps0) obj);
                return;
            default:
                SnapshotObserverKt.a((SnapshotObserver) obj);
                return;
        }
    }
}
