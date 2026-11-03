package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bj0 {
    public final String a;

    public bj0(String str) {
        if (str != null) {
            this.a = str;
        } else {
            hu2.q("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0)) {
            return false;
        }
        return this.a.equals(((bj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wa2.v(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
