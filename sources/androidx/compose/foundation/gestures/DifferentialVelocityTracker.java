package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.VelocityKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DifferentialVelocityTracker {
    public static final int $stable = VelocityTracker1D.$stable;
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(true);
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(true);

    /* renamed from: addDelta-Uv8p0NA, reason: not valid java name */
    public final void m518addDeltaUv8p0NA(long j, long j2) {
        this.xVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.yVelocityTracker.addDataPoint(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m519calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Float.MAX_VALUE), this.yVelocityTracker.calculateVelocity(Float.MAX_VALUE));
    }
}
