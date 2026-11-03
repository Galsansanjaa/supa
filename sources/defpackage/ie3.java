package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ie3 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public ie3(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return this.a.equals(ie3Var.a) && this.b.equals(ie3Var.b) && this.c.equals(ie3Var.c) && this.d.equals(ie3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Features(visitEvents=" + this.a + ", advancedCustomizations=" + this.b + ", consentOrPay=" + this.c + ", themeCustomizations=" + this.d + ')';
    }
}
