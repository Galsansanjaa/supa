package androidx.leanback.app;

import android.app.Fragment;
import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
class FragmentUtil {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Context getContext(Fragment fragment) {
            return fragment.getContext();
        }
    }

    private FragmentUtil() {
    }

    public static Context getContext(Fragment fragment) {
        return Api23Impl.getContext(fragment);
    }
}
