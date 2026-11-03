package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ai extends c70 {
    public final long a;
    public final String b;
    public final w60 c;
    public final x60 d;
    public final y60 e;
    public final b70 f;

    public ai(long j, String str, w60 w60Var, x60 x60Var, y60 y60Var, b70 b70Var) {
        this.a = j;
        this.b = str;
        this.c = w60Var;
        this.d = x60Var;
        this.e = y60Var;
        this.f = b70Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zh] */
    public final zh a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c70) {
            ai aiVar = (ai) ((c70) obj);
            if (this.a == aiVar.a && this.b.equals(aiVar.b) && this.c.equals(aiVar.c) && this.d.equals(aiVar.d)) {
                y60 y60Var = aiVar.e;
                y60 y60Var2 = this.e;
                if (y60Var2 != null ? y60Var2.equals(y60Var) : y60Var == null) {
                    b70 b70Var = aiVar.f;
                    b70 b70Var2 = this.f;
                    if (b70Var2 != null ? b70Var2.equals(b70Var) : b70Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        y60 y60Var = this.e;
        int hashCode2 = (hashCode ^ (y60Var == null ? 0 : y60Var.hashCode())) * 1000003;
        b70 b70Var = this.f;
        return hashCode2 ^ (b70Var != null ? b70Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
