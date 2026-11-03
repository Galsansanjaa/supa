package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sj extends z92 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public sj(long j, String str, String str2, String str3, String str4) {
        if (str == null) {
            hu2.q("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            hu2.q("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            hu2.q("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z92)) {
            return false;
        }
        sj sjVar = (sj) ((z92) obj);
        return this.b.equals(sjVar.b) && this.c.equals(sjVar.c) && this.d.equals(sjVar.d) && this.e.equals(sjVar.e) && this.f == sjVar.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return vg1.C(this.f, "}", sb);
    }
}
