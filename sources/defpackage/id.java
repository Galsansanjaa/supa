package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class id {
    public final String a;
    public final a5 b;

    public id(String str, a5 a5Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = a5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        id idVar = (id) obj;
        if (!jh2.k(this.a, idVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!jh2.k(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return jh2.k(str2, str2) && this.b.equals(idVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((vf1.LOG_ENVIRONMENT_PROD.hashCode() + k93.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517566) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + vf1.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
