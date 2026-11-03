package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nv3 extends kv3 {
    public final q12 a;

    public nv3(q12 q12Var) {
        this.a = q12Var;
    }

    @Override // defpackage.kv3
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.kv3
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nv3) {
            return this.a.equals(((nv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return k93.m("Optional.of(", this.a.toString(), ")");
    }
}
