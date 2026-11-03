package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fh0 implements j20 {
    public final /* synthetic */ j20 a;
    public final Throwable b;

    public fh0(j20 j20Var, Throwable th) {
        this.a = j20Var;
        this.b = th;
    }

    @Override // defpackage.j20
    public final Object fold(Object obj, ts0 ts0Var) {
        return this.a.fold(obj, ts0Var);
    }

    @Override // defpackage.j20
    public final h20 get(i20 i20Var) {
        return this.a.get(i20Var);
    }

    @Override // defpackage.j20
    public final j20 minusKey(i20 i20Var) {
        return this.a.minusKey(i20Var);
    }

    @Override // defpackage.j20
    public final j20 plus(j20 j20Var) {
        return this.a.plus(j20Var);
    }
}
