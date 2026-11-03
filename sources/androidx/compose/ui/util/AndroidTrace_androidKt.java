package androidx.compose.ui.util;

import android.os.Build;
import android.os.Trace;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, os0 os0Var) {
        Trace.beginSection(str);
        try {
            return (T) os0Var.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final void traceValue(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
