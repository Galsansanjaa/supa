package androidx.core.os;

import android.os.Trace;
import defpackage.hd0;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TraceKt {
    @hd0
    public static final <T> T trace(String str, os0 os0Var) {
        Trace.beginSection(str);
        try {
            return (T) os0Var.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
