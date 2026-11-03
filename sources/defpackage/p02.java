package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class p02 {
    public final String a;

    public p02(String str) {
        this.a = str;
    }

    public final Object a(j62 j62Var) {
        Object obj = j62Var.a.get(this);
        if (obj != null) {
            return obj;
        }
        hu2.q(this.a);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p02.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p02) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wa2.v(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
