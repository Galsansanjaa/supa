package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pb3 {
    public final String a;
    public final long b;

    public pb3(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb3)) {
            return false;
        }
        pb3 pb3Var = (pb3) obj;
        return this.a.equals(pb3Var.a) && this.b == pb3Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        return "ApiResponse(body=" + this.a + ", timestamp=" + this.b + ')';
    }
}
