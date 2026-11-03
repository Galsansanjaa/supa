package com.uptodown.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class GetUserDataWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDataWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(defpackage.a10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lu0
            if (r0 == 0) goto L13
            r0 = r6
            lu0 r0 = (defpackage.lu0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            lu0 r0 = new lu0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.ta3.H(r6)     // Catch: java.lang.Exception -> L26
            goto L53
        L26:
            r6 = move-exception
            goto L5b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L2e:
            defpackage.ta3.H(r6)
            android.content.Context r6 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L26
            r6.getClass()     // Catch: java.lang.Exception -> L26
            r0.m = r3     // Catch: java.lang.Exception -> L26
            bc0 r1 = defpackage.oe0.a     // Catch: java.lang.Exception -> L26
            zb0 r1 = defpackage.zb0.a     // Catch: java.lang.Exception -> L26
            f4 r3 = new f4     // Catch: java.lang.Exception -> L26
            r4 = 21
            r3.<init>(r6, r2, r2, r4)     // Catch: java.lang.Exception -> L26
            java.lang.Object r6 = defpackage.od4.D(r1, r3, r0)     // Catch: java.lang.Exception -> L26
            e50 r0 = defpackage.e50.a
            if (r6 != r0) goto L4e
            goto L50
        L4e:
            vy2 r6 = defpackage.vy2.a     // Catch: java.lang.Exception -> L26
        L50:
            if (r6 != r0) goto L53
            return r0
        L53:
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L26
            r6.getClass()     // Catch: java.lang.Exception -> L26
            return r6
        L5b:
            r6.printStackTrace()
            xk0 r0 = new xk0
            android.content.Context r5 = r5.getApplicationContext()
            r1 = 23
            r0.<init>(r5, r1)
            java.lang.String r5 = "GetUserDataWorker"
            r0.E(r5, r6)
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.success()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.GetUserDataWorker.doWork(a10):java.lang.Object");
    }
}
