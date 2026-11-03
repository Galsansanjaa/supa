package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class n03 {
    public final boolean a;
    public final boolean b;

    public n03(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        return this.a == n03Var.a && this.b == n03Var.b;
    }

    public final int hashCode() {
        return ((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "DownloadAllButtonData(hasUpdates=" + this.a + ", allCompleted=" + this.b + ")";
    }
}
