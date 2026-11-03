package defpackage;

/* loaded from: classes4.dex */
public final class tl2 extends c10 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ np0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl2(np0 np0Var, a10 a10Var) {
        super(a10Var);
        this.m = np0Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        this.m.collect(null, this);
        return e50.a;
    }
}
