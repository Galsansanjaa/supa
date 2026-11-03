package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bh implements cs1 {
    public static final bh a = new Object();
    public static final em0 b = em0.a("eventType");
    public static final em0 c = em0.a("sessionData");
    public static final em0 d = em0.a("applicationInfo");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        sg2 sg2Var = (sg2) obj;
        ds1 ds1Var = (ds1) obj2;
        sg2Var.getClass();
        ds1Var.a(b, yj0.SESSION_START);
        ds1Var.a(c, sg2Var.a);
        ds1Var.a(d, sg2Var.b);
    }
}
