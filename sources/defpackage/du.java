package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class du extends c10 {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(eu euVar, a10 a10Var) {
        super(a10Var);
        this.m = euVar;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
