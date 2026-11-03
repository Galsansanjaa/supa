package androidx.compose.runtime;

import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DisposableEffectImpl implements RememberObserver {
    private final ps0 effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(ps0 ps0Var) {
        this.effect = ps0Var;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            DisposableEffectResult disposableEffectResult = this.onDispose;
            if (disposableEffectResult != null) {
                disposableEffectResult.dispose();
            }
            this.onDispose = null;
            return;
        }
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:DisposableEffect:dispose");
        try {
            DisposableEffectResult disposableEffectResult2 = this.onDispose;
            if (disposableEffectResult2 != null) {
                disposableEffectResult2.dispose();
            }
            this.onDispose = null;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        DisposableEffectScope disposableEffectScope2;
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            ps0 ps0Var = this.effect;
            disposableEffectScope = EffectsKt.InternalDisposableEffectScope;
            this.onDispose = (DisposableEffectResult) ps0Var.invoke(disposableEffectScope);
            return;
        }
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:DisposableEffect:effect");
        try {
            ps0 ps0Var2 = this.effect;
            disposableEffectScope2 = EffectsKt.InternalDisposableEffectScope;
            this.onDispose = (DisposableEffectResult) ps0Var2.invoke(disposableEffectScope2);
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }
}
