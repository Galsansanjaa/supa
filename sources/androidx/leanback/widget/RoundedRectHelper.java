package androidx.leanback.widget;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class RoundedRectHelper {
    private RoundedRectHelper() {
    }

    public static void setClipToRoundedOutline(View view, boolean z) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z, view.getResources().getDimensionPixelSize(androidx.leanback.R.dimen.lb_rounded_rect_corner_radius));
    }

    public static void setClipToRoundedOutline(View view, boolean z, int i) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z, i);
    }

    public static boolean supportsRoundedCorner() {
        return true;
    }
}
