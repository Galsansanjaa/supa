package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wg2 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final rn0 a;
    public final zn0 b;
    public final hh2 c;
    public final nj0 d;
    public final j20 e;

    public wg2(rn0 rn0Var, zn0 zn0Var, hh2 hh2Var, nj0 nj0Var, j20 j20Var) {
        rn0Var.getClass();
        zn0Var.getClass();
        hh2Var.getClass();
        nj0Var.getClass();
        j20Var.getClass();
        this.a = rn0Var;
        this.b = zn0Var;
        this.c = hh2Var;
        this.d = nj0Var;
        this.e = j20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (r6.b(r0) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        if (r7 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c10 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vg2
            if (r0 == 0) goto L13
            r0 = r7
            vg2 r0 = (defpackage.vg2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            vg2 r0 = new vg2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.m
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            hh2 r6 = r6.c
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            defpackage.ta3.H(r7)
            goto L7e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            r6 = 0
            return r6
        L35:
            defpackage.ta3.H(r7)
            goto L47
        L39:
            defpackage.ta3.H(r7)
            po0 r7 = defpackage.po0.a
            r0.m = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r5) goto L47
            goto L7d
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L5d
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5d
            goto Lb3
        L5d:
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r7.next()
            q50 r1 = (defpackage.q50) r1
            ca0 r1 = r1.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L61
            r0.m = r2
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L7e
        L7d:
            return r5
        L7e:
            th2 r7 = r6.a
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L8b
        L86:
            boolean r3 = r7.booleanValue()
            goto L94
        L8b:
            th2 r7 = r6.b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L94
            goto L86
        L94:
            if (r3 != 0) goto L9e
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9e:
            double r0 = defpackage.wg2.f
            double r6 = r6.a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lab
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lab:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.a(c10):java.lang.Object");
    }
}
