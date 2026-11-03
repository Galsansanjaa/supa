package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yg implements cs1 {
    public static final yg a = new Object();
    public static final em0 b = em0.a("appId");
    public static final em0 c = em0.a("deviceModel");
    public static final em0 d = em0.a("sessionSdkVersion");
    public static final em0 e = em0.a("osVersion");
    public static final em0 f = em0.a("logEnvironment");
    public static final em0 g = em0.a("androidAppInfo");

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        id idVar = (id) obj;
        ds1 ds1Var = (ds1) obj2;
        ds1Var.a(b, idVar.a);
        ds1Var.a(c, Build.MODEL);
        ds1Var.a(d, "3.0.7");
        ds1Var.a(e, Build.VERSION.RELEASE);
        ds1Var.a(f, vf1.LOG_ENVIRONMENT_PROD);
        ds1Var.a(g, idVar.b);
    }
}
