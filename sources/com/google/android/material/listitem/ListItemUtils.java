package com.google.android.material.listitem;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
class ListItemUtils {
    private ListItemUtils() {
    }

    public static boolean isRightAligned(View view) {
        int i;
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams) || (i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity) == -1) {
            i = GravityCompat.END;
        }
        return (GravityCompat.getAbsoluteGravity(i, view.getLayoutDirection()) & 7) == 5;
    }
}
