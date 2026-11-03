package androidx.work.impl.background.greedy;

import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import defpackage.sb0;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class TimeLimiter {
    private final WorkLauncher launcher;
    private final Object lock;
    private final RunnableScheduler runnableScheduler;
    private final long timeoutMs;
    private final Map<StartStopToken, Runnable> tracked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher) {
        this(runnableScheduler, workLauncher, 0L, 4, null);
        runnableScheduler.getClass();
        workLauncher.getClass();
    }

    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j) {
        runnableScheduler.getClass();
        workLauncher.getClass();
        this.runnableScheduler = runnableScheduler;
        this.launcher = workLauncher;
        this.timeoutMs = j;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    public /* synthetic */ TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j, int i, sb0 sb0Var) {
        this(runnableScheduler, workLauncher, (i & 4) != 0 ? 5400000L : j);
    }

    public static /* synthetic */ void a(TimeLimiter timeLimiter, StartStopToken startStopToken) {
        track$lambda$0(timeLimiter, startStopToken);
    }

    public static final void track$lambda$0(TimeLimiter timeLimiter, StartStopToken startStopToken) {
        timeLimiter.launcher.stopWork(startStopToken, 3);
    }

    public final void cancel(StartStopToken startStopToken) {
        Runnable remove;
        startStopToken.getClass();
        synchronized (this.lock) {
            remove = this.tracked.remove(startStopToken);
        }
        if (remove != null) {
            this.runnableScheduler.cancel(remove);
        }
    }

    public final void track(StartStopToken startStopToken) {
        startStopToken.getClass();
        zr0 zr0Var = new zr0(17, this, startStopToken);
        synchronized (this.lock) {
            this.tracked.put(startStopToken, zr0Var);
        }
        this.runnableScheduler.scheduleWithDelay(this.timeoutMs, zr0Var);
    }
}
