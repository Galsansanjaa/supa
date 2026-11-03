package androidx.compose.animation;

import androidx.compose.ui.unit.Density;
import defpackage.vg1;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = flingInfo.initialVelocity;
            }
            if ((i & 2) != 0) {
                f2 = flingInfo.distance;
            }
            if ((i & 4) != 0) {
                j = flingInfo.duration;
            }
            return flingInfo.copy(f, f2, j);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f, float f2, long j) {
            return new FlingInfo(f, f2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            int i = yo0.i(this.distance, Float.floatToIntBits(this.initialVelocity) * 31, 31);
            long j = this.duration;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public final float position(long j) {
            long j2 = this.duration;
            return AndroidFlingSpline.INSTANCE.flingPosition(j2 > 0 ? ((float) j) / ((float) j2) : 1.0f).getDistanceCoefficient() * Math.signum(this.initialVelocity) * this.distance;
        }

        public String toString() {
            return vg1.C(this.duration, ")", yo0.v("FlingInfo(initialVelocity=", this.initialVelocity, ", distance=", this.distance, ", duration="));
        }

        public final float velocity(long j) {
            long j2 = this.duration;
            return (((Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j2 > 0 ? ((float) j) / ((float) j2) : 1.0f).getVelocityCoefficient()) * this.distance) / ((float) this.duration)) * 1000.0f;
        }
    }

    public FlingCalculator(float f, Density density) {
        this.friction = f;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float f) {
        return AndroidFlingSpline.INSTANCE.deceleration(f, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = f2 - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f3 = FlingCalculatorKt.DecelerationRate;
        return (float) (Math.exp((f3 / d) * splineDeceleration) * d2);
    }

    public final long flingDuration(float f) {
        float f2;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f2 - 1.0d)) * 1000.0d);
    }

    public final FlingInfo flingInfo(float f) {
        float f2;
        float f3;
        double splineDeceleration = getSplineDeceleration(f);
        f2 = FlingCalculatorKt.DecelerationRate;
        double d = f2 - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f3 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(f, (float) (Math.exp((f3 / d) * splineDeceleration) * d2), (long) (Math.exp(splineDeceleration / d) * 1000.0d));
    }

    public final Density getDensity() {
        return this.density;
    }
}
