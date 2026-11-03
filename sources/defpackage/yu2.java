package defpackage;

import android.os.UserManager;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yu2 extends AtomicReference implements Runnable {
    public static final s61 n = new s61(0);
    public static final s61 o = new s61(0);
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zu2 b;
    public final Object m;

    public yu2(zu2 zu2Var, Callable callable) {
        this.b = zu2Var;
        callable.getClass();
        this.m = callable;
    }

    public yu2(zu2 zu2Var, xg3 xg3Var) {
        this.b = zu2Var;
        this.m = xg3Var;
    }

    public final Object a() {
        int i = this.a;
        Object obj = this.m;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) obj;
                UserManager userManager = a64.a;
                zu2 zu2Var = new zu2((Callable) xg3Var.b);
                zd0.a.execute(zu2Var);
                ux2.s(zu2Var, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xg3Var);
                return zu2Var;
            default:
                return ((Callable) obj).call();
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        r61 r61Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof r61;
            s61 s61Var = o;
            if (!z2 && runnable != s61Var) {
                break;
            }
            if (z2) {
                r61Var = (r61) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == s61Var || compareAndSet(runnable, s61Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(r61Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isDone;
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            int i = this.a;
            zu2 zu2Var = this.b;
            switch (i) {
                case 0:
                    isDone = zu2Var.isDone();
                    break;
                default:
                    isDone = zu2Var.isDone();
                    break;
            }
            s61 s61Var = n;
            if (!isDone) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, s61Var)) {
                        b(currentThread);
                    }
                    if (isDone) {
                        return;
                    }
                    switch (i) {
                        case 0:
                            zu2Var.l(th);
                            return;
                        default:
                            zu2Var.l(th);
                            return;
                    }
                }
            }
            if (!compareAndSet(currentThread, s61Var)) {
                b(currentThread);
            }
            if (isDone) {
                return;
            }
            switch (i) {
                case 0:
                    zu2Var.m((se1) obj);
                    return;
                default:
                    zu2Var.k(obj);
                    return;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        String obj;
        Runnable runnable = (Runnable) get();
        if (runnable == n) {
            str = "running=[DONE]";
        } else if (runnable instanceof r61) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        int i = this.a;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                obj = ((xg3) obj2).toString();
                break;
            default:
                obj = ((Callable) obj2).toString();
                break;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + str.length() + 2);
        sb2.append(str);
        sb2.append(", ");
        sb2.append(obj);
        return sb2.toString();
    }
}
