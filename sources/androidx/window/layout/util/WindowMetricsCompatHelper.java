package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.layout.WindowMetrics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface WindowMetricsCompatHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final WindowMetricsCompatHelper getInstance() {
            int i = Build.VERSION.SDK_INT;
            return i >= 34 ? WindowMetricsCompatHelperApi34Impl.INSTANCE : i >= 30 ? WindowMetricsCompatHelperApi30Impl.INSTANCE : WindowMetricsCompatHelperBaseImpl.INSTANCE;
        }
    }

    WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper);

    WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper);

    WindowMetrics maximumWindowMetrics(Context context, DensityCompatHelper densityCompatHelper);

    WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float f);
}
