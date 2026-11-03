package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class MatchIsOrHasBeenConfigured extends SharedTransitionStateMachine.State {
    public static final int $stable = 0;

    public MatchIsOrHasBeenConfigured() {
        super(null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract Rect getCurrentBounds();

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getMatchIsOrHasBeenConfigured() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract TargetData getTargetData();
}
