package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i61 extends g61 implements dw {
    public static final i61 n = new g61(1, 0, 1);

    public final boolean c(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.g61
    public final boolean equals(Object obj) {
        if (!(obj instanceof i61)) {
            return false;
        }
        if (isEmpty() && ((i61) obj).isEmpty()) {
            return true;
        }
        i61 i61Var = (i61) obj;
        return this.a == i61Var.a && this.b == i61Var.b;
    }

    @Override // defpackage.dw
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.dw
    public final Comparable getStart() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.g61
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.g61
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.g61
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
