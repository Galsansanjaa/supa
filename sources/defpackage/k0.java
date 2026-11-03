package defpackage;

import androidx.credentials.provider.CredentialEntry;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k0 implements se1 {
    public static final boolean n;
    public static final Logger o;
    public static final dn3 p;
    public static final Object q;
    public volatile Object a;
    public volatile b0 b;
    public volatile j0 m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [dn3] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    static {
        boolean z;
        Throwable th;
        ?? c0Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", CredentialEntry.FALSE_STRING));
        } catch (SecurityException unused) {
            z = false;
        }
        n = z;
        o = Logger.getLogger(k0.class.getName());
        Throwable th2 = null;
        try {
            th = null;
            c0Var = new Object();
        } catch (Throwable th3) {
            th = th3;
            try {
                c0Var = new c0(AtomicReferenceFieldUpdater.newUpdater(j0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j0.class, j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k0.class, j0.class, "m"), AtomicReferenceFieldUpdater.newUpdater(k0.class, b0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "a"));
            } catch (Throwable th4) {
                th2 = th4;
                c0Var = new Object();
            }
        }
        p = c0Var;
        if (th2 != null) {
            Logger logger = o;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        q = new Object();
    }

    public static void d(k0 k0Var) {
        b0 b0Var = null;
        while (true) {
            for (j0 D = p.D(k0Var); D != null; D = D.b) {
                Thread thread = D.a;
                if (thread != null) {
                    D.a = null;
                    LockSupport.unpark(thread);
                }
            }
            k0Var.b();
            b0 b0Var2 = b0Var;
            b0 C = p.C(k0Var);
            b0 b0Var3 = b0Var2;
            while (C != null) {
                b0 b0Var4 = C.c;
                C.c = b0Var3;
                b0Var3 = C;
                C = b0Var4;
            }
            while (b0Var3 != null) {
                b0Var = b0Var3.c;
                Runnable runnable = b0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof d0) {
                    d0 d0Var = (d0) runnable;
                    k0Var = d0Var.a;
                    if (k0Var.a == d0Var) {
                        if (p.g(k0Var, d0Var, g(d0Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = b0Var3.b;
                    Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                b0Var3 = b0Var;
            }
            return;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            o.log(level, sb.toString(), (Throwable) e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof y) {
            Throwable th = ((y) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a0) {
            throw new ExecutionException(((a0) obj).a);
        }
        if (obj == q) {
            return null;
        }
        return obj;
    }

    public static Object g(se1 se1Var) {
        Object obj;
        Throwable n2;
        if (se1Var instanceof f0) {
            Object obj2 = ((k0) se1Var).a;
            if (obj2 instanceof y) {
                y yVar = (y) obj2;
                if (yVar.a) {
                    obj2 = yVar.b != null ? new y(false, yVar.b) : y.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((se1Var instanceof k0) && (n2 = ((k0) se1Var).n()) != null) {
            return new a0(n2);
        }
        boolean isCancelled = se1Var.isCancelled();
        boolean z = true;
        if ((!n) && isCancelled) {
            y yVar2 = y.d;
            Objects.requireNonNull(yVar2);
            return yVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = se1Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (isCancelled) {
                    return new y(false, e);
                }
                String valueOf = String.valueOf(se1Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 77);
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(valueOf);
                return new a0(new IllegalArgumentException(sb.toString(), e));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new a0(e2.getCause());
                }
                String valueOf2 = String.valueOf(se1Var);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new y(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (Throwable th2) {
                return new a0(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? q : obj;
        }
        String valueOf3 = String.valueOf(se1Var);
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 84);
        sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb3.append(valueOf3);
        return new y(false, new IllegalArgumentException(sb3.toString()));
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        c(obj, sb);
        sb.append("]");
    }

    @Override // defpackage.se1
    public void addListener(Runnable runnable, Executor executor) {
        b0 b0Var;
        b0 b0Var2 = b0.d;
        ux2.t(executor, "Executor was null.");
        if (!isDone() && (b0Var = this.b) != b0Var2) {
            b0 b0Var3 = new b0(runnable, executor);
            do {
                b0Var3.c = b0Var;
                if (p.f(this, b0Var, b0Var3)) {
                    return;
                } else {
                    b0Var = this.b;
                }
            } while (b0Var != b0Var2);
        }
        e(runnable, executor);
    }

    public void b() {
    }

    public final void c(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        y yVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof d0)) {
            return false;
        }
        if (n) {
            yVar = new y(z, new CancellationException("Future.cancel() was called."));
        } else {
            yVar = z ? y.c : y.d;
            Objects.requireNonNull(yVar);
        }
        boolean z2 = false;
        while (true) {
            if (p.g(this, obj, yVar)) {
                d(this);
                if (!(obj instanceof d0)) {
                    break;
                }
                se1 se1Var = ((d0) obj).b;
                if (!(se1Var instanceof f0)) {
                    se1Var.cancel(z);
                    break;
                }
                this = (k0) se1Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof d0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof d0)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        j0 j0Var = j0.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) && (!(obj2 instanceof d0))) {
            return f(obj2);
        }
        j0 j0Var2 = this.m;
        if (j0Var2 != j0Var) {
            j0 j0Var3 = new j0();
            do {
                dn3 dn3Var = p;
                dn3Var.O(j0Var3, j0Var2);
                if (dn3Var.h(this, j0Var2, j0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(j0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & (!(obj instanceof d0))));
                    return f(obj);
                }
                j0Var2 = this.m;
            } while (j0Var2 != j0Var);
        }
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        return f(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c6 -> B:34:0x0083). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof y;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof d0)) & (this.a != null);
    }

    public final void j(j0 j0Var) {
        j0Var.a = null;
        while (true) {
            j0 j0Var2 = this.m;
            if (j0Var2 == j0.c) {
                return;
            }
            j0 j0Var3 = null;
            while (j0Var2 != null) {
                j0 j0Var4 = j0Var2.b;
                if (j0Var2.a != null) {
                    j0Var3 = j0Var2;
                } else if (j0Var3 != null) {
                    j0Var3.b = j0Var4;
                    if (j0Var3.a == null) {
                        break;
                    }
                } else if (!p.h(this, j0Var2, j0Var4)) {
                    break;
                }
                j0Var2 = j0Var4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = q;
        }
        if (!p.g(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!p.g(this, null, new a0(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean m(se1 se1Var) {
        a0 a0Var;
        se1Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (se1Var.isDone()) {
                if (p.g(this, null, g(se1Var))) {
                    d(this);
                    return true;
                }
                return false;
            }
            d0 d0Var = new d0(this, se1Var);
            if (p.g(this, null, d0Var)) {
                try {
                    se1Var.addListener(d0Var, zd0.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        a0Var = new a0(th);
                    } catch (Throwable unused) {
                        a0Var = a0.b;
                    }
                    p.g(this, d0Var, a0Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof y) {
            se1Var.cancel(((y) obj).a);
        }
        return false;
    }

    public final Throwable n() {
        if (!(this instanceof f0)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof a0) {
            return ((a0) obj).a;
        }
        return null;
    }

    public final boolean o() {
        Object obj = this.a;
        return (obj instanceof y) && ((y) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r7 = "CANCELLED"
            r0.append(r7)
            goto Le6
        L50:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L5b
            r7.a(r0)
            goto Le6
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r7.a
            boolean r4 = r3 instanceof defpackage.d0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            d0 r3 = (defpackage.d0) r3
            se1 r3 = r3.b
            if (r3 != r7) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Ld6
        L93:
            java.lang.String r3 = r7.i()     // Catch: java.lang.StackOverflowError -> La9 java.lang.RuntimeException -> Lab
            int r4 = defpackage.ix1.a     // Catch: java.lang.StackOverflowError -> La9 java.lang.RuntimeException -> Lab
            if (r3 == 0) goto La4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La9 java.lang.RuntimeException -> Lab
            if (r4 == 0) goto La2
            goto La4
        La2:
            r4 = 0
            goto La5
        La4:
            r4 = 1
        La5:
            if (r4 == 0) goto Lc9
            r3 = 0
            goto Lc9
        La9:
            r3 = move-exception
            goto Lac
        Lab:
            r3 = move-exception
        Lac:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        Lc9:
            if (r3 == 0) goto Ld6
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Ld6:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Le6
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.a(r0)
        Le6:
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.toString():java.lang.String");
    }
}
