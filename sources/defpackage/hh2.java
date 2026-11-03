package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hh2 {
    public final th2 a;
    public final th2 b;

    public hh2(th2 th2Var, th2 th2Var2) {
        th2Var.getClass();
        th2Var2.getClass();
        this.a = th2Var;
        this.b = th2Var2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.b.b(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.a.b(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.c10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gh2
            if (r0 == 0) goto L13
            r0 = r6
            gh2 r0 = (defpackage.gh2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            gh2 r0 = new gh2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 2
            r3 = 1
            e50 r4 = defpackage.e50.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.ta3.H(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            r5 = 0
            return r5
        L31:
            defpackage.ta3.H(r6)
            goto L43
        L35:
            defpackage.ta3.H(r6)
            r0.m = r3
            th2 r6 = r5.a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.m = r2
            th2 r5 = r5.b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            vy2 r5 = defpackage.vy2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh2.b(c10):java.lang.Object");
    }
}
