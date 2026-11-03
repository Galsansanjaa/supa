package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import defpackage.iy;
import defpackage.os0;
import defpackage.se1;
import defpackage.te1;
import defpackage.ue1;
import defpackage.vy2;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WorkerKt {
    public static final <T> se1 future(Executor executor, os0 os0Var) {
        se1 future = CallbackToFutureAdapter.getFuture(new iy(19, executor, os0Var));
        future.getClass();
        return future;
    }

    public static final vy2 future$lambda$2(Executor executor, os0 os0Var, CallbackToFutureAdapter.Completer completer) {
        completer.getClass();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new te1(atomicBoolean, 1), DirectExecutor.INSTANCE);
        executor.execute(new ue1(atomicBoolean, completer, os0Var, 1));
        return vy2.a;
    }

    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, os0 os0Var) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(os0Var.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }
}
