package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sm1 extends hf2 implements nm1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(sm1.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long t = zd.a.objectFieldOffset(sm1.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public sm1() {
        super(1);
        this.owner$volatile = ux2.b;
        new x7(this, 4);
    }

    @Override // defpackage.nm1
    public final pe2 getOnLock() {
        ux2.m(3, qm1.a);
        ux2.m(3, rm1.a);
        return new r82(2);
    }

    @Override // defpackage.nm1
    public final boolean holdsLock(Object obj) {
        char c;
        while (true) {
            if (!isLocked()) {
                c = 0;
                break;
            }
            Object objectVolatile = zd.a.getObjectVolatile(this, t);
            if (objectVolatile != ux2.b) {
                c = objectVolatile == obj ? (char) 1 : (char) 2;
            }
        }
        return c == 1;
    }

    @Override // defpackage.nm1
    public final boolean isLocked() {
        return Math.max(zd.a.getIntVolatile(this, hf2.p), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.p(r1, r3.b);
     */
    @Override // defpackage.nm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lock(java.lang.Object r4, defpackage.a10 r5) {
        /*
            r3 = this;
            boolean r0 = r3.tryLock(r4)
            vy2 r1 = defpackage.vy2.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            a10 r5 = defpackage.m60.u(r5)
            qs r5 = defpackage.jh2.C(r5)
            om1 r0 = new om1     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.hf2.o     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L3c
            int r2 = r3.a     // Catch: java.lang.Throwable -> L3c
            if (r4 > r2) goto L16
            if (r4 <= 0) goto L28
            x7 r3 = r3.b     // Catch: java.lang.Throwable -> L3c
            r0.p(r1, r3)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r4 = r3.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L16
        L2e:
            java.lang.Object r3 = r5.s()
            e50 r4 = defpackage.e50.a
            if (r3 != r4) goto L37
            goto L38
        L37:
            r3 = r1
        L38:
            if (r3 != r4) goto L3b
            return r3
        L3b:
            return r1
        L3c:
            r3 = move-exception
            r5.A()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm1.lock(java.lang.Object, a10):java.lang.Object");
    }

    public final String toString() {
        return "Mutex@" + nb0.u(this) + "[isLocked=" + isLocked() + ",owner=" + zd.a.getObjectVolatile(this, t) + ']';
    }

    @Override // defpackage.nm1
    public final boolean tryLock(Object obj) {
        sm1 sm1Var;
        char c;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = hf2.p;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = zd.a;
                    long j2 = hf2.p;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.a;
                    if (intVolatile2 <= i) {
                        sm1Var = this;
                        break;
                    }
                    sm1 sm1Var2 = this;
                    sm1Var = sm1Var2;
                    if (unsafe2.compareAndSwapInt(sm1Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = sm1Var;
                }
            } else {
                sm1Var = this;
                long j3 = t;
                if (intVolatile <= 0) {
                    if (obj == null) {
                        break;
                    }
                    while (true) {
                        if (!sm1Var.isLocked()) {
                            c = 0;
                            break;
                        }
                        Object objectVolatile = zd.a.getObjectVolatile(sm1Var, j3);
                        if (objectVolatile != ux2.b) {
                            c = objectVolatile == obj ? (char) 1 : (char) 2;
                        }
                    }
                    if (c == 1) {
                        f31.d(obj, "This mutex is already locked by the specified owner: ");
                        return false;
                    }
                    if (c == 2) {
                        break;
                    }
                } else if (unsafe.compareAndSwapInt(sm1Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(sm1Var, j3, obj);
                    return true;
                }
            }
            this = sm1Var;
        }
        return false;
    }

    @Override // defpackage.nm1
    public final void unlock(Object obj) {
        while (this.isLocked()) {
            Unsafe unsafe = zd.a;
            long j = t;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            sa4 sa4Var = ux2.b;
            if (objectVolatile != sa4Var) {
                if (objectVolatile != obj && obj != null) {
                    ak1.r("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    sm1 sm1Var = this;
                    if (zd.a.compareAndSwapObject(sm1Var, t, objectVolatile, sa4Var)) {
                        sm1Var.b();
                        return;
                    } else {
                        if (zd.a.getObjectVolatile(sm1Var, j) != objectVolatile) {
                            this = sm1Var;
                            break;
                        }
                        this = sm1Var;
                    }
                }
            }
        }
        hu2.h("This mutex is not locked");
    }
}
