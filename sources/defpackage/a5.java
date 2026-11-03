package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a5 {
    public final String a;
    public final String b;
    public final String c;
    public final nz1 d;
    public final ArrayList e;

    public a5(String str, String str2, String str3, nz1 nz1Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = nz1Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        if (!this.a.equals(a5Var.a) || !jh2.k(this.b, a5Var.b) || !jh2.k(this.c, a5Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return jh2.k(str, str) && this.d.equals(a5Var.d) && this.e.equals(a5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k93.j(k93.j(k93.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
