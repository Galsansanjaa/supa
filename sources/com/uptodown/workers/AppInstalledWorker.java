package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.k13;
import defpackage.ux2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class AppInstalledWorker extends CoroutineWorker {
    public final Context a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstalledWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = context;
        String string = workerParameters.getInputData().getString("packagename");
        string.getClass();
        this.b = string;
        Activity activity = k13.p;
        this.a = ux2.h(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(defpackage.a10 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.uc
            if (r0 == 0) goto L13
            r0 = r5
            uc r0 = (defpackage.uc) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            uc r0 = new uc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r5)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L2c:
            defpackage.ta3.H(r5)
            bc0 r5 = defpackage.oe0.a
            zb0 r5 = defpackage.zb0.a
            vc r1 = new vc
            r1.<init>(r4, r2)
            r0.m = r3
            java.lang.Object r5 = defpackage.od4.D(r5, r1, r0)
            e50 r4 = defpackage.e50.a
            if (r5 != r4) goto L43
            return r4
        L43:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.AppInstalledWorker.doWork(a10):java.lang.Object");
    }
}
