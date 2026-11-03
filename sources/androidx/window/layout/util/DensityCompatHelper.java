package androidx.window.layout.util;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface DensityCompatHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DensityCompatHelper getInstance() {
            return Build.VERSION.SDK_INT >= 34 ? DensityCompatHelperApi34Impl.INSTANCE : DensityCompatHelperBaseImpl.INSTANCE;
        }
    }

    float density(Context context);

    float density(Configuration configuration, WindowMetrics windowMetrics);
}
