package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class c82 extends b82 implements ct0 {
    private final int arity;

    public c82(int i, a10 a10Var) {
        super(a10Var);
        this.arity = i;
    }

    @Override // defpackage.ct0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.cm
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        a52.a.getClass();
        return b52.a(this);
    }
}
