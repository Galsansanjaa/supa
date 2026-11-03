package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class th {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public n60 g;
    public e70 h;
    public d70 i;
    public o60 j;
    public List k;
    public int l;
    public byte m;

    public final uh a() {
        String str;
        String str2;
        n60 n60Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (n60Var = this.g) != null) {
            return new uh(str, str2, this.c, this.d, this.e, this.f, n60Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        hu2.h(lt.y(sb, "Missing required properties:"));
        return null;
    }
}
