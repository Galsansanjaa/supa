package androidx.tracing;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.tracing.TraceKt", f = "Trace.kt", l = {76}, m = "traceAsync")
/* loaded from: classes4.dex */
public final class TraceKt$traceAsync$1<T> extends c10 {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TraceKt$traceAsync$1(a10 a10Var) {
        super(a10Var);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TraceKt.traceAsync(null, 0, null, this);
    }
}
