package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fi extends q60 {
    public final String a;
    public final String b;
    public final List c;
    public final q60 d;
    public final int e;

    public fi(String str, String str2, List list, q60 q60Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = q60Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q60) {
            fi fiVar = (fi) ((q60) obj);
            if (this.a.equals(fiVar.a)) {
                String str = fiVar.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(fiVar.c)) {
                        q60 q60Var = fiVar.d;
                        q60 q60Var2 = this.d;
                        if (q60Var2 != null ? q60Var2.equals(q60Var) : q60Var == null) {
                            if (this.e == fiVar.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        q60 q60Var = this.d;
        return this.e ^ ((hashCode2 ^ (q60Var != null ? q60Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return lt.A(sb, "}", this.e);
    }
}
