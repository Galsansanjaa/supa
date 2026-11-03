package defpackage;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class md implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ md(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ArchTaskExecutor.a(runnable);
                return;
            case 1:
                ArchTaskExecutor.b(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
