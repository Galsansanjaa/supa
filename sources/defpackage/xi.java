package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xi {
    public final Object a;
    public final gz1 b;
    public final rj c;

    public xi(Object obj, gz1 gz1Var, rj rjVar) {
        this.a = obj;
        this.b = gz1Var;
        this.c = rjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        if (!this.a.equals(xiVar.a) || !this.b.equals(xiVar.b)) {
            return false;
        }
        rj rjVar = xiVar.c;
        rj rjVar2 = this.c;
        return rjVar2 == null ? rjVar == null : rjVar2.equals(rjVar);
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        rj rjVar = this.c;
        return ((rjVar == null ? 0 : rjVar.hashCode()) ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
