package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class y90 {
    public final z22 a;
    public final boolean b;

    public y90(z22 z22Var, boolean z) {
        this.a = z22Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y90) {
            y90 y90Var = (y90) obj;
            if (y90Var.a.equals(this.a) && y90Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
