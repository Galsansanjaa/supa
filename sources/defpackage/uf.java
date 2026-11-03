package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uf implements cs1 {
    public static final uf a = new Object();
    public static final em0 b = em0.a("arch");
    public static final em0 c = em0.a("model");
    public static final em0 d = em0.a("cores");
    public static final em0 e = em0.a("ram");
    public static final em0 f = em0.a("diskSpace");
    public static final em0 g = em0.a("simulator");
    public static final em0 h = em0.a("state");
    public static final em0 i = em0.a("manufacturer");
    public static final em0 j = em0.a("modelClass");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        o60 o60Var = (o60) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.e(b, ((yh) o60Var).a);
        yh yhVar = (yh) o60Var;
        ds1Var.a(c, yhVar.b);
        ds1Var.e(d, yhVar.c);
        ds1Var.g(e, yhVar.d);
        ds1Var.g(f, yhVar.e);
        ds1Var.d(g, yhVar.f);
        ds1Var.e(h, yhVar.g);
        ds1Var.a(i, yhVar.h);
        ds1Var.a(j, yhVar.i);
    }
}
