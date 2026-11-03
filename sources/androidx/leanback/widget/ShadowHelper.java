package androidx.leanback.widget;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class ShadowHelper {
    private ShadowHelper() {
    }

    public static Object addDynamicShadow(View view, float f, float f2, int i) {
        return ShadowHelperApi21.addDynamicShadow(view, f, f2, i);
    }

    public static void setShadowFocusLevel(Object obj, float f) {
        ShadowHelperApi21.setShadowFocusLevel(obj, f);
    }

    public static boolean supportsDynamicShadow() {
        return true;
    }
}
