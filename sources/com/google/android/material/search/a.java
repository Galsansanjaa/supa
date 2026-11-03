package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.search.SearchViewAnimationHelper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SearchBarAnimationHelper.a(valueAnimator, (View) obj);
                return;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) obj, valueAnimator);
                return;
            case 2:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) obj, valueAnimator);
                return;
            case 3:
                SearchViewAnimationHelper.lambda$addBackButtonAnimatorIfNeeded$2((ImageButton) obj, valueAnimator);
                return;
            default:
                ((SearchViewAnimationHelper.DefaultAnimationDelegate) obj).lambda$addTextFadeAnimatorIfNeeded$2(valueAnimator);
                return;
        }
    }
}
