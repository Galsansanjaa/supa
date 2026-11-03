package androidx.window.layout.util;

import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowMetrics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class DensityCompatHelperBaseImpl implements DensityCompatHelper {
    public static final DensityCompatHelperBaseImpl INSTANCE = new DensityCompatHelperBaseImpl();

    private DensityCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Context context) {
        context.getClass();
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Configuration configuration, WindowMetrics windowMetrics) {
        configuration.getClass();
        windowMetrics.getClass();
        return configuration.densityDpi / 160.0f;
    }
}
