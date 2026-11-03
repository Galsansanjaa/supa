package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class za {
    public final boolean a;

    public za(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za) && this.a == ((za) obj).a;
    }

    public final int hashCode() {
        return 38161 + (this.a ? 1231 : 1237);
    }

    public final String toString() {
        return "PreRegisterActionData(succeed=true, isAddPreRegisterAction=" + this.a + ")";
    }
}
