package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class g61 implements Iterable, fa1 {
    public final int a;
    public final int b;
    public final int m;

    public g61(int i, int i2, int i3) {
        if (i3 == 0) {
            v5.m("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            v5.m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = kx.x(i, i2, i3);
        this.m = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g61)) {
            return false;
        }
        if (isEmpty() && ((g61) obj).isEmpty()) {
            return true;
        }
        g61 g61Var = (g61) obj;
        return this.a == g61Var.a && this.b == g61Var.b && this.m == g61Var.m;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.m;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.m;
        int i3 = this.a;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h61(this.a, this.b, this.m);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.m;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
