package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(V v, V v2);

    V getTargetValue(V v, V v2);

    V getValueFromNanos(long j, V v, V v2);

    V getVelocityFromNanos(long j, V v, V v2);
}
