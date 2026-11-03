package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.unit.VelocityKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private final PlatformVelocityTracker platformVelocityTracker = PlatformVelocityTracker_androidKt.PlatformVelocityTracker();

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m6683addPositionUv8p0NA(long j, long j2) {
        this.platformVelocityTracker.mo6675addPositionUv8p0NA(j, j2);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m6684calculateVelocity9UxMQ8M() {
        return m6685calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m6685calculateVelocityAH228Gc(long j) {
        return this.platformVelocityTracker.mo6676calculateVelocityAH228Gc(j);
    }

    public final PlatformVelocityTracker getPlatformVelocityTracker$ui() {
        return this.platformVelocityTracker;
    }

    public final void resetTracking() {
        this.platformVelocityTracker.resetTracking();
    }
}
