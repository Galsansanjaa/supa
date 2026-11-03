package androidx.compose.runtime.retain;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RetainedEffectScope {
    public static final int $stable = 0;

    public final RetainedEffectResult onRetire(final os0 os0Var) {
        return new RetainedEffectResult() { // from class: androidx.compose.runtime.retain.RetainedEffectScope$onRetire$1
            @Override // androidx.compose.runtime.retain.RetainedEffectResult
            public void retire() {
                os0.this.invoke();
            }
        };
    }
}
