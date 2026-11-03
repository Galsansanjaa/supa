package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sf implements cs1 {
    public static final sf a = new Object();
    public static final em0 b = em0.a("identifier");
    public static final em0 c = em0.a("version");
    public static final em0 d = em0.a("displayVersion");
    public static final em0 e = em0.a("organization");
    public static final em0 f = em0.a("installationUuid");
    public static final em0 g = em0.a("developmentPlatform");
    public static final em0 h = em0.a("developmentPlatformVersion");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        n60 n60Var = (n60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, ((vh) n60Var).a);
        vh vhVar = (vh) n60Var;
        ds1Var.a(c, vhVar.b);
        ds1Var.a(d, vhVar.c);
        ds1Var.a(e, null);
        ds1Var.a(f, vhVar.d);
        ds1Var.a(g, vhVar.e);
        ds1Var.a(h, vhVar.f);
    }
}
