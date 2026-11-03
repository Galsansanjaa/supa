package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class cf implements cs1 {
    public static final cf a = new Object();
    public static final em0 b = em0.a("eventTimeMs");
    public static final em0 c = em0.a("eventCode");
    public static final em0 d = em0.a("complianceData");
    public static final em0 e = em0.a("eventUptimeMs");
    public static final em0 f = em0.a("sourceExtension");
    public static final em0 g = em0.a("sourceExtensionJsonProto3");
    public static final em0 h = em0.a("timezoneOffsetSeconds");
    public static final em0 i = em0.a("networkConnectionInfo");
    public static final em0 j = em0.a("experimentIds");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        wf1 wf1Var = (wf1) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.g(b, ((kj) wf1Var).a);
        kj kjVar = (kj) wf1Var;
        ds1Var.a(c, kjVar.b);
        ds1Var.a(d, kjVar.c);
        ds1Var.g(e, kjVar.d);
        ds1Var.a(f, kjVar.e);
        ds1Var.a(g, kjVar.f);
        ds1Var.g(h, kjVar.g);
        ds1Var.a(i, kjVar.h);
        ds1Var.a(j, kjVar.i);
    }
}
