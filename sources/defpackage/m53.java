package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class m53 {
    public final int a;
    public final int b;

    public m53(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m53)) {
            return false;
        }
        m53 m53Var = (m53) obj;
        return this.a == m53Var.a && this.b == m53Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return lt.x("UserNotifiersData(downloadsCount=", this.a, ", updatesCount=", this.b, ")");
    }
}
