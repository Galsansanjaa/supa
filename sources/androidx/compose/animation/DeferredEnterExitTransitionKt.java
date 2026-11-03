package androidx.compose.animation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DeferredEnterExitTransitionKt {
    private static final ProvidableModifierLocal<SharedMutableTransformState> ModifierLocalSharedMutableTransformState = ModifierLocalKt.modifierLocalOf(DeferredEnterExitTransitionKt$ModifierLocalSharedMutableTransformState$1.INSTANCE);
    private static os0 testTimeSource;

    public static final ProvidableModifierLocal<SharedMutableTransformState> getModifierLocalSharedMutableTransformState() {
        return ModifierLocalSharedMutableTransformState;
    }

    public static final os0 getTestTimeSource() {
        return testTimeSource;
    }

    public static /* synthetic */ void getTestTimeSource$annotations() {
    }

    public static final void setTestTimeSource(os0 os0Var) {
        testTimeSource = os0Var;
    }
}
