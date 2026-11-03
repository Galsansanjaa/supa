package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jc3 {
    public final String a;

    public jc3() {
        this.a = "";
    }

    public jc3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc3) && this.a.equals(((jc3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lt.z(new StringBuilder("CCPAPortalConfig(uspLspact="), this.a, ')');
    }
}
