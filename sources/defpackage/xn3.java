package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class xn3 {
    public final int a;
    public final se4 b;

    public xn3(se4 se4Var, int i) {
        if (se4Var == null) {
            v5.m("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            v5.m(wa2.u(new StringBuilder(String.valueOf(i).length() + 15), "invalid index: ", i));
            throw null;
        }
        this.a = i;
        this.b = se4Var;
    }

    public abstract void a(id4 id4Var, Object obj);
}
