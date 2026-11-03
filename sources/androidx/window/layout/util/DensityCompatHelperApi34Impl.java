package androidx.window.layout.util;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class DensityCompatHelperApi34Impl implements DensityCompatHelper {
    public static final DensityCompatHelperApi34Impl INSTANCE = new DensityCompatHelperApi34Impl();

    private DensityCompatHelperApi34Impl() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Context context) {
        context.getClass();
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Configuration configuration, WindowMetrics windowMetrics) {
        configuration.getClass();
        windowMetrics.getClass();
        return windowMetrics.getDensity();
    }
}
