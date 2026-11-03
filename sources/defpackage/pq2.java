package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class pq2 {
    public static final /* synthetic */ long b = zd.a.objectFieldOffset(pq2.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public sj0[] a;

    public final void a(sj0 sj0Var) {
        sj0Var.d((tj0) this);
        sj0[] sj0VarArr = this.a;
        if (sj0VarArr == null) {
            sj0VarArr = new sj0[4];
            this.a = sj0VarArr;
        } else if (b() >= sj0VarArr.length) {
            sj0VarArr = (sj0[]) Arrays.copyOf(sj0VarArr, b() * 2);
            this.a = sj0VarArr;
        }
        int b2 = b();
        zd.a.putIntVolatile(this, b, b2 + 1);
        sj0VarArr[b2] = sj0Var;
        sj0Var.b = b2;
        e(b2);
    }

    public final int b() {
        return zd.a.getIntVolatile(this, b);
    }

    public final void c(sj0 sj0Var) {
        synchronized (this) {
            if (sj0Var.b() != null) {
                d(sj0Var.b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sj0 d(int r8) {
        /*
            r7 = this;
            sj0[] r0 = r7.a
            r0.getClass()
            int r1 = r7.b()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = defpackage.zd.a
            long r4 = defpackage.pq2.b
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.b()
            if (r8 >= r1) goto L7c
            int r1 = r7.b()
            r7.f(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L3c
            r3 = r0[r8]
            r3.getClass()
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.f(r8, r1)
            r7.e(r1)
            goto L7c
        L3c:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.b()
            if (r3 < r4) goto L47
            goto L7c
        L47:
            sj0[] r4 = r7.a
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.b()
            if (r1 >= r5) goto L65
            r5 = r4[r1]
            r5.getClass()
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L65
            goto L66
        L65:
            r1 = r3
        L66:
            r3 = r4[r8]
            r3.getClass()
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L77
            goto L7c
        L77:
            r7.f(r8, r1)
            r8 = r1
            goto L3c
        L7c:
            int r8 = r7.b()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.b = r2
            int r7 = r7.b()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq2.d(int):sj0");
    }

    public final void e(int i) {
        while (i > 0) {
            sj0[] sj0VarArr = this.a;
            sj0VarArr.getClass();
            int i2 = (i - 1) / 2;
            sj0 sj0Var = sj0VarArr[i2];
            sj0Var.getClass();
            sj0 sj0Var2 = sj0VarArr[i];
            sj0Var2.getClass();
            if (sj0Var.compareTo(sj0Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        sj0[] sj0VarArr = this.a;
        sj0VarArr.getClass();
        sj0 sj0Var = sj0VarArr[i2];
        sj0Var.getClass();
        sj0 sj0Var2 = sj0VarArr[i];
        sj0Var2.getClass();
        sj0VarArr[i] = sj0Var;
        sj0VarArr[i2] = sj0Var2;
        sj0Var.b = i;
        sj0Var2.b = i2;
    }
}
