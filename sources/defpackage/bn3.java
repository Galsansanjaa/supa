package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bn3 {
    public final String a;

    public bn3(String str) {
        ao3 ao3Var = ao3.b;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bn3)) {
            return false;
        }
        ao3 ao3Var = ao3.b;
        return this.a.equals(((bn3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ao3.b.hashCode();
    }
}
