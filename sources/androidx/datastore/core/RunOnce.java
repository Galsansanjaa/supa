package androidx.datastore.core;

import defpackage.a10;
import defpackage.e50;
import defpackage.lx;
import defpackage.mx;
import defpackage.nm1;
import defpackage.sm1;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class RunOnce {
    private final nm1 runMutex = new sm1();
    private final lx didRun = new mx();

    public final Object awaitComplete(a10 a10Var) {
        Object u = ((mx) this.didRun).u(a10Var);
        return u == e50.a ? u : vy2.a;
    }

    public abstract Object doRun(a10 a10Var);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if (r9.lock(null, r0) == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x0068, B:29:0x0076), top: B:24:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(defpackage.a10 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.RunOnce$runIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = (androidx.datastore.core.RunOnce$runIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.RunOnce$runIfNeeded$1 r0 = new androidx.datastore.core.RunOnce$runIfNeeded$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            vy2 r4 = defpackage.vy2.a
            r5 = 0
            e50 r6 = defpackage.e50.a
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.lang.Object r8 = r0.L$1
            nm1 r8 = (defpackage.nm1) r8
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.RunOnce r0 = (androidx.datastore.core.RunOnce) r0
            defpackage.ta3.H(r9)     // Catch: java.lang.Throwable -> L35
            goto L85
        L35:
            r9 = move-exception
            goto L94
        L37:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r8)
            return r5
        L3d:
            java.lang.Object r8 = r0.L$1
            nm1 r8 = (defpackage.nm1) r8
            java.lang.Object r1 = r0.L$0
            androidx.datastore.core.RunOnce r1 = (androidx.datastore.core.RunOnce) r1
            defpackage.ta3.H(r9)
            r9 = r8
            r8 = r1
            goto L68
        L4b:
            defpackage.ta3.H(r9)
            lx r9 = r8.didRun
            a81 r9 = (defpackage.a81) r9
            boolean r9 = r9.N()
            if (r9 == 0) goto L59
            return r4
        L59:
            nm1 r9 = r8.runMutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r1 = r9.lock(r5, r0)
            if (r1 != r6) goto L68
            goto L82
        L68:
            lx r1 = r8.didRun     // Catch: java.lang.Throwable -> L90
            a81 r1 = (defpackage.a81) r1     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.N()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L76
            r9.unlock(r5)
            return r4
        L76:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L90
            r0.label = r2     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r8.doRun(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != r6) goto L83
        L82:
            return r6
        L83:
            r0 = r8
            r8 = r9
        L85:
            lx r9 = r0.didRun     // Catch: java.lang.Throwable -> L35
            mx r9 = (defpackage.mx) r9     // Catch: java.lang.Throwable -> L35
            r9.P(r4)     // Catch: java.lang.Throwable -> L35
            r8.unlock(r5)
            return r4
        L90:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L94:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.RunOnce.runIfNeeded(a10):java.lang.Object");
    }
}
