package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nb3 {
    public final boolean a;
    public final boolean b;

    public nb3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb3)) {
            return false;
        }
        nb3 nb3Var = (nb3) obj;
        return this.a == nb3Var.a && this.b == nb3Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        return "ActionButtonSettings(action1Enabled=" + this.a + ", action2Enabled=" + this.b + ')';
    }
}
