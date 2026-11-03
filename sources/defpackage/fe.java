package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fe implements uk2 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object m;

    public fe(InputStream inputStream, or2 or2Var) {
        inputStream.getClass();
        this.b = inputStream;
        this.m = or2Var;
    }

    public fe(rk2 rk2Var, fe feVar) {
        this.b = rk2Var;
        this.m = feVar;
    }

    @Override // defpackage.uk2
    public final or2 b() {
        switch (this.a) {
            case 0:
                return (rk2) this.b;
            default:
                return (or2) this.m;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rk2 rk2Var = (rk2) obj;
                fe feVar = (fe) this.m;
                rk2Var.h();
                try {
                    feVar.close();
                    if (rk2Var.i()) {
                        throw rk2Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!rk2Var.i()) {
                        throw e;
                    }
                    throw rk2Var.k(e);
                } finally {
                    rk2Var.i();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.uk2
    public final long r(tq tqVar, long j) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.m;
        tqVar.getClass();
        switch (i) {
            case 0:
                rk2 rk2Var = (rk2) obj;
                fe feVar = (fe) obj2;
                rk2Var.h();
                try {
                    long r = feVar.r(tqVar, j);
                    if (rk2Var.i()) {
                        throw rk2Var.k(null);
                    }
                    return r;
                } catch (IOException e) {
                    if (rk2Var.i()) {
                        throw rk2Var.k(e);
                    }
                    throw e;
                } finally {
                    rk2Var.i();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    qq.j(vg1.A(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((or2) obj2).f();
                    ie2 x = tqVar.x(1);
                    int read = ((InputStream) obj).read(x.a, x.c, (int) Math.min(j, 8192 - x.c));
                    if (read == -1) {
                        if (x.b == x.c) {
                            tqVar.a = x.a();
                            ke2.a(x);
                        }
                        return -1L;
                    }
                    x.c += read;
                    long j2 = read;
                    tqVar.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? um2.l0(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((fe) this.m) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
