package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegateKt {
    public static final <T> T traceMeasureLayout(String str, os0 os0Var) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            return (T) os0Var.invoke();
        }
        Trace.beginSection(str);
        try {
            return (T) os0Var.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T traceMeasureLayoutIf(boolean z, String str, os0 os0Var) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled || !z) {
            return (T) os0Var.invoke();
        }
        Trace.beginSection(str);
        try {
            return (T) os0Var.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
