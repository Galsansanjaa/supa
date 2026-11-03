package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gc3 {
    public final Integer a;
    public final gb3 b;

    public gc3(Integer num, gb3 gb3Var) {
        this.a = num;
        this.b = gb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc3)) {
            return false;
        }
        gc3 gc3Var = (gc3) obj;
        return this.a.equals(gc3Var.a) && this.b.equals(gc3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GBCPurpose(id=" + this.a + ", banner=" + this.b + ')';
    }
}
