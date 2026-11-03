package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StylusHandwriting_androidKt {
    private static final boolean isStylusHandwritingSupported;

    static {
        isStylusHandwritingSupported = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean isStylusHandwritingSupported() {
        return isStylusHandwritingSupported;
    }
}
