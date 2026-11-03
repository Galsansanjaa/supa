package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetectorKt {
    private static final int PixelSensibility = 2;
    private static final int SmoothingFactor = 3;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addIndirectPointerInputChange-Qf4Zb88, reason: not valid java name */
    public static final void m584addIndirectPointerInputChangeQf4Zb88(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, IndirectPointerInputEventSmoother indirectPointerInputEventSmoother, long j) {
        velocityTracker.m6683addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), Offset.m5095plusMKHz9U(m591primaryAxisPositiongrjNGvw(indirectPointerInputEventSmoother.m593smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis), j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addIndirectPointerInputChange-jUCIxP8, reason: not valid java name */
    public static final void m585addIndirectPointerInputChangejUCIxP8(VelocityTracker velocityTracker, IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, IndirectPointerInputEventSmoother indirectPointerInputEventSmoother) {
        velocityTracker.m6683addPositionUv8p0NA(indirectPointerInputChange.getUptimeMillis(), m591primaryAxisPositiongrjNGvw(indirectPointerInputEventSmoother.m593smoothEventPositiontuRUvjQ(indirectPointerInputChange), orientation, indirectPointerEventPrimaryDirectionalMotionAxis));
    }

    private static final boolean changedToDown(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.isConsumed() || indirectPointerInputChange.getPreviousPressed() || !indirectPointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return !indirectPointerInputChange.getPreviousPressed() && indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUpIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChange-_bfSUIo, reason: not valid java name */
    public static final long m586positionChange_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m588positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: positionChangeIgnoreConsumed-_bfSUIo, reason: not valid java name */
    public static final long m587positionChangeIgnoreConsumed_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        return m588positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, true);
    }

    /* renamed from: positionChangeInternal-wfG_k4k, reason: not valid java name */
    private static final long m588positionChangeInternalwfG_k4k(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z) {
        return (z || !indirectPointerInputChange.isConsumed()) ? Offset.m5094minusMKHz9U(m590primaryAxisPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis), m592primaryAxisPreviousPosition_bfSUIo(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis)) : Offset.Companion.m5106getZeroF1C5BW0();
    }

    /* renamed from: positionChangeInternal-wfG_k4k$default, reason: not valid java name */
    public static /* synthetic */ long m589positionChangeInternalwfG_k4k$default(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m588positionChangeInternalwfG_k4k(indirectPointerInputChange, orientation, indirectPointerEventPrimaryDirectionalMotionAxis, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: primaryAxisPosition-_bfSUIo, reason: not valid java name */
    public static final long m590primaryAxisPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.m6114getPositionF1C5BW0();
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6100getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m6114getPositionF1C5BW0() >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6101getYnZO2Niw()) : false)) {
                return indirectPointerInputChange.m6114getPositionF1C5BW0();
            }
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m6114getPositionF1C5BW0() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* renamed from: primaryAxisPosition-grjNGvw, reason: not valid java name */
    private static final long m591primaryAxisPositiongrjNGvw(long j, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return j;
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6100getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6101getYnZO2Niw()) : false)) {
                return j;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }

    /* renamed from: primaryAxisPreviousPosition-_bfSUIo, reason: not valid java name */
    private static final long m592primaryAxisPreviousPosition_bfSUIo(IndirectPointerInputChange indirectPointerInputChange, Orientation orientation, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        float intBitsToFloat;
        if (orientation == null) {
            return indirectPointerInputChange.m6115getPreviousPositionF1C5BW0();
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
        if (indirectPointerEventPrimaryDirectionalMotionAxis == null ? false : IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6100getXnZO2Niw())) {
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m6115getPreviousPositionF1C5BW0() >> 32));
        } else {
            if (!(indirectPointerEventPrimaryDirectionalMotionAxis != null ? IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(indirectPointerEventPrimaryDirectionalMotionAxis.m6098unboximpl(), companion.m6101getYnZO2Niw()) : false)) {
                return indirectPointerInputChange.m6115getPreviousPositionF1C5BW0();
            }
            intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m6115getPreviousPositionF1C5BW0() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
    }
}
