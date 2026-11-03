package defpackage;

/* loaded from: classes4.dex */
public final class fq0 extends c10 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ gq0 m;
    public Object n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(gq0 gq0Var, a10 a10Var) {
        super(a10Var);
        this.m = gq0Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
