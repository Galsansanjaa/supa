package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class wb2 extends s implements f50 {
    public final a10 n;

    public wb2(a10 a10Var, j20 j20Var) {
        super(j20Var, true);
        this.n = a10Var;
    }

    @Override // defpackage.a81
    public final boolean O() {
        return true;
    }

    public void f0() {
    }

    @Override // defpackage.f50
    public final f50 getCallerFrame() {
        a10 a10Var = this.n;
        if (a10Var instanceof f50) {
            return (f50) a10Var;
        }
        return null;
    }

    @Override // defpackage.a81
    public void s(Object obj) {
        ta3.D(m60.u(this.n), ta3.C(obj));
    }

    @Override // defpackage.a81
    public void t(Object obj) {
        this.n.resumeWith(ta3.C(obj));
    }
}
