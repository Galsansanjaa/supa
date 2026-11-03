package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, WindowInsetsConnection_androidKt.access$getPlatformFlingScrollFriction$p() * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        return Math.signum(f) * ((float) (Math.exp((WindowInsetsConnection_androidKt.access$getDecelerationRate$p() / WindowInsetsConnection_androidKt.access$getDecelMinusOne$p()) * getSplineDeceleration(f)) * WindowInsetsConnection_androidKt.access$getPlatformFlingScrollFriction$p() * this.magicPhysicalCoefficient));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        return (long) (Math.exp(getSplineDeceleration(f2) / WindowInsetsConnection_androidKt.access$getDecelMinusOne$p()) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        return f + flingDistance(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return (AndroidFlingSpline.FlingResult.m764getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m759flingPositionLfoxSSI(durationNanos > 0 ? ((float) j) / ((float) durationNanos) : 1.0f)) * flingDistance(f2)) + f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        long durationNanos = getDurationNanos(0.0f, f2);
        return ((AndroidFlingSpline.FlingResult.m765getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m759flingPositionLfoxSSI(durationNanos > 0 ? ((float) j) / ((float) durationNanos) : 1.0f)) * flingDistance(f2)) / ((float) durationNanos)) * 1.0E9f;
    }
}
