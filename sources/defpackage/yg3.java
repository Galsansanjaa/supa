package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yg3 extends oh3 {
    public final int a;

    public yg3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg3) && this.a == ((yg3) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return sg3.r(new StringBuilder("Header(titleRes="), this.a, ')');
    }
}
