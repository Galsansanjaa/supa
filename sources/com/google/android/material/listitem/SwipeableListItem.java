package com.google.android.material.listitem;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface SwipeableListItem {
    public static final int STATE_CLOSED = 3;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_OPEN = 4;
    public static final int STATE_SETTLING = 2;
    public static final int STATE_SWIPE_PRIMARY_ACTION = 5;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface StableSwipeState {
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SwipeState {
    }

    int getSwipeMaxOvershoot();

    boolean isSwipeEnabled();

    void onSwipe(int i);

    <T extends View & RevealableListItem> void onSwipeStateChanged(int i, T t, int i2);

    void setSwipeEnabled(boolean z);
}
