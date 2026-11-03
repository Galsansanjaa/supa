package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class BoundsHelperApi24Impl implements BoundsHelper {
    public static final BoundsHelperApi24Impl INSTANCE = new BoundsHelperApi24Impl();

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        activity.getClass();
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Point realSizeForDisplay = DisplayHelper.INSTANCE.getRealSizeForDisplay(defaultDisplay);
            int access$getNavigationBarHeight = BoundsHelperKt.access$getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + access$getNavigationBarHeight == realSizeForDisplay.y) {
                rect.bottom = i + access$getNavigationBarHeight;
                return rect;
            }
            int i2 = rect.right;
            if (i2 + access$getNavigationBarHeight == realSizeForDisplay.x) {
                rect.right = i2 + access$getNavigationBarHeight;
            }
        }
        return rect;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect maximumWindowBounds(Context context) {
        context.getClass();
        return BoundsHelperApi16Impl.INSTANCE.maximumWindowBounds(context);
    }
}
