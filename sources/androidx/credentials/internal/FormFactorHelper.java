package androidx.credentials.internal;

import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FormFactorHelper {
    public static final FormFactorHelper INSTANCE = new FormFactorHelper();

    private FormFactorHelper() {
    }

    public static final boolean isAuto(Context context) {
        context.getClass();
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static final boolean isTV(Context context) {
        context.getClass();
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static final boolean isWear(Context context) {
        context.getClass();
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
