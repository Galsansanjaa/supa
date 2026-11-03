package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class d30 extends c10 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e30 b;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(e30 e30Var, c10 c10Var) {
        super(c10Var);
        this.b = e30Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = this.b.a(this);
        return a == e50.a ? a : new i82(a);
    }
}
