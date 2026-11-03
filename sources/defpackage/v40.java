package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class v40 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(v40.class, "workerCtl$volatile");
    public static final /* synthetic */ long t = zd.a.objectFieldOffset(v40.class.getDeclaredField("workerCtl$volatile"));
    public final d93 a;
    public final z42 b;
    private volatile int indexInArray;
    public w40 m;
    public long n;
    private volatile Object nextParkedWorker;
    public long o;
    public int p;
    public boolean q;
    public final /* synthetic */ x40 r;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [z42, java.lang.Object] */
    public v40(x40 x40Var, int i) {
        this.r = x40Var;
        setDaemon(true);
        setContextClassLoader(x40.class.getClassLoader());
        this.a = new d93();
        this.b = new Object();
        this.m = w40.n;
        this.nextParkedWorker = x40.u;
        int nanoTime = (int) System.nanoTime();
        this.p = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final to2 a(boolean z) {
        to2 e;
        to2 e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        w40 w40Var = this.m;
        x40 x40Var = this.r;
        to2 to2Var = null;
        d93 d93Var = this.a;
        w40 w40Var2 = w40.a;
        if (w40Var != w40Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = x40.s;
            do {
                j = atomicLongFieldUpdater.get(x40Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    d93Var.getClass();
                    long j2 = d93.f;
                    loop1: while (true) {
                        unsafe = zd.a;
                        to2 to2Var2 = (to2) unsafe.getObjectVolatile(d93Var, j2);
                        if (to2Var2 == null || !to2Var2.b) {
                            break;
                        }
                        do {
                            unsafe2 = zd.a;
                            if (unsafe2.compareAndSwapObject(d93Var, d93.f, to2Var2, (Object) null)) {
                                to2Var = to2Var2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(d93Var, j2) == to2Var2);
                    }
                    int intVolatile = unsafe.getIntVolatile(d93Var, d93.e);
                    int intVolatile2 = unsafe.getIntVolatile(d93Var, d93.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || zd.a.getIntVolatile(d93Var, d93.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        to2 d = d93Var.d(intVolatile2, true);
                        if (d != null) {
                            to2Var = d;
                            break;
                        }
                    }
                    if (to2Var != null) {
                        return to2Var;
                    }
                    to2 to2Var3 = (to2) x40Var.p.d();
                    return to2Var3 == null ? i(1) : to2Var3;
                }
            } while (!x40.s.compareAndSet(x40Var, j, j - 4398046511104L));
            this.m = w40Var2;
        }
        if (z) {
            boolean z2 = d(x40Var.a * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            d93Var.getClass();
            to2 to2Var4 = (to2) zd.a(d93.f, d93Var, null);
            if (to2Var4 == null) {
                to2Var4 = d93Var.c();
            }
            if (to2Var4 != null) {
                return to2Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            to2 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.p;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.p = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final to2 e() {
        int d = d(2);
        x40 x40Var = this.r;
        ou0 ou0Var = x40Var.p;
        ou0 ou0Var2 = x40Var.o;
        if (d == 0) {
            to2 to2Var = (to2) ou0Var2.d();
            return to2Var != null ? to2Var : (to2) ou0Var.d();
        }
        to2 to2Var2 = (to2) ou0Var.d();
        return to2Var2 != null ? to2Var2 : (to2) ou0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r.n);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(w40 w40Var) {
        w40 w40Var2 = this.m;
        boolean z = w40Var2 == w40.a;
        if (z) {
            x40.s.addAndGet(this.r, 4398046511104L);
        }
        if (w40Var2 != w40Var) {
            this.m = w40Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.to2 i(int r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.i(int):to2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v40.run():void");
    }
}
