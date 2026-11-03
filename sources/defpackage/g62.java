package defpackage;

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class g62 {
    public final id a;
    public final j20 b;

    public g62(id idVar, j20 j20Var) {
        idVar.getClass();
        j20Var.getClass();
        this.a = idVar;
        this.b = j20Var;
    }

    public final URL a() {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        id idVar = this.a;
        Uri.Builder appendPath2 = appendPath.appendPath(idVar.a).appendPath("settings");
        a5 a5Var = idVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", a5Var.c).appendQueryParameter("display_version", a5Var.b).build().toString());
    }
}
