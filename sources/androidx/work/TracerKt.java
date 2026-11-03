package androidx.work;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class TracerKt {
    public static final <T> T traced(Tracer tracer, String str, os0 os0Var) {
        tracer.getClass();
        str.getClass();
        os0Var.getClass();
        boolean isEnabled = tracer.isEnabled();
        if (isEnabled) {
            try {
                tracer.beginSection(str);
            } catch (Throwable th) {
                if (isEnabled) {
                    tracer.endSection();
                }
                throw th;
            }
        }
        T t = (T) os0Var.invoke();
        if (isEnabled) {
            tracer.endSection();
        }
        return t;
    }
}
