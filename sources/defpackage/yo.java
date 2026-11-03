package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class yo extends nq1 {
    @Override // defpackage.nq1
    public final nq1 c() {
        return (yo) this.a;
    }

    @Override // defpackage.nq1
    public final void d(nq1 nq1Var) {
        if (nq1Var instanceof yo) {
            this.a = nq1Var;
        } else {
            v5.m("Parent of block must also be block (can not be inline)");
        }
    }
}
