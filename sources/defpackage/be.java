package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class be implements dd0 {
    public final char a;

    public be(char c) {
        this.a = c;
    }

    @Override // defpackage.dd0
    public final void a(ep2 ep2Var, ep2 ep2Var2, int i) {
        String.valueOf(this.a);
        nq1 nq1Var = i == 1 ? new nq1() : new nq1();
        nq1 nq1Var2 = ep2Var.e;
        while (nq1Var2 != null && nq1Var2 != ep2Var2) {
            nq1 nq1Var3 = nq1Var2.e;
            nq1Var.b(nq1Var2);
            nq1Var2 = nq1Var3;
        }
        nq1Var.f();
        nq1 nq1Var4 = ep2Var.e;
        nq1Var.e = nq1Var4;
        if (nq1Var4 != null) {
            nq1Var4.d = nq1Var;
        }
        nq1Var.d = ep2Var;
        ep2Var.e = nq1Var;
        nq1 nq1Var5 = ep2Var.a;
        nq1Var.a = nq1Var5;
        if (nq1Var.e == null) {
            nq1Var5.c = nq1Var;
        }
    }

    @Override // defpackage.dd0
    public final char b() {
        return this.a;
    }

    @Override // defpackage.dd0
    public final int c() {
        return 1;
    }

    @Override // defpackage.dd0
    public final int d(cd0 cd0Var, cd0 cd0Var2) {
        if (cd0Var.d || cd0Var2.c) {
            int i = cd0Var2.h;
            if (i % 3 != 0 && (cd0Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (cd0Var.g < 2 || cd0Var2.g < 2) ? 1 : 2;
    }

    @Override // defpackage.dd0
    public final char e() {
        return this.a;
    }
}
