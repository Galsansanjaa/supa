package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class y64 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c74 b;

    public y64(c74 c74Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c74Var);
                this.b = c74Var;
                return;
            default:
                Objects.requireNonNull(c74Var);
                this.b = c74Var;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c74 c74Var = this.b;
        switch (i) {
            case 0:
                c74Var.o = c74Var.t;
                return;
            default:
                c74Var.t = null;
                return;
        }
    }
}
