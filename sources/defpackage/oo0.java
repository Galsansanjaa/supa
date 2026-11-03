package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oo0 extends c10 {
    public Map a;
    public Iterator b;
    public dh2 m;
    public Map n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ po0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(po0 po0Var, c10 c10Var) {
        super(c10Var);
        this.q = po0Var;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
