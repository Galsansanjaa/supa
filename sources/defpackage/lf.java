package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class lf implements cs1 {
    public static final lf a = new Object();
    public static final em0 b = em0.a("pid");
    public static final em0 c = em0.a("processName");
    public static final em0 d = em0.a("reasonCode");
    public static final em0 e = em0.a("importance");
    public static final em0 f = em0.a("pss");
    public static final em0 g = em0.a("rss");
    public static final em0 h = em0.a("timestamp");
    public static final em0 i = em0.a("traceFile");
    public static final em0 j = em0.a("buildIdMappingForArch");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        g60 g60Var = (g60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.e(b, ((mh) g60Var).a);
        mh mhVar = (mh) g60Var;
        ds1Var.a(c, mhVar.b);
        ds1Var.e(d, mhVar.c);
        ds1Var.e(e, mhVar.d);
        ds1Var.g(f, mhVar.e);
        ds1Var.g(g, mhVar.f);
        ds1Var.g(h, mhVar.g);
        ds1Var.a(i, mhVar.h);
        ds1Var.a(j, mhVar.i);
    }
}
