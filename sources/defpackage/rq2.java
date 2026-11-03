package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rq2 extends v71 {
    public static final /* synthetic */ long q = zd.a.objectFieldOffset(rq2.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread o = Thread.currentThread();
    public re0 p;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.v71
    public final boolean k() {
        return true;
    }

    @Override // defpackage.v71
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = zd.a;
            long j = q;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            rq2 rq2Var = this;
            if (unsafe.compareAndSwapInt(rq2Var, q, intVolatile, 2)) {
                rq2Var.o.interrupt();
                unsafe.putIntVolatile(rq2Var, j, 3);
                return;
            }
            this = rq2Var;
        }
    }

    public final void m() {
        rq2 rq2Var;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = q;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                rq2Var = this;
                if (unsafe.compareAndSwapInt(rq2Var, j, intVolatile, 1)) {
                    re0 re0Var = rq2Var.p;
                    if (re0Var != null) {
                        re0Var.dispose();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                rq2Var = this;
            }
            this = rq2Var;
        }
    }
}
