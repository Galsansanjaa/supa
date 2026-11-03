package androidx.compose.runtime.internal;

import android.os.Looper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Thread_androidKt {
    private static final long MainThreadId;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        MainThreadId = j;
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }
}
