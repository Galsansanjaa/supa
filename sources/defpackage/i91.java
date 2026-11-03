package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i91 extends s81 {
    public final be1 a;

    public i91() {
        xd1 xd1Var = be1.s;
        this.a = new be1(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i91) && ((i91) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
