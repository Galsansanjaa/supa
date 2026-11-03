package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class di extends u60 {
    public final List a;
    public final q60 b;
    public final g60 c;
    public final l60 d;
    public final gi e;
    public final List f;

    public di(List list, q60 q60Var, g60 g60Var, l60 l60Var, gi giVar, List list2) {
        this.a = list;
        this.b = q60Var;
        this.c = g60Var;
        this.d = l60Var;
        this.e = giVar;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u60)) {
            return false;
        }
        u60 u60Var = (u60) obj;
        List list = this.a;
        if (list == null) {
            if (((di) u60Var).a != null) {
                return false;
            }
        } else if (!list.equals(((di) u60Var).a)) {
            return false;
        }
        q60 q60Var = this.b;
        if (q60Var == null) {
            if (((di) u60Var).b != null) {
                return false;
            }
        } else if (!q60Var.equals(((di) u60Var).b)) {
            return false;
        }
        g60 g60Var = this.c;
        if (g60Var == null) {
            if (((di) u60Var).c != null) {
                return false;
            }
        } else if (!g60Var.equals(((di) u60Var).c)) {
            return false;
        }
        l60 l60Var = this.d;
        if (l60Var == null) {
            if (((di) u60Var).d != null) {
                return false;
            }
        } else if (!l60Var.equals(((di) u60Var).d)) {
            return false;
        }
        di diVar = (di) u60Var;
        return this.e.equals(diVar.e) && this.f.equals(diVar.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        q60 q60Var = this.b;
        int hashCode2 = (hashCode ^ (q60Var == null ? 0 : q60Var.hashCode())) * 1000003;
        g60 g60Var = this.c;
        int hashCode3 = (hashCode2 ^ (g60Var == null ? 0 : g60Var.hashCode())) * 1000003;
        l60 l60Var = this.d;
        return this.f.hashCode() ^ (((((l60Var != null ? l60Var.hashCode() : 0) ^ hashCode3) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }
}
