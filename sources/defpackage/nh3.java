package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nh3 extends c10 {
    public sh3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sh3 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh3(sh3 sh3Var, c10 c10Var) {
        super(c10Var);
        this.m = sh3Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
