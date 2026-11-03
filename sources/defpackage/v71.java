package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class v71 extends rf1 implements re0, o21 {
    public a81 n;

    @Override // defpackage.o21
    public final rq1 b() {
        return null;
    }

    @Override // defpackage.re0
    public final void dispose() {
        v71 v71Var;
        Unsafe unsafe;
        long j;
        a81 j2 = j();
        while (true) {
            Object I = j2.I();
            if (I instanceof v71) {
                if (I != this) {
                    return;
                }
                li0 li0Var = t61.h;
                do {
                    unsafe = zd.a;
                    j = a81.b;
                    if (unsafe.compareAndSwapObject(j2, j, I, li0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(j2, j) == I);
            } else {
                if (!(I instanceof o21) || ((o21) I).b() == null) {
                    return;
                }
                while (true) {
                    Object f = this.f();
                    if (f instanceof h62) {
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    rf1 rf1Var = (rf1) f;
                    Unsafe unsafe2 = zd.a;
                    long j3 = rf1.m;
                    h62 h62Var = (h62) unsafe2.getObjectVolatile(rf1Var, j3);
                    if (h62Var == null) {
                        h62Var = new h62(rf1Var);
                        unsafe2.putObjectVolatile(rf1Var, j3, h62Var);
                    }
                    h62 h62Var2 = h62Var;
                    while (true) {
                        Unsafe unsafe3 = zd.a;
                        long j4 = rf1.a;
                        v71Var = this;
                        if (unsafe3.compareAndSwapObject(v71Var, j4, f, h62Var2)) {
                            rf1Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(v71Var, j4) != f) {
                            break;
                        } else {
                            this = v71Var;
                        }
                    }
                    this = v71Var;
                }
            }
        }
    }

    public r71 getParent() {
        return j();
    }

    @Override // defpackage.o21
    public final boolean isActive() {
        return true;
    }

    public final a81 j() {
        a81 a81Var = this.n;
        if (a81Var != null) {
            return a81Var;
        }
        jh2.b0("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.rf1
    public final String toString() {
        return getClass().getSimpleName() + '@' + nb0.u(this) + "[job@" + nb0.u(j()) + ']';
    }
}
