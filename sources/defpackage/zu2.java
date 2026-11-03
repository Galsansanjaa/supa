package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zu2 extends zq0 implements RunnableFuture {
    public volatile yu2 s;

    public zu2(Callable callable) {
        this.s = new yu2(this, callable);
    }

    @Override // defpackage.k0
    public final void b() {
        yu2 yu2Var;
        if (o() && (yu2Var = this.s) != null) {
            s61 s61Var = yu2.o;
            s61 s61Var2 = yu2.n;
            Runnable runnable = (Runnable) yu2Var.get();
            if (runnable instanceof Thread) {
                r61 r61Var = new r61(yu2Var);
                r61Var.a(Thread.currentThread());
                if (yu2Var.compareAndSet(runnable, r61Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) yu2Var.getAndSet(s61Var2)) == s61Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.s = null;
    }

    @Override // defpackage.k0
    public final String i() {
        yu2 yu2Var = this.s;
        if (yu2Var == null) {
            return super.i();
        }
        String valueOf = String.valueOf(yu2Var);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        yu2 yu2Var = this.s;
        if (yu2Var != null) {
            yu2Var.run();
        }
        this.s = null;
    }
}
