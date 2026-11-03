package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends bb1 implements ps0 {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    public EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m96invoke__ExYCQ(((TransformOrigin) obj).m5743unboximpl());
    }

    /* renamed from: invoke-__ExYCQ, reason: not valid java name */
    public final AnimationVector2D m96invoke__ExYCQ(long j) {
        return new AnimationVector2D(TransformOrigin.m5739getPivotFractionXimpl(j), TransformOrigin.m5740getPivotFractionYimpl(j));
    }
}
