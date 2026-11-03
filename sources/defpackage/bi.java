package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bi {
    public u60 a;
    public List b;
    public List c;
    public Boolean d;
    public v60 e;
    public List f;
    public int g;
    public byte h;

    public final ci a() {
        u60 u60Var;
        if (this.h == 1 && (u60Var = this.a) != null) {
            return new ci(u60Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        hu2.h(lt.y(sb, "Missing required properties:"));
        return null;
    }
}
