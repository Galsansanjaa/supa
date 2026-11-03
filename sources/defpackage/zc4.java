package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zc4 {
    public final Object a = new Object();
    public final wd4 b = new wd4();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final void a(Executor executor, bt1 bt1Var) {
        this.b.b(new p14(executor, bt1Var));
        q();
    }

    public final void b(ct1 ct1Var) {
        c(vo2.a, ct1Var);
    }

    public final void c(Executor executor, ct1 ct1Var) {
        this.b.b(new p14(executor, ct1Var));
        q();
    }

    public final void d(Executor executor, dt1 dt1Var) {
        this.b.b(new p14(executor, dt1Var));
        q();
    }

    public final zc4 e(Executor executor, b10 b10Var) {
        zc4 zc4Var = new zc4();
        this.b.b(new ox3(executor, b10Var, zc4Var, 0));
        q();
        return zc4Var;
    }

    public final zc4 f(Executor executor, b10 b10Var) {
        zc4 zc4Var = new zc4();
        this.b.b(new ox3(executor, b10Var, zc4Var, 1));
        q();
        return zc4Var;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                dn3.r(this.c, "Task is not yet complete");
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final zc4 k(Executor executor, jn2 jn2Var) {
        zc4 zc4Var = new zc4();
        this.b.b(new p14(executor, jn2Var, zc4Var));
        q();
        return zc4Var;
    }

    public final void l(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.c(this);
    }

    public final boolean m(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.c(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Exception exc) {
        dn3.p(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.c(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        if (this.c) {
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception g = g();
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
