package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i) {
        this.a = i;
        this.b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$3(valueAnimator);
                return;
            case 1:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getScaleAnimator$4(valueAnimator);
                return;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$6(valueAnimator);
                return;
        }
    }
}
