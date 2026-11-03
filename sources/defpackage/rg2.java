package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rg2 {
    public static final qg2 Companion = new Object();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ rg2(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            nb0.P(pg2.a.getDescriptor(), i, 15);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public rg2(long j, String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg2)) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return jh2.k(this.a, rg2Var.a) && jh2.k(this.b, rg2Var.b) && this.c == rg2Var.c && this.d == rg2Var.d;
    }

    public final int hashCode() {
        int j = (k93.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j2 = this.d;
        return j + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
