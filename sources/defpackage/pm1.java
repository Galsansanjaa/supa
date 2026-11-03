package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pm1 implements x73 {
    public final pm1 a;
    public final Object b;
    public final /* synthetic */ sm1 m;

    public pm1(sm1 sm1Var, pm1 pm1Var, Object obj) {
        this.m = sm1Var;
        this.a = pm1Var;
        this.b = obj;
    }

    @Override // defpackage.x73
    public final void a(je2 je2Var, int i) {
        this.a.a(je2Var, i);
    }

    public final void b(Object obj) {
        sm1.s.set(this.m, this.b);
        this.a.b(obj);
    }

    public final boolean c(Object obj, Object obj2) {
        boolean c = this.a.c(obj, obj2);
        if (c) {
            sm1.s.set(this.m, this.b);
        }
        return c;
    }
}
