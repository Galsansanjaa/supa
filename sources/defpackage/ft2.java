package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ft2 {
    public final is2 a;
    public final boolean b;

    public ft2(is2 is2Var, boolean z) {
        this.a = is2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft2) {
            ft2 ft2Var = (ft2) obj;
            if (this.a == ft2Var.a && this.b == ft2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "TopByCategoryData(topByCategory=" + this.a + ", firstRequest=" + this.b + ")";
    }
}
