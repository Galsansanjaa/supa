package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gl1 extends g0 implements Runnable {
    public final Runnable r;

    public gl1(Runnable runnable) {
        runnable.getClass();
        this.r = runnable;
    }

    @Override // defpackage.k0
    public final String i() {
        String valueOf = String.valueOf(this.r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.r.run();
        } catch (Throwable th) {
            l(th);
            Object obj = sq2.a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            sn0.q(th);
        }
    }
}
