package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.cy;
import defpackage.r71;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, r71 r71Var) {
        lifecycle.getClass();
        state.getClass();
        dispatchQueue.getClass();
        r71Var.getClass();
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        cy cyVar = new cy(1, this, r71Var);
        this.observer = cyVar;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(cyVar);
        } else {
            r71Var.cancel(null);
            finish();
        }
    }

    public static /* synthetic */ void a(LifecycleController lifecycleController, r71 r71Var, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        observer$lambda$0(lifecycleController, r71Var, lifecycleOwner, event);
    }

    private final void handleDestroy(r71 r71Var) {
        r71Var.cancel(null);
        finish();
    }

    public static final void observer$lambda$0(LifecycleController lifecycleController, r71 r71Var, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleOwner.getClass();
        event.getClass();
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            r71Var.cancel(null);
            lifecycleController.finish();
            return;
        }
        int compareTo = lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState);
        DispatchQueue dispatchQueue = lifecycleController.dispatchQueue;
        if (compareTo < 0) {
            dispatchQueue.pause();
        } else {
            dispatchQueue.resume();
        }
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
