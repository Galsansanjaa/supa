package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ez1 implements tf2 {
    public final String a;
    public final dz1 b;

    public ez1(String str, dz1 dz1Var) {
        dz1Var.getClass();
        this.a = str;
        this.b = dz1Var;
    }

    public final void a() {
        throw new IllegalStateException(wa2.v(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.tf2
    public final boolean b() {
        return false;
    }

    @Override // defpackage.tf2
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // defpackage.tf2
    public final int d() {
        return 0;
    }

    @Override // defpackage.tf2
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return this.a.equals(ez1Var.a) && jh2.k(this.b, ez1Var.b);
    }

    @Override // defpackage.tf2
    public final List f(int i) {
        a();
        throw null;
    }

    @Override // defpackage.tf2
    public final tf2 g(int i) {
        a();
        throw null;
    }

    @Override // defpackage.tf2
    public final List getAnnotations() {
        return oi0.a;
    }

    @Override // defpackage.tf2
    public final nb0 getKind() {
        return this.b;
    }

    @Override // defpackage.tf2
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.tf2
    public final boolean i(int i) {
        a();
        throw null;
    }

    @Override // defpackage.tf2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return lt.z(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
