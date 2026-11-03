package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import defpackage.z50;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WorkLauncherImpl implements WorkLauncher {
    private final Processor processor;
    private final TaskExecutor workTaskExecutor;

    public WorkLauncherImpl(Processor processor, TaskExecutor taskExecutor) {
        processor.getClass();
        taskExecutor.getClass();
        this.processor = processor;
        this.workTaskExecutor = taskExecutor;
    }

    public static /* synthetic */ void a(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        startWork$lambda$0(workLauncherImpl, startStopToken, runtimeExtras);
    }

    public static final void startWork$lambda$0(WorkLauncherImpl workLauncherImpl, StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        workLauncherImpl.processor.startWork(startStopToken, runtimeExtras);
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final TaskExecutor getWorkTaskExecutor() {
        return this.workTaskExecutor;
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void startWork(StartStopToken startStopToken) {
        startStopToken.getClass();
        startWork(startStopToken, null);
    }

    @Override // androidx.work.impl.WorkLauncher
    public void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        startStopToken.getClass();
        this.workTaskExecutor.executeOnTaskThread(new z50(this, startStopToken, runtimeExtras, 6));
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void stopWork(StartStopToken startStopToken) {
        startStopToken.getClass();
        stopWork(startStopToken, WorkInfo.STOP_REASON_UNKNOWN);
    }

    @Override // androidx.work.impl.WorkLauncher
    public void stopWork(StartStopToken startStopToken, int i) {
        startStopToken.getClass();
        this.workTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this.processor, startStopToken, false, i));
    }

    @Override // androidx.work.impl.WorkLauncher
    public final void stopWorkWithReason(StartStopToken startStopToken, int i) {
        startStopToken.getClass();
        stopWork(startStopToken, i);
    }
}
