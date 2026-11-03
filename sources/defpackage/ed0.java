package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ed0 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed0) && this.a == ((ed0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return sg3.r(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
