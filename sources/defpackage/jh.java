package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jh extends g70 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final f70 k;
    public final j60 l;
    public final g60 m;

    public jh(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, f70 f70Var, j60 j60Var, g60 g60Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = f70Var;
        this.l = j60Var;
        this.m = g60Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ih] */
    public final ih a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.e;
        obj.e = this.f;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g70) {
            jh jhVar = (jh) ((g70) obj);
            if (this.b.equals(jhVar.b) && this.c.equals(jhVar.c) && this.d == jhVar.d && this.e.equals(jhVar.e)) {
                String str = jhVar.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = jhVar.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = jhVar.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(jhVar.i) && this.j.equals(jhVar.j)) {
                                f70 f70Var = jhVar.k;
                                f70 f70Var2 = this.k;
                                if (f70Var2 != null ? f70Var2.equals(f70Var) : f70Var == null) {
                                    j60 j60Var = jhVar.l;
                                    j60 j60Var2 = this.l;
                                    if (j60Var2 != null ? j60Var2.equals(j60Var) : j60Var == null) {
                                        g60 g60Var = jhVar.m;
                                        g60 g60Var2 = this.m;
                                        if (g60Var2 != null ? g60Var2.equals(g60Var) : g60Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        f70 f70Var = this.k;
        int hashCode5 = (hashCode4 ^ (f70Var == null ? 0 : f70Var.hashCode())) * 1000003;
        j60 j60Var = this.l;
        int hashCode6 = (hashCode5 ^ (j60Var == null ? 0 : j60Var.hashCode())) * 1000003;
        g60 g60Var = this.m;
        return hashCode6 ^ (g60Var != null ? g60Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
