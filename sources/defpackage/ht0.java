package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ht0 extends g0 implements Runnable {
    public se1 r;

    @Override // defpackage.k0
    public final void b() {
        this.r = null;
    }

    @Override // defpackage.k0
    public final String i() {
        se1 se1Var = this.r;
        if (se1Var == null) {
            return null;
        }
        String valueOf = String.valueOf(se1Var);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        se1 se1Var = this.r;
        if (se1Var != null) {
            m(se1Var);
        }
    }
}
