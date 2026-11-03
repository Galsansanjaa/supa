package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class nq1 {
    public nq1 a = null;
    public nq1 b = null;
    public nq1 c = null;
    public nq1 d = null;
    public nq1 e = null;

    public abstract void a(hg2 hg2Var);

    public final void b(nq1 nq1Var) {
        nq1Var.f();
        nq1Var.d(this);
        nq1 nq1Var2 = this.c;
        if (nq1Var2 == null) {
            this.b = nq1Var;
            this.c = nq1Var;
        } else {
            nq1Var2.e = nq1Var;
            nq1Var.d = nq1Var2;
            this.c = nq1Var;
        }
    }

    public nq1 c() {
        return this.a;
    }

    public void d(nq1 nq1Var) {
        this.a = nq1Var;
    }

    public String e() {
        return "";
    }

    public final void f() {
        nq1 nq1Var = this.d;
        if (nq1Var != null) {
            nq1Var.e = this.e;
        } else {
            nq1 nq1Var2 = this.a;
            if (nq1Var2 != null) {
                nq1Var2.b = this.e;
            }
        }
        nq1 nq1Var3 = this.e;
        if (nq1Var3 != null) {
            nq1Var3.d = nq1Var;
        } else {
            nq1 nq1Var4 = this.a;
            if (nq1Var4 != null) {
                nq1Var4.c = nq1Var;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
