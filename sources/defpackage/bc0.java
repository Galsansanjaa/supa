package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bc0 extends zj0 {
    public static final bc0 b;
    public x40 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [w20, bc0] */
    static {
        int i = xo2.c;
        int i2 = xo2.d;
        long j = xo2.e;
        String str = xo2.a;
        ?? w20Var = new w20();
        w20Var.a = new x40(i, i2, j, str);
        b = w20Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.w20
    public final void dispatch(j20 j20Var, Runnable runnable) {
        x40.e(this.a, runnable, 6);
    }

    @Override // defpackage.w20
    public final void dispatchYield(j20 j20Var, Runnable runnable) {
        x40.e(this.a, runnable, 2);
    }

    @Override // defpackage.w20
    public final w20 limitedParallelism(int i, String str) {
        np3.j(i);
        return i >= xo2.c ? str != null ? new uo1(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // defpackage.w20
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.zj0
    public final Executor v() {
        return this.a;
    }
}
