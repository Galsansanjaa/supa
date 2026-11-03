package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.window.core.Bounds;
import androidx.window.layout.util.WindowMetricsCompatHelper;
import defpackage.m83;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static ps0 decorator = new m83(5);
        private static final WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowMetricsCalculator decorator$lambda$0(WindowMetricsCalculator windowMetricsCalculator) {
            windowMetricsCalculator.getClass();
            return windowMetricsCalculator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowMetricsCalculator reset$lambda$1(WindowMetricsCalculator windowMetricsCalculator) {
            windowMetricsCalculator.getClass();
            return windowMetricsCalculator;
        }

        public final WindowMetrics fromDisplayMetrics$window_release(DisplayMetrics displayMetrics) {
            displayMetrics.getClass();
            return new WindowMetrics(new Bounds(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels), displayMetrics.density);
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(windowMetricsCalculatorCompat);
        }

        public final void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            windowMetricsCalculatorDecorator.getClass();
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(windowMetricsCalculatorDecorator);
        }

        public final void reset() {
            decorator = new m83(4);
        }

        public final WindowMetrics translateWindowMetrics$window_release(android.view.WindowMetrics windowMetrics, float f) {
            windowMetrics.getClass();
            return WindowMetricsCompatHelper.Companion.getInstance().translateWindowMetrics(windowMetrics, f);
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeCurrentWindowMetrics(Context context);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Context context);
}
