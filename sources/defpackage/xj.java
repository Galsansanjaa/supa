package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final xk0 f;

    public xj(String str, String str2, String str3, String str4, int i, xk0 xk0Var) {
        if (str == null) {
            hu2.q("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            hu2.q("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            hu2.q("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            hu2.q("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = xk0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xj) {
            xj xjVar = (xj) obj;
            return this.a.equals(xjVar.a) && this.b.equals(xjVar.b) && this.c.equals(xjVar.c) && this.d.equals(xjVar.d) && this.e == xjVar.e && this.f == xjVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
