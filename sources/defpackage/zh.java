package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zh {
    public long a;
    public String b;
    public w60 c;
    public x60 d;
    public y60 e;
    public b70 f;
    public byte g;

    public final ai a() {
        String str;
        w60 w60Var;
        x60 x60Var;
        if (this.g == 1 && (str = this.b) != null && (w60Var = this.c) != null && (x60Var = this.d) != null) {
            return new ai(this.a, str, w60Var, x60Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        hu2.h(lt.y(sb, "Missing required properties:"));
        return null;
    }
}
