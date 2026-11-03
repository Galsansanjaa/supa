package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xy0 implements Closeable {
    public static final ThreadPoolExecutor E;
    public final Socket A;
    public final ez0 B;
    public final vy0 C;
    public final LinkedHashSet D;
    public final boolean a;
    public final ty0 b;
    public final String n;
    public int o;
    public int p;
    public boolean q;
    public final ScheduledThreadPoolExecutor r;
    public final ThreadPoolExecutor s;
    public final jw0 t;
    public boolean u;
    public long w;
    public final zo x;
    public final zo y;
    public boolean z;
    public final LinkedHashMap m = new LinkedHashMap();
    public long v = 0;

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = f63.a;
        E = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new e63("OkHttp Http2Connection", true));
    }

    public xy0(ry0 ry0Var) {
        zo zoVar = new zo(5);
        this.x = zoVar;
        zo zoVar2 = new zo(5);
        this.y = zoVar2;
        this.z = false;
        this.D = new LinkedHashSet();
        this.t = jw0.D;
        boolean z = ry0Var.a;
        this.a = z;
        this.b = (ty0) ry0Var.p;
        int i = z ? 1 : 2;
        this.p = i;
        if (z) {
            this.p = i + 2;
        }
        if (z) {
            zoVar.h(7, 16777216);
        }
        String str = (String) ry0Var.m;
        this.n = str;
        byte[] bArr = f63.a;
        Locale locale = Locale.US;
        this.r = new ScheduledThreadPoolExecutor(1, new e63(k93.m("OkHttp ", str, " Writer"), false));
        this.s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e63(k93.m("OkHttp ", str, " Push Observer"), true));
        zoVar2.h(7, 65535);
        zoVar2.h(5, 16384);
        this.w = zoVar2.b();
        this.A = (Socket) ry0Var.b;
        this.B = new ez0((y32) ry0Var.o, z);
        this.C = new vy0(this, new zy0((z32) ry0Var.n, z));
    }

    public final void a(int i, int i2) {
        dz0[] dz0VarArr = null;
        try {
            j(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            try {
                if (!this.m.isEmpty()) {
                    dz0VarArr = (dz0[]) this.m.values().toArray(new dz0[this.m.size()]);
                    this.m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dz0VarArr != null) {
            for (dz0 dz0Var : dz0VarArr) {
                try {
                    dz0Var.c(i2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.A.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.r.shutdown();
        this.s.shutdown();
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 6);
    }

    public final synchronized dz0 d(int i) {
        return (dz0) this.m.get(Integer.valueOf(i));
    }

    public final synchronized int e() {
        zo zoVar;
        zoVar = this.y;
        return (zoVar.b & 16) != 0 ? ((int[]) zoVar.c)[4] : Integer.MAX_VALUE;
    }

    public final void flush() {
        this.B.flush();
    }

    public final synchronized dz0 g(int i) {
        dz0 dz0Var;
        dz0Var = (dz0) this.m.remove(Integer.valueOf(i));
        notifyAll();
        return dz0Var;
    }

    public final void j(int i) {
        synchronized (this.B) {
            synchronized (this) {
                if (this.q) {
                    return;
                }
                this.q = true;
                this.B.g(this.o, i, f63.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.B.n);
        r6 = r2;
        r8.w -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r9, boolean r10, defpackage.tq r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            ez0 r8 = r8.B
            r8.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L5e
            monitor-enter(r8)
        L12:
            long r4 = r8.w     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.m     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L5c
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            ez0 r4 = r8.B     // Catch: java.lang.Throwable -> L28
            int r4 = r4.n     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.w     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.w = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            ez0 r4 = r8.B
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L56:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy0.l(int, boolean, tq, long):void");
    }

    public final void m(int i, int i2) {
        try {
            this.r.execute(new ny0(this, new Object[]{this.n, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void n(int i, long j) {
        try {
            this.r.execute(new oy0(this, new Object[]{this.n, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }
}
