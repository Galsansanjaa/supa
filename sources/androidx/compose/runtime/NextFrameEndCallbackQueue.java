package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue;
import defpackage.os0;
import defpackage.tj1;
import defpackage.vy2;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NextFrameEndCallbackQueue {
    public static final int $stable = 8;
    private final os0 onNewAwaiters;
    private final AtomicInt isFrameOngoing = AtomicBoolean.m4737constructorimpl(false);
    private final AwaiterQueue<NextFrameEndAwaiter> frameEndQueue = new AwaiterQueue<>();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class NextFrameEndAwaiter extends AwaiterQueue.Awaiter {
        private os0 onNextFrameEnd;

        public NextFrameEndAwaiter(os0 os0Var) {
            this.onNextFrameEnd = os0Var;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onNextFrameEnd = null;
        }

        public final void resume() {
            os0 os0Var = this.onNextFrameEnd;
            if (os0Var != null) {
                os0Var.invoke();
            }
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(Throwable th) {
            throw th;
        }
    }

    public NextFrameEndCallbackQueue(os0 os0Var) {
        this.onNewAwaiters = new tj1(6, this, os0Var);
    }

    public static /* synthetic */ vy2 a(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, os0 os0Var) {
        return onNewAwaiters$lambda$0(nextFrameEndCallbackQueue, os0Var);
    }

    public static /* synthetic */ void cancel$default(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("scheduler cancelled");
        }
        nextFrameEndCallbackQueue.cancel(cancellationException);
    }

    public static final vy2 markFrameComplete$lambda$0(NextFrameEndAwaiter nextFrameEndAwaiter) {
        nextFrameEndAwaiter.resume();
        return vy2.a;
    }

    public static final vy2 onNewAwaiters$lambda$0(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, os0 os0Var) {
        if (!AtomicBoolean.m4741getimpl(nextFrameEndCallbackQueue.isFrameOngoing)) {
            os0Var.invoke();
        }
        return vy2.a;
    }

    public final void cancel(CancellationException cancellationException) {
        this.frameEndQueue.fail(cancellationException);
    }

    public final boolean getHasAwaiters() {
        return this.frameEndQueue.getHasAwaiters();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ps0] */
    public final void markFrameComplete() {
        AtomicBoolean.m4744setimpl(this.isFrameOngoing, false);
        this.frameEndQueue.flushAndDispatchAwaiters(new Object());
    }

    public final void markFrameStarted() {
        AtomicBoolean.m4744setimpl(this.isFrameOngoing, true);
    }

    public final CancellationHandle scheduleFrameEndCallback(os0 os0Var) {
        return this.frameEndQueue.addAwaiter(new NextFrameEndAwaiter(os0Var), this.onNewAwaiters);
    }
}
