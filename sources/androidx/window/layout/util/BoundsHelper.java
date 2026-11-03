package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface BoundsHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = "BoundsHelper";

        private Companion() {
        }

        public final BoundsHelper getInstance() {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? BoundsHelperApi30Impl.INSTANCE : i >= 29 ? BoundsHelperApi29Impl.INSTANCE : i >= 28 ? BoundsHelperApi28Impl.INSTANCE : i >= 24 ? BoundsHelperApi24Impl.INSTANCE : BoundsHelperApi16Impl.INSTANCE;
        }

        public final String getTAG() {
            return TAG;
        }
    }

    Rect currentWindowBounds(Activity activity);

    Rect maximumWindowBounds(Context context);
}
