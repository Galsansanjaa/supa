package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uo2 {
    public final zc4 a = new zc4();

    public uo2() {
    }

    public uo2(xg3 xg3Var) {
        ((zc4) xg3Var.b).d(vo2.a, new s83(5, xg3Var, new s83(this, 16)));
    }

    public final void a(Exception exc) {
        this.a.n(exc);
    }

    public final void b(Object obj) {
        this.a.l(obj);
    }

    public final boolean c(Exception exc) {
        zc4 zc4Var = this.a;
        zc4Var.getClass();
        dn3.p(exc, "Exception must not be null");
        synchronized (zc4Var.a) {
            try {
                if (zc4Var.c) {
                    return false;
                }
                zc4Var.c = true;
                zc4Var.f = exc;
                zc4Var.b.c(zc4Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.m(obj);
    }
}
