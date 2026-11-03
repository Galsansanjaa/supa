package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BackgroundHelper {
    private BackgroundHelper() {
    }

    public static void setBackgroundPreservingAlpha(View view, Drawable drawable) {
        if (view.getBackground() != null) {
            drawable.setAlpha(view.getBackground().getAlpha());
        }
        view.setBackground(drawable);
    }
}
