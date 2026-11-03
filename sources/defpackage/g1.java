package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class g1 {
    public h1[] a;
    public int b;
    public int m;
    public hn2 n;

    public final h1 d() {
        h1 h1Var;
        hn2 hn2Var;
        synchronized (this) {
            try {
                h1[] h1VarArr = this.a;
                if (h1VarArr == null) {
                    h1VarArr = f();
                    this.a = h1VarArr;
                } else if (this.b >= h1VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(h1VarArr, h1VarArr.length * 2);
                    this.a = (h1[]) copyOf;
                    h1VarArr = (h1[]) copyOf;
                }
                int i = this.m;
                do {
                    h1Var = h1VarArr[i];
                    if (h1Var == null) {
                        h1Var = e();
                        h1VarArr[i] = h1Var;
                    }
                    i++;
                    if (i >= h1VarArr.length) {
                        i = 0;
                    }
                } while (!h1Var.a(this));
                this.m = i;
                this.b++;
                hn2Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hn2Var != null) {
            hn2Var.v(1);
        }
        return h1Var;
    }

    public abstract h1 e();

    public abstract h1[] f();

    public final void g(h1 h1Var) {
        hn2 hn2Var;
        int i;
        a10[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                hn2Var = this.n;
                if (i2 == 0) {
                    this.m = 0;
                }
                h1Var.getClass();
                b = h1Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a10 a10Var : b) {
            if (a10Var != null) {
                a10Var.resumeWith(vy2.a);
            }
        }
        if (hn2Var != null) {
            hn2Var.v(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [zh2, hn2] */
    public final hn2 h() {
        hn2 hn2Var;
        synchronized (this) {
            hn2 hn2Var2 = this.n;
            hn2Var = hn2Var2;
            if (hn2Var2 == null) {
                int i = this.b;
                ?? zh2Var = new zh2(1, Integer.MAX_VALUE, vq.b);
                zh2Var.a(Integer.valueOf(i));
                this.n = zh2Var;
                hn2Var = zh2Var;
            }
        }
        return hn2Var;
    }
}
