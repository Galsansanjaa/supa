package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class hf2 {
    public static final /* synthetic */ AtomicLongFieldUpdater m;
    public static final /* synthetic */ AtomicLongFieldUpdater n;
    public static final /* synthetic */ AtomicIntegerFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final x7 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = zd.a;
        q = unsafe.objectFieldOffset(hf2.class.getDeclaredField("head$volatile"));
        m = AtomicLongFieldUpdater.newUpdater(hf2.class, "deqIdx$volatile");
        r = unsafe.objectFieldOffset(hf2.class.getDeclaredField("tail$volatile"));
        n = AtomicLongFieldUpdater.newUpdater(hf2.class, "enqIdx$volatile");
        o = AtomicIntegerFieldUpdater.newUpdater(hf2.class, "_availablePermits$volatile");
        p = unsafe.objectFieldOffset(hf2.class.getDeclaredField("_availablePermits$volatile"));
    }

    public hf2(int i) {
        this.a = i;
        if (i <= 0) {
            qq.j(lt.w(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            qq.j(lt.w(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        kf2 kf2Var = new kf2(0L, null, 2);
        this.head$volatile = kf2Var;
        this.tail$volatile = kf2Var;
        this._availablePermits$volatile = i;
        this.b = new x7(this, 6);
    }

    public final boolean a(x73 x73Var) {
        Object l;
        Unsafe unsafe;
        hf2 hf2Var = this;
        Unsafe unsafe2 = zd.a;
        long j = r;
        kf2 kf2Var = (kf2) unsafe2.getObjectVolatile(hf2Var, j);
        long andIncrement = n.getAndIncrement(hf2Var);
        ff2 ff2Var = ff2.a;
        long j2 = andIncrement / jf2.f;
        loop0: while (true) {
            l = t61.l(kf2Var, j2, ff2Var);
            if (kx.C(l)) {
                break;
            }
            je2 z = kx.z(l);
            while (true) {
                je2 je2Var = (je2) zd.a.getObjectVolatile(hf2Var, j);
                if (je2Var.d >= z.d) {
                    hf2Var = this;
                    break loop0;
                }
                if (!z.j()) {
                    break;
                }
                do {
                    unsafe = zd.a;
                    hf2Var = this;
                    if (unsafe.compareAndSwapObject(hf2Var, r, je2Var, z)) {
                        if (je2Var.f()) {
                            je2Var.e();
                        }
                    }
                } while (unsafe.getObjectVolatile(hf2Var, j) == je2Var);
                if (z.f()) {
                    z.e();
                }
            }
            hf2Var = this;
        }
        kf2 kf2Var2 = (kf2) kx.z(l);
        AtomicReferenceArray atomicReferenceArray = kf2Var2.g;
        int i = (int) (andIncrement % jf2.f);
        while (!atomicReferenceArray.compareAndSet(i, null, x73Var)) {
            if (atomicReferenceArray.get(i) != null) {
                sa4 sa4Var = jf2.b;
                sa4 sa4Var2 = jf2.c;
                while (!atomicReferenceArray.compareAndSet(i, sa4Var, sa4Var2)) {
                    if (atomicReferenceArray.get(i) != sa4Var) {
                        return false;
                    }
                }
                boolean z2 = x73Var instanceof os;
                vy2 vy2Var = vy2.a;
                if (z2) {
                    ((os) x73Var).p(vy2Var, hf2Var.b);
                    return true;
                }
                if (x73Var instanceof pm1) {
                    ((pm1) x73Var).b(vy2Var);
                    return true;
                }
                f31.k(x73Var, "unexpected: ");
                return false;
            }
        }
        x73Var.a(kf2Var2, i);
        return true;
    }

    public final void b() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object l;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = o.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    unsafe = zd.a;
                    j = p;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.a;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                z72.g(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = zd.a;
            long j2 = q;
            kf2 kf2Var = (kf2) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = m.getAndIncrement(this);
            long j3 = andIncrement2 / jf2.f;
            gf2 gf2Var = gf2.a;
            while (true) {
                l = t61.l(kf2Var, j3, gf2Var);
                if (kx.C(l)) {
                    break;
                }
                je2 z2 = kx.z(l);
                while (true) {
                    je2 je2Var = (je2) zd.a.getObjectVolatile(this, j2);
                    if (je2Var.d >= z2.d) {
                        break;
                    }
                    if (!z2.j()) {
                        break;
                    }
                    do {
                        unsafe2 = zd.a;
                        if (unsafe2.compareAndSwapObject(this, q, je2Var, z2)) {
                            if (je2Var.f()) {
                                je2Var.e();
                            }
                        }
                    } while (unsafe2.getObjectVolatile(this, j2) == je2Var);
                    if (z2.f()) {
                        z2.e();
                    }
                }
            }
            kf2 kf2Var2 = (kf2) kx.z(l);
            AtomicReferenceArray atomicReferenceArray = kf2Var2.g;
            kf2Var2.b();
            z = false;
            if (kf2Var2.d <= j3) {
                int i3 = (int) (andIncrement2 % jf2.f);
                Object andSet = atomicReferenceArray.getAndSet(i3, jf2.b);
                if (andSet == null) {
                    int i4 = jf2.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == jf2.c) {
                            z = true;
                            break;
                        }
                    }
                    sa4 sa4Var = jf2.b;
                    sa4 sa4Var2 = jf2.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, sa4Var, sa4Var2)) {
                            if (atomicReferenceArray.get(i3) != sa4Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != jf2.e) {
                    boolean z3 = andSet instanceof os;
                    vy2 vy2Var = vy2.a;
                    if (z3) {
                        os osVar = (os) andSet;
                        sa4 c = osVar.c(vy2Var, this.b);
                        if (c != null) {
                            osVar.r(c);
                            z = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof pm1)) {
                            f31.d(andSet, "unexpected: ");
                            return;
                        }
                        z = ((pm1) andSet).c(this, vy2Var);
                    }
                }
            }
        } while (!z);
    }
}
