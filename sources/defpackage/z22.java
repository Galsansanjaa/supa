package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z22 {
    public final Class a;
    public final Class b;

    public z22(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static z22 a(Class cls) {
        return new z22(y22.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z22.class != obj.getClass()) {
            return false;
        }
        z22 z22Var = (z22) obj;
        if (this.b.equals(z22Var.b)) {
            return this.a.equals(z22Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == y22.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
