package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vp3 implements dt1, ct1, at1 {
    public final Object a = new Object();
    public final int b;
    public final zc4 m;
    public int n;
    public int o;
    public int p;
    public Exception q;
    public boolean r;

    public vp3(int i, zc4 zc4Var) {
        this.b = i;
        this.m = zc4Var;
    }

    public final void a() {
        int i = this.n;
        int i2 = this.o;
        int i3 = i + i2 + this.p;
        int i4 = this.b;
        if (i3 == i4) {
            Exception exc = this.q;
            zc4 zc4Var = this.m;
            if (exc == null) {
                if (this.r) {
                    zc4Var.o();
                    return;
                } else {
                    zc4Var.l(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            zc4Var.n(new ExecutionException(sb.toString(), this.q));
        }
    }

    @Override // defpackage.at1
    public final void c() {
        synchronized (this.a) {
            this.p++;
            this.r = true;
            a();
        }
    }

    @Override // defpackage.dt1
    public final void d(Object obj) {
        synchronized (this.a) {
            this.n++;
            a();
        }
    }

    @Override // defpackage.ct1
    public final void e(Exception exc) {
        synchronized (this.a) {
            this.o++;
            this.q = exc;
            a();
        }
    }
}
