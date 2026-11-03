package androidx.lifecycle;

import defpackage.bc0;
import defpackage.d4;
import defpackage.hu2;
import defpackage.j20;
import defpackage.oe0;
import defpackage.sv0;
import defpackage.wh1;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    public static /* synthetic */ void a(DispatchQueue dispatchQueue, Runnable runnable) {
        dispatchQueue.enqueue(runnable);
    }

    public final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            drainQueue();
        } else {
            hu2.h("cannot enqueue any more runnables");
        }
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void dispatchAndEnqueue(j20 j20Var, Runnable runnable) {
        j20Var.getClass();
        runnable.getClass();
        bc0 bc0Var = oe0.a;
        sv0 sv0Var = wh1.a.n;
        if (sv0Var.isDispatchNeeded(j20Var) || canRun()) {
            sv0Var.dispatch(j20Var, new d4(25, this, runnable));
        } else {
            enqueue(runnable);
        }
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && canRun()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (this.finished) {
                hu2.h("Cannot resume a finished dispatcher");
            } else {
                this.paused = false;
                drainQueue();
            }
        }
    }
}
