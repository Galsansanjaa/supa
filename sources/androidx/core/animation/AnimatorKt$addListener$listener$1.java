package androidx.core.animation;

import android.animation.Animator;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ ps0 $onCancel;
    final /* synthetic */ ps0 $onEnd;
    final /* synthetic */ ps0 $onRepeat;
    final /* synthetic */ ps0 $onStart;

    public AnimatorKt$addListener$listener$1(ps0 ps0Var, ps0 ps0Var2, ps0 ps0Var3, ps0 ps0Var4) {
        this.$onRepeat = ps0Var;
        this.$onEnd = ps0Var2;
        this.$onCancel = ps0Var3;
        this.$onStart = ps0Var4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
