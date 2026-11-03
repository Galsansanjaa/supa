package androidx.window.layout.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetrics;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowMetricsCompatHelperBaseImpl implements WindowMetricsCompatHelper {
    public static final WindowMetricsCompatHelperBaseImpl INSTANCE = new WindowMetricsCompatHelperBaseImpl();

    private WindowMetricsCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper) {
        activity.getClass();
        densityCompatHelper.getClass();
        return new WindowMetrics(new Bounds(BoundsHelper.Companion.getInstance().currentWindowBounds(activity)), densityCompatHelper.density(activity));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        context.getClass();
        densityCompatHelper.getClass();
        Context unwrapContext$window_release = ContextCompatHelper.INSTANCE.unwrapContext$window_release(context);
        if (unwrapContext$window_release instanceof Activity) {
            return currentWindowMetrics((Activity) unwrapContext$window_release, densityCompatHelper);
        }
        if (!(unwrapContext$window_release instanceof InputMethodService) && !(unwrapContext$window_release instanceof Application)) {
            v5.m("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        DisplayHelper displayHelper = DisplayHelper.INSTANCE;
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
        return new WindowMetrics(new Rect(0, 0, realSizeForDisplay.x, realSizeForDisplay.y), densityCompatHelper.density(context));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics maximumWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        context.getClass();
        densityCompatHelper.getClass();
        return new WindowMetrics(new Bounds(BoundsHelper.Companion.getInstance().maximumWindowBounds(context)), densityCompatHelper.density(context));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float f) {
        windowMetrics.getClass();
        throw new UnsupportedOperationException("translateWindowMetrics not available before API30");
    }
}
