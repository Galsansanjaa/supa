package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private Orientation orientation;
    private long totalPositionChange;

    private TouchSlopDetector(Orientation orientation, long j) {
        this.orientation = orientation;
        this.totalPositionChange = j;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? Offset.Companion.m5106getZeroF1C5BW0() : j, null);
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, sb0 sb0Var) {
        this(orientation, j);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m664calculatePostSlopOffsettuRUvjQ(float f) {
        Orientation orientation = this.orientation;
        long j = this.totalPositionChange;
        if (orientation == null) {
            return Offset.m5094minusMKHz9U(this.totalPositionChange, Offset.m5097timestuRUvjQ(Offset.m5085divtuRUvjQ(j, Offset.m5088getDistanceimpl(j)), f));
        }
        float m670mainAxisk4lQ0M = m670mainAxisk4lQ0M(j) - (Math.signum(m670mainAxisk4lQ0M(this.totalPositionChange)) * f);
        float m667crossAxisk4lQ0M = m667crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation != Orientation.Horizontal) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(m667crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m670mainAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(m667crossAxisk4lQ0M) & 4294967295L) | (Float.floatToRawIntBits(m670mainAxisk4lQ0M) << 32));
    }

    /* renamed from: getPostSlopOffset-qto3Fdw$default, reason: not valid java name */
    public static /* synthetic */ long m665getPostSlopOffsetqto3Fdw$default(TouchSlopDetector touchSlopDetector, long j, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return touchSlopDetector.m668getPostSlopOffsetqto3Fdw(j, f, z);
    }

    /* renamed from: reset-k-4lQ0M$default, reason: not valid java name */
    public static /* synthetic */ void m666resetk4lQ0M$default(TouchSlopDetector touchSlopDetector, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.Companion.m5106getZeroF1C5BW0();
        }
        touchSlopDetector.m671resetk4lQ0M(j);
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m667crossAxisk4lQ0M(long j) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j & 4294967295L) : (int) (j >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: getPostSlopOffset-qto3Fdw, reason: not valid java name */
    public final long m668getPostSlopOffsetqto3Fdw(long j, float f, boolean z) {
        long m5095plusMKHz9U;
        long j2 = this.totalPositionChange;
        if (z) {
            m5095plusMKHz9U = Offset.m5095plusMKHz9U(j2, j);
            this.totalPositionChange = m5095plusMKHz9U;
        } else {
            m5095plusMKHz9U = Offset.m5095plusMKHz9U(j2, j);
        }
        float m5088getDistanceimpl = this.orientation == null ? Offset.m5088getDistanceimpl(m5095plusMKHz9U) : Math.abs(m670mainAxisk4lQ0M(m5095plusMKHz9U));
        return (m5088getDistanceimpl <= 0.0f || m5088getDistanceimpl < f) ? Offset.Companion.m5105getUnspecifiedF1C5BW0() : m664calculatePostSlopOffsettuRUvjQ(f);
    }

    /* renamed from: getTotalPositionChange-F1C5BW0, reason: not valid java name */
    public final long m669getTotalPositionChangeF1C5BW0() {
        return this.totalPositionChange;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m670mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    /* renamed from: reset-k-4lQ0M, reason: not valid java name */
    public final void m671resetk4lQ0M(long j) {
        this.totalPositionChange = j;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
