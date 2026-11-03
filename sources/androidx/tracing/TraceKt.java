package androidx.tracing;

import defpackage.a10;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class TraceKt {
    public static final <T> T trace(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
        Trace.beginSection(str);
        try {
            return (T) os0Var.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T trace(os0 os0Var, os0 os0Var2) {
        os0Var.getClass();
        os0Var2.getClass();
        boolean isEnabled = Trace.isEnabled();
        if (isEnabled) {
            Trace.beginSection((String) os0Var.invoke());
        }
        try {
            return (T) os0Var2.invoke();
        } finally {
            if (isEnabled) {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r4, int r5, defpackage.ps0 r6, defpackage.a10 r7) {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt$traceAsync$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt$traceAsync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.TraceKt$traceAsync$1 r0 = new androidx.tracing.TraceKt$traceAsync$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            defpackage.ta3.H(r7)     // Catch: java.lang.Throwable -> L2b
            goto L49
        L2b:
            r6 = move-exception
            goto L4d
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L34:
            defpackage.ta3.H(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2b
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2b
            r0.label = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            e50 r6 = defpackage.e50.a
            if (r7 != r6) goto L49
            return r6
        L49:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            return r7
        L4d:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, ps0, a10):java.lang.Object");
    }

    public static final <T> T traceAsync(os0 os0Var, os0 os0Var2, os0 os0Var3) {
        String str;
        int i;
        os0Var.getClass();
        os0Var2.getClass();
        os0Var3.getClass();
        if (Trace.isEnabled()) {
            str = (String) os0Var.invoke();
            i = ((Number) os0Var2.invoke()).intValue();
            Trace.beginAsyncSection(str, i);
        } else {
            str = null;
            i = 0;
        }
        try {
            return (T) os0Var3.invoke();
        } finally {
            if (str != null) {
                Trace.endAsyncSection(str, i);
            }
        }
    }

    private static final <T> Object traceAsync$$forInline(String str, int i, ps0 ps0Var, a10 a10Var) {
        Trace.beginAsyncSection(str, i);
        try {
            return ps0Var.invoke(a10Var);
        } finally {
            Trace.endAsyncSection(str, i);
        }
    }
}
