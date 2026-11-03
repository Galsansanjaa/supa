package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xg implements cs1 {
    public static final xg a = new Object();
    public static final em0 b = em0.a("packageName");
    public static final em0 c = em0.a("versionName");
    public static final em0 d = em0.a("appBuildVersion");
    public static final em0 e = em0.a("deviceManufacturer");
    public static final em0 f = em0.a("currentProcessDetails");
    public static final em0 g = em0.a("appProcessDetails");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        a5 a5Var = (a5) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, a5Var.a);
        ds1Var.a(c, a5Var.b);
        ds1Var.a(d, a5Var.c);
        ds1Var.a(e, Build.MANUFACTURER);
        ds1Var.a(f, a5Var.d);
        ds1Var.a(g, a5Var.e);
    }
}
