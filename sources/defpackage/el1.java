package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class el1 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ zq0 b;

    public el1(Executor executor, zq0 zq0Var) {
        this.a = executor;
        this.b = zq0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.l(e);
        }
    }
}
