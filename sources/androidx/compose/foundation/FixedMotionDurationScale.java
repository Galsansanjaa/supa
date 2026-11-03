package androidx.compose.foundation;

import androidx.compose.ui.MotionDurationScale;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class FixedMotionDurationScale implements MotionDurationScale {
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, ts0Var);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) MotionDurationScale.DefaultImpls.get(this, i20Var);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.h20
    public final i20 getKey() {
        return MotionDurationScale.Key;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return MotionDurationScale.DefaultImpls.minusKey(this, i20Var);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return MotionDurationScale.DefaultImpls.plus(this, j20Var);
    }
}
