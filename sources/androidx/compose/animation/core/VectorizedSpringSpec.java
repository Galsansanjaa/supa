package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final /* synthetic */ VectorizedFloatAnimationSpec<V> $$delegate_0;
    private final float dampingRatio;
    private final float stiffness;

    public VectorizedSpringSpec(float f, float f2, V v) {
        this(f, f2, VectorizedAnimationSpecKt.access$createSpringAnimations(v, f, f2));
    }

    public /* synthetic */ VectorizedSpringSpec(float f, float f2, AnimationVector animationVector, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : animationVector);
    }

    private VectorizedSpringSpec(float f, float f2, Animations animations) {
        this.$$delegate_0 = new VectorizedFloatAnimationSpec<>(animations);
        this.dampingRatio = f;
        this.stiffness = f2;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return this.$$delegate_0.getDurationNanos(v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        return this.$$delegate_0.getEndVelocity(v, v2, v3);
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        return this.$$delegate_0.getValueFromNanos(j, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return this.$$delegate_0.getVelocityFromNanos(j, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        this.$$delegate_0.getClass();
        return false;
    }
}
