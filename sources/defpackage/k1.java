package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k1 extends zq0 implements Runnable {
    public static final /* synthetic */ int u = 0;
    public se1 s;
    public Object t;

    public k1(se1 se1Var, Object obj) {
        se1Var.getClass();
        this.s = se1Var;
        this.t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [k1, zq0, i1, java.lang.Runnable] */
    public static i1 p(se1 se1Var, ce ceVar, Executor executor) {
        executor.getClass();
        ?? k1Var = new k1(se1Var, ceVar);
        se1Var.addListener(k1Var, ej1.H(executor, k1Var));
        return k1Var;
    }

    @Override // defpackage.k0
    public final void b() {
        se1 se1Var = this.s;
        if ((se1Var != null) & (this.a instanceof y)) {
            se1Var.cancel(o());
        }
        this.s = null;
        this.t = null;
    }

    @Override // defpackage.k0
    public final String i() {
        String str;
        se1 se1Var = this.s;
        Object obj = this.t;
        String i = super.i();
        if (se1Var != null) {
            String valueOf = String.valueOf(se1Var);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj == null) {
            if (i != null) {
                return i.length() != 0 ? str.concat(i) : new String(str);
            }
            return null;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + str.length() + 11);
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        se1 se1Var = this.s;
        Object obj = this.t;
        if (((this.a instanceof y) | (se1Var == null)) || (obj == null)) {
            return;
        }
        this.s = null;
        if (se1Var.isCancelled()) {
            m(se1Var);
            return;
        }
        try {
            try {
                Object q = q(obj, xu3.n(se1Var));
                this.t = null;
                r(q);
            } catch (Throwable th) {
                try {
                    l(th);
                } finally {
                    this.t = null;
                }
            }
        } catch (Error e) {
            l(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            l(e2);
        } catch (ExecutionException e3) {
            l(e3.getCause());
        }
    }
}
