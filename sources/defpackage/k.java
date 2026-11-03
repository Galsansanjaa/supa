package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k extends zq0 implements Runnable {
    public static final /* synthetic */ int v = 0;
    public se1 s;
    public Class t;
    public Object u;

    public k(se1 se1Var, Class cls, Object obj) {
        this.s = se1Var;
        this.t = cls;
        this.u = obj;
    }

    @Override // defpackage.k0
    public final void b() {
        se1 se1Var = this.s;
        if ((se1Var != null) & (this.a instanceof y)) {
            se1Var.cancel(o());
        }
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.k0
    public final String i() {
        String str;
        se1 se1Var = this.s;
        Class cls = this.t;
        Object obj = this.u;
        String i = super.i();
        if (se1Var != null) {
            String valueOf = String.valueOf(se1Var);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (i != null) {
                return i.length() != 0 ? str.concat(i) : new String(str);
            }
            return null;
        }
        String valueOf2 = String.valueOf(cls);
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + valueOf2.length() + str.length() + 29);
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf2);
        sb2.append("], fallback=[");
        return wa2.v(sb2, valueOf3, "]");
    }

    public abstract Object p(Throwable th, Object obj);

    public abstract void q(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            se1 r0 = r9.s
            java.lang.Class r1 = r9.t
            java.lang.Object r2 = r9.u
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Laf
            java.lang.Object r3 = r9.a
            boolean r3 = r3 instanceof defpackage.y
            if (r3 == 0) goto L21
            goto Laf
        L21:
            r3 = 0
            r9.s = r3
            boolean r4 = r0 instanceof defpackage.k0     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            k0 r4 = (defpackage.k0) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.n()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = defpackage.xu3.n(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L84
        L3c:
            r5 = r3
            goto L84
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L82
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r7 = r7 + 35
            int r8 = r4.length()
            int r8 = r8 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L82:
            r4 = r5
            goto L3c
        L84:
            if (r4 != 0) goto L8a
            r9.k(r5)
            return
        L8a:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L94
            r9.m(r0)
            return
        L94:
            java.lang.Object r0 = r9.p(r4, r2)     // Catch: java.lang.Throwable -> La0
            r9.t = r3
            r9.u = r3
            r9.q(r0)
            return
        La0:
            r0 = move-exception
            r9.l(r0)     // Catch: java.lang.Throwable -> La9
            r9.t = r3
            r9.u = r3
            return
        La9:
            r0 = move-exception
            r9.t = r3
            r9.u = r3
            throw r0
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.run():void");
    }
}
