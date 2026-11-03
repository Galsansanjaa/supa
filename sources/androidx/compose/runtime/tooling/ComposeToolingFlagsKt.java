package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Trace;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposeToolingFlagsKt {
    public static final <T> T verboseTrace(String str, os0 os0Var) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            return (T) os0Var.invoke();
        }
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T t = (T) os0Var.invoke();
            trace.endSection(beginSection);
            return t;
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }
}
