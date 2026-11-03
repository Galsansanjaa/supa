package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c03 {
    public final r7 a;
    public final gz2 b;

    public c03(r7 r7Var, gz2 gz2Var) {
        this.a = r7Var;
        this.b = gz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c03)) {
            return false;
        }
        c03 c03Var = (c03) obj;
        return this.a == c03Var.a && this.b == c03Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppUpdateData(app=" + this.a + ", update=" + this.b + ")";
    }
}
