package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends bb1 implements ps0 {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$2();

    public EnterExitTransitionKt$TransformOriginVectorConverter$2() {
        super(1);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TransformOrigin.m5731boximpl(m97invokeLIALnN8((AnimationVector2D) obj));
    }

    /* renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m97invokeLIALnN8(AnimationVector2D animationVector2D) {
        return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
    }
}
