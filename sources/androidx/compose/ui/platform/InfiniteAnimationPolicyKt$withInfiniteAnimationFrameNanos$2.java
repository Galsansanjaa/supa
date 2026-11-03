package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.ps0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", v = 1)
/* loaded from: classes3.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends tn2 implements ps0 {
    final /* synthetic */ ps0 $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(ps0 ps0Var, a10 a10Var) {
        super(1, a10Var);
        this.$onFrame = ps0Var;
    }

    @Override // defpackage.cm
    public final a10 create(a10 a10Var) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, a10Var);
    }

    @Override // defpackage.ps0
    public final Object invoke(a10 a10Var) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(a10Var)).invokeSuspend(vy2.a);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ta3.H(obj);
                return obj;
            }
            hu2.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ta3.H(obj);
        ps0 ps0Var = this.$onFrame;
        this.label = 1;
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(ps0Var, this);
        e50 e50Var = e50.a;
        return withFrameNanos == e50Var ? e50Var : withFrameNanos;
    }
}
