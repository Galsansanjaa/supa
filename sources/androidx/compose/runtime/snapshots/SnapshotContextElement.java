package androidx.compose.runtime.snapshots;

import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.ts0;
import defpackage.xu3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SnapshotContextElement extends h20 {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r, ts0 ts0Var) {
            return (R) xu3.l(snapshotContextElement, r, ts0Var);
        }

        public static <E extends h20> E get(SnapshotContextElement snapshotContextElement, i20 i20Var) {
            return (E) xu3.m(snapshotContextElement, i20Var);
        }

        public static j20 minusKey(SnapshotContextElement snapshotContextElement, i20 i20Var) {
            return xu3.r(snapshotContextElement, i20Var);
        }

        public static j20 plus(SnapshotContextElement snapshotContextElement, j20 j20Var) {
            return xu3.t(snapshotContextElement, j20Var);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Key implements i20 {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // defpackage.j20
    /* synthetic */ Object fold(Object obj, ts0 ts0Var);

    @Override // defpackage.j20
    /* synthetic */ h20 get(i20 i20Var);

    @Override // defpackage.h20
    /* synthetic */ i20 getKey();

    @Override // defpackage.j20
    /* synthetic */ j20 minusKey(i20 i20Var);

    @Override // defpackage.j20
    /* synthetic */ j20 plus(j20 j20Var);
}
