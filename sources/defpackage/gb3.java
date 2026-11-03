package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gb3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ gb3(int i, String str, String str2) {
        this((i & 1) != 0 ? "" : str, "", (i & 4) != 0 ? "" : str2, "");
    }

    public gb3(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb3)) {
            return false;
        }
        gb3 gb3Var = (gb3) obj;
        return jh2.k(this.a, gb3Var.a) && jh2.k(this.b, gb3Var.b) && jh2.k(this.c, gb3Var.c) && jh2.k(this.d, gb3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dn3.b(dn3.b(this.a.hashCode() * 31, this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Banner(title=");
        sb.append(this.a);
        sb.append(", sectionTitle=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", confirm=");
        return lt.z(sb, this.d, ')');
    }
}
