package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nj extends bq1 {
    public final aq1 a;
    public final zp1 b;

    public nj(aq1 aq1Var, zp1 zp1Var) {
        this.a = aq1Var;
        this.b = zp1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bq1) {
            bq1 bq1Var = (bq1) obj;
            aq1 aq1Var = this.a;
            if (aq1Var != null ? aq1Var.equals(((nj) bq1Var).a) : ((nj) bq1Var).a == null) {
                zp1 zp1Var = this.b;
                if (zp1Var != null ? zp1Var.equals(((nj) bq1Var).b) : ((nj) bq1Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aq1 aq1Var = this.a;
        int hashCode = ((aq1Var == null ? 0 : aq1Var.hashCode()) ^ 1000003) * 1000003;
        zp1 zp1Var = this.b;
        return hashCode ^ (zp1Var != null ? zp1Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
