package defpackage;

/* loaded from: classes4.dex */
public final class nl extends c10 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ol m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(ol olVar, a10 a10Var) {
        super(a10Var);
        this.m = olVar;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
