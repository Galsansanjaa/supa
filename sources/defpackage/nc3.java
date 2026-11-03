package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nc3 extends c10 {
    public sd3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sd3 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc3(sd3 sd3Var, c10 c10Var) {
        super(c10Var);
        this.m = sd3Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
