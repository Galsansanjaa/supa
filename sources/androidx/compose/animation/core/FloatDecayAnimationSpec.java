package androidx.compose.animation.core;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FloatDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(float f, float f2);

    float getTargetValue(float f, float f2);

    float getValueFromNanos(long j, float f, float f2);

    float getVelocityFromNanos(long j, float f, float f2);
}
