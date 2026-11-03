package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotContextElement;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.lq2;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, lq2 {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, ts0Var);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, i20Var);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.h20
    public i20 getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, i20Var);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return SnapshotContextElement.DefaultImpls.plus(this, j20Var);
    }

    @Override // defpackage.lq2
    public void restoreThreadContext(j20 j20Var, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    @Override // defpackage.lq2
    public Snapshot updateThreadContext(j20 j20Var) {
        return this.snapshot.unsafeEnter();
    }
}
