package com.google.android.material.listitem;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface RevealableListItem {
    public static final int PRIMARY_ACTION_SWIPE_DIRECT = 2;
    public static final int PRIMARY_ACTION_SWIPE_DISABLED = 0;
    public static final int PRIMARY_ACTION_SWIPE_INDIRECT = 1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PrimaryActionSwipeMode {
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface RevealGravity {
    }

    int getIntrinsicWidth();

    int getPrimaryActionSwipeMode();

    void setPrimaryActionSwipeMode(int i);

    void setRevealedWidth(int i);
}
