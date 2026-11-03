package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class sf1 {
    public static final /* synthetic */ long a = zd.a.objectFieldOffset(sf1.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new uf1(8, false);

    public final boolean a(Runnable runnable) {
        sf1 sf1Var;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = a;
            uf1 uf1Var = (uf1) unsafe.getObjectVolatile(this, j);
            int a2 = uf1Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                uf1 c = uf1Var.c();
                while (true) {
                    Unsafe unsafe2 = zd.a;
                    sf1Var = this;
                    if (!unsafe2.compareAndSwapObject(sf1Var, a, uf1Var, c) && unsafe2.getObjectVolatile(sf1Var, j) == uf1Var) {
                        this = sf1Var;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                sf1Var = this;
            }
            this = sf1Var;
        }
    }

    public final void b() {
        sf1 sf1Var;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = a;
            uf1 uf1Var = (uf1) unsafe.getObjectVolatile(this, j);
            if (uf1Var.b()) {
                return;
            }
            uf1 c = uf1Var.c();
            while (true) {
                sf1Var = this;
                if (!zd.a.compareAndSwapObject(sf1Var, a, uf1Var, c) && zd.a.getObjectVolatile(sf1Var, j) == uf1Var) {
                    this = sf1Var;
                }
            }
            this = sf1Var;
        }
    }

    public final int c() {
        uf1 uf1Var = (uf1) zd.a.getObjectVolatile(this, a);
        uf1Var.getClass();
        long longVolatile = zd.a.getLongVolatile(uf1Var, uf1.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        sf1 sf1Var;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = a;
            uf1 uf1Var = (uf1) unsafe.getObjectVolatile(this, j);
            Object d = uf1Var.d();
            if (d != uf1.e) {
                return d;
            }
            uf1 c = uf1Var.c();
            while (true) {
                sf1Var = this;
                if (!zd.a.compareAndSwapObject(sf1Var, a, uf1Var, c) && zd.a.getObjectVolatile(sf1Var, j) == uf1Var) {
                    this = sf1Var;
                }
            }
            this = sf1Var;
        }
    }
}
