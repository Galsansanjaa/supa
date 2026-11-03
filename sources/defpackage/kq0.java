package defpackage;

/* loaded from: classes4.dex */
public final class kq0 extends c10 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xp0 m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(xp0 xp0Var, a10 a10Var) {
        super(a10Var);
        this.m = xp0Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
