package androidx.compose.animation.core;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int i, int i2, Easing easing) {
        this.duration = i;
        this.delay = i2;
        this.easing = easing;
        this.durationNanos = i * AnimationKt.MillisToNanos;
        this.delayNanos = i2 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ FloatTweenSpec(int i, int i2, Easing easing, int i3, sb0 sb0Var) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    private final long clampPlayTimeNanos(long j) {
        long j2 = j - this.delayNanos;
        long j3 = this.durationNanos;
        if (j2 < 0) {
            j2 = 0;
        }
        return j2 > j3 ? j3 : j2;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f, float f2, float f3) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getEndVelocity(float f, float f2, float f3) {
        return getVelocityFromNanos(getDurationNanos(f, f2, f3), f, f2, f3);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.delayNanos;
        long j3 = this.durationNanos;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        float transform = this.easing.transform(this.duration == 0 ? 1.0f : ((float) j2) / ((float) j3));
        return (f2 * transform) + ((1.0f - transform) * f);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.delayNanos;
        long j3 = this.durationNanos;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (getValueFromNanos(j4, f, f2, f3) - getValueFromNanos(j4 - AnimationKt.MillisToNanos, f, f2, f3)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return new VectorizedFloatAnimationSpec(this);
    }
}
