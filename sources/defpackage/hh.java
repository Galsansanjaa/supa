package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hh extends tx {
    public final dj a;

    public hh(dj djVar) {
        sx sxVar = sx.a;
        this.a = djVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        if (!this.a.equals(((hh) ((tx) obj)).a)) {
            return false;
        }
        Object obj2 = sx.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ sx.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + sx.a + "}";
    }
}
