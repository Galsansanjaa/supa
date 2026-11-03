package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class qe1 implements tf2 {
    public final tf2 a;

    public qe1(tf2 tf2Var) {
        this.a = tf2Var;
    }

    @Override // defpackage.tf2
    public final boolean b() {
        return false;
    }

    @Override // defpackage.tf2
    public final int c(String str) {
        str.getClass();
        Integer j0 = bn2.j0(10, str);
        if (j0 != null) {
            return j0.intValue();
        }
        v5.m(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.tf2
    public final int d() {
        return 1;
    }

    @Override // defpackage.tf2
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        qe1 qe1Var = (qe1) obj;
        return jh2.k(this.a, qe1Var.a) && jh2.k(h(), qe1Var.h());
    }

    @Override // defpackage.tf2
    public final List f(int i) {
        if (i >= 0) {
            return oi0.a;
        }
        StringBuilder w = wa2.w(i, "Illegal index ", ", ");
        w.append(h());
        w.append(" expects only non-negative indices");
        throw new IllegalArgumentException(w.toString().toString());
    }

    @Override // defpackage.tf2
    public final tf2 g(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder w = wa2.w(i, "Illegal index ", ", ");
        w.append(h());
        w.append(" expects only non-negative indices");
        throw new IllegalArgumentException(w.toString().toString());
    }

    @Override // defpackage.tf2
    public final List getAnnotations() {
        return oi0.a;
    }

    @Override // defpackage.tf2
    public final nb0 getKind() {
        return dn2.m;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tf2
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder w = wa2.w(i, "Illegal index ", ", ");
        w.append(h());
        w.append(" expects only non-negative indices");
        throw new IllegalArgumentException(w.toString().toString());
    }

    @Override // defpackage.tf2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
