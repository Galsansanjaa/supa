package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jt1 implements i12 {
    public static final ak1 c = new ak1(14);
    public static final jy d = new jy(6);
    public lc0 a;
    public volatile i12 b;

    public jt1(ak1 ak1Var, i12 i12Var) {
        this.a = ak1Var;
        this.b = i12Var;
    }

    public final void a(lc0 lc0Var) {
        i12 i12Var;
        i12 i12Var2;
        i12 i12Var3 = this.b;
        jy jyVar = d;
        if (i12Var3 != jyVar) {
            lc0Var.f(i12Var3);
            return;
        }
        synchronized (this) {
            i12Var = this.b;
            if (i12Var != jyVar) {
                i12Var2 = i12Var;
            } else {
                this.a = new iy(10, this.a, lc0Var);
                i12Var2 = null;
            }
        }
        if (i12Var2 != null) {
            lc0Var.f(i12Var);
        }
    }

    @Override // defpackage.i12
    public final Object get() {
        return this.b.get();
    }
}
