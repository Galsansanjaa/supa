package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fj3 {
    public final String a;
    public final String b;

    public fj3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj3)) {
            return false;
        }
        fj3 fj3Var = (fj3) obj;
        return this.a.equals(fj3Var.a) && this.b.equals(fj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sdks(name=");
        sb.append(this.a);
        sb.append(", use=");
        return lt.z(sb, this.b, ')');
    }
}
