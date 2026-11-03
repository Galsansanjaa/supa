package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.k13;
import defpackage.ux2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class AppUpdatedWorker extends CoroutineWorker {
    public final Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdatedWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = context;
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
    public final java.lang.Object doWork(defpackage.a10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ed
            if (r0 == 0) goto L13
            r0 = r6
            ed r0 = (defpackage.ed) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ed r0 = new ed
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r6)
            goto L57
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L2c:
            defpackage.ta3.H(r6)
            androidx.work.Data r6 = r5.getInputData()
            java.lang.String r1 = "packagename"
            java.lang.String r6 = r6.getString(r1)
            if (r6 != 0) goto L43
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.failure()
            r5.getClass()
            return r5
        L43:
            bc0 r1 = defpackage.oe0.a
            zb0 r1 = defpackage.zb0.a
            fd r4 = new fd
            r4.<init>(r5, r6, r2)
            r0.m = r3
            java.lang.Object r6 = defpackage.od4.D(r1, r4, r0)
            e50 r5 = defpackage.e50.a
            if (r6 != r5) goto L57
            return r5
        L57:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.AppUpdatedWorker.doWork(a10):java.lang.Object");
    }
}
