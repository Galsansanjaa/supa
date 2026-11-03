package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class k72 {
    public final jz0 a;
    public final String b;
    public final fw0 c;
    public final Object d;
    public volatile zr e;

    public k72(hg2 hg2Var) {
        this.a = (jz0) hg2Var.m;
        this.b = (String) hg2Var.b;
        ew0 ew0Var = (ew0) hg2Var.n;
        ew0Var.getClass();
        this.c = new fw0(ew0Var);
        Object obj = hg2Var.o;
        this.d = obj == null ? this : obj;
    }

    public final hg2 a() {
        hg2 hg2Var = new hg2(false);
        hg2Var.m = this.a;
        hg2Var.b = this.b;
        hg2Var.o = this.d;
        hg2Var.n = this.c.c();
        return hg2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tag=");
        Object obj = this.d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
