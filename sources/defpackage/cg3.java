package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class cg3 {
    public final ue3 a;
    public Boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Integer g;

    public cg3(ue3 ue3Var, Boolean bool, int i, int i2, String str, Integer num, int i3) {
        ue3Var = (i3 & 1) != 0 ? new ue3() : ue3Var;
        bool = (i3 & 2) != 0 ? null : bool;
        i = (i3 & 4) != 0 ? 1 : i;
        i2 = (i3 & 8) != 0 ? 1 : i2;
        boolean z = (i3 & 16) != 0;
        str = (i3 & 32) != 0 ? "" : str;
        num = (i3 & 64) != 0 ? null : num;
        ue3Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        str.getClass();
        this.a = ue3Var;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = str;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg3)) {
            return false;
        }
        cg3 cg3Var = (cg3) obj;
        return this.a.equals(cg3Var.a) && jh2.k(this.b, cg3Var.b) && this.c == cg3Var.c && this.d == cg3Var.d && this.e == cg3Var.e && this.f.equals(cg3Var.f) && jh2.k(this.g, cg3Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int E = (sg3.E(this.d) + ((sg3.E(this.c) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int j = k93.j((E + i) * 31, 31, this.f);
        Integer num = this.g;
        return j + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchItemData(value=");
        sb.append(this.a);
        sb.append(", selectedState=");
        sb.append(this.b);
        sb.append(", viewType=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NON_SWITCH" : "LABEL" : "DESCRIPTION" : "NORMAL");
        sb.append(", itemType=");
        sb.append(k93.q(this.d));
        sb.append(", isTagEnabled=");
        sb.append(this.e);
        sb.append(", text=");
        sb.append(this.f);
        sb.append(", counter=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
