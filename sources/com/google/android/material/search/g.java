package com.google.android.material.search;

import android.animation.ValueAnimator;
import com.google.android.material.search.SearchViewAnimationHelper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchViewAnimationHelper.ContainedAnimationDelegate b;

    public /* synthetic */ g(SearchViewAnimationHelper.ContainedAnimationDelegate containedAnimationDelegate, int i) {
        this.a = i;
        this.b = containedAnimationDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SearchViewAnimationHelper.ContainedAnimationDelegate containedAnimationDelegate = this.b;
        switch (i) {
            case 0:
                containedAnimationDelegate.lambda$getToolbarAlphaAnimator$1(valueAnimator);
                return;
            case 1:
                containedAnimationDelegate.lambda$getBackgroundAlphaAnimator$0(valueAnimator);
                return;
            default:
                containedAnimationDelegate.lambda$getDummyTextViewWidthAnimator$2(valueAnimator);
                return;
        }
    }
}
