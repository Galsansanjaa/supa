package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wu2 implements Serializable {
    public final Object a;
    public final Object b;
    public final Object m;

    public wu2(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.m = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu2)) {
            return false;
        }
        wu2 wu2Var = (wu2) obj;
        return jh2.k(this.a, wu2Var.a) && jh2.k(this.b, wu2Var.b) && jh2.k(this.m, wu2Var.m);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.m;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.m + ')';
    }
}
