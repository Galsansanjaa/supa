package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bb {
    public final boolean a;
    public final int b;

    public bb(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b == bbVar.b;
    }

    public final int hashCode() {
        return ((this.a ? 1231 : 1237) * 31) + this.b;
    }

    public final String toString() {
        return "SendReviewActionData(succeed=" + this.a + ", statusCode=" + this.b + ")";
    }
}
