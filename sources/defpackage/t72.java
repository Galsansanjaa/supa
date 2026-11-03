package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class t72 {
    public k72 a;
    public e12 b;
    public String d;
    public vv0 e;
    public v72 g;
    public u72 h;
    public u72 i;
    public u72 j;
    public long k;
    public long l;
    public int c = -1;
    public ew0 f = new ew0();

    public static void b(String str, u72 u72Var) {
        if (u72Var.q != null) {
            v5.m(str.concat(".body != null"));
            return;
        }
        if (u72Var.r != null) {
            v5.m(str.concat(".networkResponse != null"));
        } else if (u72Var.s != null) {
            v5.m(str.concat(".cacheResponse != null"));
        } else {
            if (u72Var.t == null) {
                return;
            }
            v5.m(str.concat(".priorResponse != null"));
        }
    }

    public final u72 a() {
        if (this.a == null) {
            hu2.h("request == null");
            return null;
        }
        if (this.b == null) {
            hu2.h("protocol == null");
            return null;
        }
        if (this.c < 0) {
            ak1.k(this.c, "code < 0: ");
            return null;
        }
        if (this.d != null) {
            return new u72(this);
        }
        hu2.h("message == null");
        return null;
    }
}
