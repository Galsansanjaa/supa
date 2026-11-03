package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
abstract class HideViewOnScrollDelegate {
    public abstract <V extends View> int getSize(V v, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getTargetTranslation();

    public abstract int getViewEdge();

    public abstract <V extends View> ViewPropertyAnimator getViewTranslationAnimator(V v, int i);

    public abstract <V extends View> void setAdditionalHiddenOffset(V v, int i, int i2);

    public abstract <V extends View> void setViewTranslation(V v, int i);
}
