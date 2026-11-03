package androidx.compose.runtime.retain;

import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RetainedEffectImpl implements RetainObserver {
    private final ps0 effect;
    private RetainedEffectResult onRetire;

    public RetainedEffectImpl(ps0 ps0Var) {
        this.effect = ps0Var;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetained() {
        RetainedEffectScope retainedEffectScope;
        ps0 ps0Var = this.effect;
        retainedEffectScope = RetainedEffectKt.InternalRetainedEffectScope;
        this.onRetire = (RetainedEffectResult) ps0Var.invoke(retainedEffectScope);
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        RetainedEffectResult retainedEffectResult = this.onRetire;
        if (retainedEffectResult != null) {
            retainedEffectResult.retire();
        }
        this.onRetire = null;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
    }
}
