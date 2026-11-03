package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class DisplayHelper {
    public static final DisplayHelper INSTANCE = new DisplayHelper();

    private DisplayHelper() {
    }

    public final Point getRealSizeForDisplay(Display display) {
        display.getClass();
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
