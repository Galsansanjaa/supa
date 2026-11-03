package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qi extends a70 {
    public final z60 a;
    public final String b;
    public final String c;
    public final long d;

    public qi(ri riVar, String str, String str2, long j) {
        this.a = riVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a70) {
            qi qiVar = (qi) ((a70) obj);
            if (this.a.equals(qiVar.a) && this.b.equals(qiVar.b) && this.c.equals(qiVar.c) && this.d == qiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return vg1.C(this.d, "}", sb);
    }
}
