package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import defpackage.a10;
import defpackage.a80;
import defpackage.os0;
import defpackage.se1;
import defpackage.vy2;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OperationKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, defpackage.a10 r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt$await$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r5)
            goto L41
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.ta3.H(r5)
            se1 r4 = r4.getResult()
            r4.getClass()
            r0.label = r2
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            e50 r4 = defpackage.e50.a
            if (r5 != r4) goto L41
            return r4
        L41:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, a10):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, a10 a10Var) {
        se1 result = operation.getResult();
        result.getClass();
        Object await = androidx.concurrent.futures.ListenableFutureKt.await(result, a10Var);
        await.getClass();
        return await;
    }

    public static final Operation launchOperation(Tracer tracer, String str, Executor executor, os0 os0Var) {
        tracer.getClass();
        str.getClass();
        executor.getClass();
        os0Var.getClass();
        MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        se1 future = CallbackToFutureAdapter.getFuture(new a80(executor, tracer, str, os0Var, mutableLiveData));
        future.getClass();
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final os0 os0Var, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        completer.getClass();
        executor.execute(new Runnable() { // from class: gt1
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(Tracer.this, str, os0Var, mutableLiveData, completer);
            }
        });
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, os0 os0Var, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean isEnabled = tracer.isEnabled();
        if (isEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (isEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            os0Var.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th));
            completer.setException(th);
        }
    }
}
