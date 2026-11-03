package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class za1 implements Comparable {
    public static final za1 b = new za1();
    public final int a = 131604;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        za1 za1Var = (za1) obj;
        za1Var.getClass();
        return this.a - za1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        za1 za1Var = obj instanceof za1 ? (za1) obj : null;
        return za1Var != null && this.a == za1Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.20";
    }
}
