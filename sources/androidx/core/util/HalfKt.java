package androidx.core.util;

import android.util.Half;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HalfKt {
    public static final Half toHalf(double d) {
        return Half.valueOf((float) d);
    }

    public static final Half toHalf(float f) {
        return Half.valueOf(f);
    }

    public static final Half toHalf(String str) {
        return Half.valueOf(str);
    }

    public static final Half toHalf(short s) {
        return Half.valueOf(s);
    }
}
