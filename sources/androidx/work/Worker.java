package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import defpackage.l93;
import defpackage.se1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class Worker extends ListenableWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public abstract ListenableWorker.Result doWork();

    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    public se1 getForegroundInfoAsync() {
        se1 future;
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        future = WorkerKt.future(backgroundExecutor, new l93(this, 1));
        return future;
    }

    @Override // androidx.work.ListenableWorker
    public final se1 startWork() {
        se1 future;
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        future = WorkerKt.future(backgroundExecutor, new l93(this, 0));
        return future;
    }
}
