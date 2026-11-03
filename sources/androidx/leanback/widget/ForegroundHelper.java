package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class ForegroundHelper {
    private ForegroundHelper() {
    }

    public static Drawable getForeground(View view) {
        return view.getForeground();
    }

    public static void setForeground(View view, Drawable drawable) {
        view.setForeground(drawable);
    }

    public static boolean supportsForeground() {
        return true;
    }
}
