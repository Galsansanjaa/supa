package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class t implements h20 {
    private final i20 key;

    public t(i20 i20Var) {
        i20Var.getClass();
        this.key = i20Var;
    }

    @Override // defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) xu3.l(this, r, ts0Var);
    }

    @Override // defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) xu3.m(this, i20Var);
    }

    @Override // defpackage.h20
    public i20 getKey() {
        return this.key;
    }

    @Override // defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return xu3.r(this, i20Var);
    }

    @Override // defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return xu3.t(this, j20Var);
    }
}
