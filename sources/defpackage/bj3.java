package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bj3 extends c10 {
    public /* synthetic */ Object a;
    public final /* synthetic */ qj3 b;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj3(qj3 qj3Var, c10 c10Var) {
        super(c10Var);
        this.b = qj3Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.m |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
