package androidx.compose.ui.platform;

import defpackage.a10;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.w21;
import defpackage.xu3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface InfiniteAnimationPolicy extends h20 {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, ts0 ts0Var) {
            return (R) xu3.l(infiniteAnimationPolicy, r, ts0Var);
        }

        public static <E extends h20> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, i20 i20Var) {
            return (E) xu3.m(infiniteAnimationPolicy, i20Var);
        }

        @Deprecated
        public static i20 getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            int i = w21.a;
            return InfiniteAnimationPolicy.Key;
        }

        public static j20 minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, i20 i20Var) {
            return xu3.r(infiniteAnimationPolicy, i20Var);
        }

        public static j20 plus(InfiniteAnimationPolicy infiniteAnimationPolicy, j20 j20Var) {
            return xu3.t(infiniteAnimationPolicy, j20Var);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
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
    i20 getKey();

    @Override // defpackage.j20
    /* synthetic */ j20 minusKey(i20 i20Var);

    <R> Object onInfiniteOperation(ps0 ps0Var, a10 a10Var);

    @Override // defpackage.j20
    /* synthetic */ j20 plus(j20 j20Var);
}
