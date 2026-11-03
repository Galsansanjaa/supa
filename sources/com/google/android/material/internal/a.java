package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.a) {
            case 0:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                return;
            case 1:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                return;
            case 2:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                return;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                return;
        }
    }
}
