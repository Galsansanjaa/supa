package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yg2 implements g12 {
    public final /* synthetic */ int a;
    public final g12 b;
    public final g12 m;

    public /* synthetic */ yg2(g12 g12Var, g12 g12Var2, int i) {
        this.a = i;
        this.b = g12Var;
        this.m = g12Var2;
    }

    @Override // defpackage.h12
    public final Object get() {
        int i = this.a;
        g12 g12Var = this.m;
        g12 g12Var2 = this.b;
        switch (i) {
            case 0:
                return new xg2((kr2) g12Var2.get(), (l63) g12Var.get());
            default:
                return new hh2((th2) g12Var2.get(), (th2) g12Var.get());
        }
    }
}
