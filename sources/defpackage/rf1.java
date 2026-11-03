package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class rf1 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long m;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = zd.a;
        a = unsafe.objectFieldOffset(rf1.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(rf1.class.getDeclaredField("_prev$volatile"));
        m = unsafe.objectFieldOffset(rf1.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(rf1 rf1Var, int i) {
        rf1 rf1Var2;
        rf1 rf1Var3;
        while (true) {
            rf1 h = this.h();
            if (h instanceof je1) {
                return (((je1) h).n & i) == 0 && h.c(rf1Var, i);
            }
            Unsafe unsafe = zd.a;
            unsafe.putObjectVolatile(rf1Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(rf1Var, j, this);
            while (true) {
                Unsafe unsafe2 = zd.a;
                rf1Var2 = this;
                rf1Var3 = rf1Var;
                if (unsafe2.compareAndSwapObject(h, a, rf1Var2, rf1Var3)) {
                    rf1Var3.e(rf1Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h, j) != rf1Var2) {
                    break;
                }
                this = rf1Var2;
                rf1Var = rf1Var3;
            }
            this = rf1Var2;
            rf1Var = rf1Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rf1 d() {
        /*
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.zd.a
            long r1 = defpackage.rf1.b
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            rf1 r7 = (defpackage.rf1) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L7b
            sun.misc.Unsafe r3 = defpackage.zd.a
            long r4 = defpackage.rf1.a
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = defpackage.zd.a
            long r5 = defpackage.rf1.b
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.i()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof defpackage.h62
            if (r15 == 0) goto L72
            if (r9 == 0) goto L62
            h62 r6 = (defpackage.h62) r6
            rf1 r13 = r6.a
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.zd.a
            long r10 = defpackage.rf1.a
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            rf1 r8 = (defpackage.rf1) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            defpackage.qq.c()
            return r0
        L72:
            r6.getClass()
            r15 = r6
            rf1 r15 = (defpackage.rf1) r15
            r9 = r8
            r8 = r15
            goto L6b
        L7b:
            defpackage.qq.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf1.d():rf1");
    }

    public final void e(rf1 rf1Var) {
        rf1 rf1Var2;
        while (true) {
            Unsafe unsafe = zd.a;
            long j = b;
            rf1 rf1Var3 = (rf1) unsafe.getObjectVolatile(rf1Var, j);
            if (this.f() != rf1Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = zd.a;
                rf1Var2 = this;
                rf1 rf1Var4 = rf1Var;
                if (unsafe2.compareAndSwapObject(rf1Var4, b, rf1Var3, rf1Var2)) {
                    if (rf1Var2.i()) {
                        rf1Var4.d();
                        return;
                    }
                    return;
                } else {
                    rf1Var = rf1Var4;
                    if (unsafe2.getObjectVolatile(rf1Var4, j) != rf1Var3) {
                        break;
                    } else {
                        this = rf1Var2;
                    }
                }
            }
            this = rf1Var2;
        }
    }

    public final Object f() {
        return zd.a.getObjectVolatile(this, a);
    }

    public final rf1 g() {
        Object f = f();
        h62 h62Var = f instanceof h62 ? (h62) f : null;
        if (h62Var != null) {
            return h62Var.a;
        }
        f.getClass();
        return (rf1) f;
    }

    public final rf1 h() {
        rf1 d = d();
        if (d != null) {
            return d;
        }
        Unsafe unsafe = zd.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            rf1 rf1Var = (rf1) objectVolatile;
            if (!rf1Var.i()) {
                return rf1Var;
            }
            objectVolatile = zd.a.getObjectVolatile(rf1Var, j);
        }
    }

    public boolean i() {
        return f() instanceof h62;
    }

    public String toString() {
        return new v02(this, nb0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + nb0.u(this);
    }
}
