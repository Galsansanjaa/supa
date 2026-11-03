package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class t44 extends cn3 {
    public boolean b;

    public t44(t34 t34Var) {
        super(t34Var);
        ((t34) this.a).K++;
    }

    public abstract boolean t();

    public final void u() {
        if (this.b) {
            return;
        }
        hu2.h("Not initialized");
    }

    public final void v() {
        if (this.b) {
            hu2.h("Can't initialize twice");
        } else {
            if (t()) {
                return;
            }
            ((t34) this.a).M.incrementAndGet();
            this.b = true;
        }
    }
}
