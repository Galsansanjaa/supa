package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimationResult<T, V extends AnimationVector> {
    public static final int $stable = 0;
    private final AnimationEndReason endReason;
    private final AnimationState<T, V> endState;

    public AnimationResult(AnimationState<T, V> animationState, AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ")";
    }
}
