package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class is extends yt {
    public final ts0 p;

    public is(ts0 ts0Var, j20 j20Var, int i, vq vqVar) {
        super(ts0Var, j20Var, i, vqVar, 0);
        this.p = ts0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.yt, defpackage.xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.tz1 r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hs
            if (r0 == 0) goto L13
            r0 = r6
            hs r0 = (defpackage.hs) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L1a
        L13:
            hs r0 = new hs
            c10 r6 = (defpackage.c10) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.b
            int r1 = r0.n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            tz1 r5 = r0.a
            defpackage.ta3.H(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L30:
            defpackage.ta3.H(r6)
            r0.a = r5
            r0.n = r3
            java.lang.Object r4 = super.e(r5, r0)
            e50 r6 = defpackage.e50.a
            if (r4 != r6) goto L40
            return r6
        L40:
            sz1 r5 = (defpackage.sz1) r5
            zq r4 = r5.n
            boolean r4 = r4.x()
            if (r4 == 0) goto L4d
            vy2 r4 = defpackage.vy2.a
            return r4
        L4d:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.hu2.h(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is.e(tz1, a10):java.lang.Object");
    }

    @Override // defpackage.yt, defpackage.xt
    public final xt f(j20 j20Var, int i, vq vqVar) {
        return new is(this.p, j20Var, i, vqVar);
    }
}
