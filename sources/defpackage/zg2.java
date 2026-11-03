package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zg2 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final ga0 e;
    public final String f;
    public final String g;

    public zg2(String str, String str2, int i, long j, ga0 ga0Var, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = ga0Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return jh2.k(this.a, zg2Var.a) && jh2.k(this.b, zg2Var.b) && this.c == zg2Var.c && this.d == zg2Var.d && this.e.equals(zg2Var.e) && this.f.equals(zg2Var.f) && jh2.k(this.g, zg2Var.g);
    }

    public final int hashCode() {
        int j = (k93.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j2 = this.d;
        return this.g.hashCode() + k93.j((this.e.hashCode() + ((j + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return lt.z(sb, this.g, ')');
    }
}
