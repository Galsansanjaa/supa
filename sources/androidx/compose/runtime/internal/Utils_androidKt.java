package androidx.compose.runtime.internal;

import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Utils_androidKt {
    private static final String LogTag = "ComposeInternal";

    public static final void logError(String str, Throwable th) {
        Log.e(LogTag, str, th);
    }
}
