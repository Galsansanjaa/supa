package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class g64 {
    public final Context a;
    public final mn2 b;

    public g64(Context context, mn2 mn2Var) {
        this.a = context;
        this.b = mn2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g64)) {
            return false;
        }
        g64 g64Var = (g64) obj;
        if (!this.a.equals(g64Var.a)) {
            return false;
        }
        mn2 mn2Var = g64Var.b;
        mn2 mn2Var2 = this.b;
        return mn2Var2 == null ? mn2Var == null : mn2Var2.equals(mn2Var);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        mn2 mn2Var = this.b;
        return (mn2Var == null ? 0 : mn2Var.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        lt.L(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
