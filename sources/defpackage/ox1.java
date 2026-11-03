package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ox1 extends l1 {
    public boolean a;
    public boolean b;
    public rx1 c;
    public String d;
    public float e;

    @Override // defpackage.l1
    public final void a(x93 x93Var, float f) {
        x93Var.getClass();
        this.e = f;
    }

    @Override // defpackage.l1
    public final void b(x93 x93Var, rx1 rx1Var) {
        x93Var.getClass();
        if (rx1Var == rx1.m) {
            this.c = rx1Var;
        }
    }

    @Override // defpackage.l1
    public final void d(x93 x93Var, sx1 sx1Var) {
        x93Var.getClass();
        int ordinal = sx1Var.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                this.b = true;
                return;
            } else if (ordinal != 4) {
                return;
            }
        }
        this.b = false;
    }

    @Override // defpackage.l1
    public final void f(x93 x93Var, String str) {
        x93Var.getClass();
        this.d = str;
    }
}
