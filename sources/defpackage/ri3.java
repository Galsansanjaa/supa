package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ri3 {
    public final String a;
    public final String b;

    public ri3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri3)) {
            return false;
        }
        ri3 ri3Var = (ri3) obj;
        return jh2.k(this.a, ri3Var.a) && jh2.k(this.b, ri3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnersDisclosureLabels(disclosureLabel=");
        sb.append(this.a);
        sb.append(", backLabel=");
        return lt.z(sb, this.b, ')');
    }
}
