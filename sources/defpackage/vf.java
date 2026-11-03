package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vf implements cs1 {
    public static final vf a = new Object();
    public static final em0 b = em0.a("generator");
    public static final em0 c = em0.a("identifier");
    public static final em0 d = em0.a("appQualitySessionId");
    public static final em0 e = em0.a("startedAt");
    public static final em0 f = em0.a("endedAt");
    public static final em0 g = em0.a("crashed");
    public static final em0 h = em0.a("app");
    public static final em0 i = em0.a("user");
    public static final em0 j = em0.a("os");
    public static final em0 k = em0.a("device");
    public static final em0 l = em0.a("events");
    public static final em0 m = em0.a("generatorType");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        f70 f70Var = (f70) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, ((uh) f70Var).a);
        uh uhVar = (uh) f70Var;
        ds1Var.a(c, uhVar.b.getBytes(g70.a));
        ds1Var.a(d, uhVar.c);
        ds1Var.g(e, uhVar.d);
        ds1Var.a(f, uhVar.e);
        ds1Var.d(g, uhVar.f);
        ds1Var.a(h, uhVar.g);
        ds1Var.a(i, uhVar.h);
        ds1Var.a(j, uhVar.i);
        ds1Var.a(k, uhVar.j);
        ds1Var.a(l, uhVar.k);
        ds1Var.e(m, uhVar.l);
    }
}
