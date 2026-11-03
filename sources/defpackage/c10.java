package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class c10 extends cm {
    private final j20 _context;
    private transient a10 intercepted;

    public c10(a10 a10Var) {
        this(a10Var, a10Var != null ? a10Var.getContext() : null);
    }

    public c10(a10 a10Var, j20 j20Var) {
        super(a10Var);
        this._context = j20Var;
    }

    @Override // defpackage.a10
    public j20 getContext() {
        j20 j20Var = this._context;
        j20Var.getClass();
        return j20Var;
    }

    public final a10 intercepted() {
        a10 a10Var = this.intercepted;
        if (a10Var == null) {
            d10 d10Var = (d10) getContext().get(jw0.n);
            if (d10Var == null || (a10Var = d10Var.interceptContinuation(this)) == null) {
                a10Var = this;
            }
            this.intercepted = a10Var;
        }
        return a10Var;
    }

    @Override // defpackage.cm
    public void releaseIntercepted() {
        a10 a10Var = this.intercepted;
        if (a10Var != null && a10Var != this) {
            h20 h20Var = getContext().get(jw0.n);
            h20Var.getClass();
            ((d10) h20Var).releaseInterceptedContinuation(a10Var);
        }
        this.intercepted = px.b;
    }
}
