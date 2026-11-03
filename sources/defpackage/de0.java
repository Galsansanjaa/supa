package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class de0 implements Closeable {
    public final String a;
    public final long b;
    public final uk2[] m;
    public final /* synthetic */ ee0 n;

    public de0(ee0 ee0Var, String str, long j, uk2[] uk2VarArr) {
        this.n = ee0Var;
        this.a = str;
        this.b = j;
        this.m = uk2VarArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (uk2 uk2Var : this.m) {
            f63.c(uk2Var);
        }
    }
}
