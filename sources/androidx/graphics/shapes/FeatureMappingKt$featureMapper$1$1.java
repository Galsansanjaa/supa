package androidx.graphics.shapes;

import defpackage.bb1;
import defpackage.dv1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FeatureMappingKt$featureMapper$1$1 extends bb1 implements ps0 {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public final CharSequence invoke(dv1 dv1Var) {
        dv1Var.getClass();
        return ((Number) dv1Var.a).floatValue() + " -> " + ((Number) dv1Var.b).floatValue();
    }
}
