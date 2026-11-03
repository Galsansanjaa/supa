package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class nq2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static pj0 a() {
        ThreadLocal threadLocal = a;
        pj0 pj0Var = (pj0) threadLocal.get();
        if (pj0Var != null) {
            return pj0Var;
        }
        kp kpVar = new kp(Thread.currentThread());
        threadLocal.set(kpVar);
        return kpVar;
    }
}
