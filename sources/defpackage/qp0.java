package defpackage;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class qp0 extends c10 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rp0 m;
    public kp0 n;
    public Serializable o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(rp0 rp0Var, a10 a10Var) {
        super(a10Var);
        this.m = rp0Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.m.collect(null, this);
    }
}
