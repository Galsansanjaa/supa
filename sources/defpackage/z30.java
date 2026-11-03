package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z30 extends c10 {
    public /* synthetic */ Object a;
    public final /* synthetic */ c30 b;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(c30 c30Var, c10 c10Var) {
        super(c10Var);
        this.b = c30Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.m |= Integer.MIN_VALUE;
        Object b = this.b.b(this);
        return b == e50.a ? b : new i82(b);
    }
}
