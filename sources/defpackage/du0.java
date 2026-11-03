package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class du0 implements bm2 {
    public final uo2 a;

    public du0(uo2 uo2Var) {
        this.a = uo2Var;
    }

    @Override // defpackage.bm2
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.bm2
    public final boolean b(qj qjVar) {
        int i = qjVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(qjVar.a);
        return true;
    }
}
