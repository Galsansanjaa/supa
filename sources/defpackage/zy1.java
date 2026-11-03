package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zy1 extends it1 {
    public final Object a;

    public zy1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.it1
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.it1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.it1
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zy1) {
            return this.a.equals(((zy1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
