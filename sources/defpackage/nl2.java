package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nl2 implements a10, f50 {
    public final zt a;
    public final j20 b;

    public nl2(zt ztVar, j20 j20Var) {
        this.a = ztVar;
        this.b = j20Var;
    }

    @Override // defpackage.f50
    public final f50 getCallerFrame() {
        return this.a;
    }

    @Override // defpackage.a10
    public final j20 getContext() {
        return this.b;
    }

    @Override // defpackage.a10
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
