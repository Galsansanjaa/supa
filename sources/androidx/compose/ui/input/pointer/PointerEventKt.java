package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PointerEventKt {
    @hd0
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @hd0
    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @hd0
    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @hd0
    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (Offset.m5087equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m5106getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @hd0
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m6526isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j) {
        long m6591getPositionF1C5BW0 = pointerInputChange.m6591getPositionF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m6591getPositionF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m6591getPositionF1C5BW0 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (intBitsToFloat > ((float) i)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) i2));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m6527isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        boolean m6652equalsimpl0 = PointerType.m6652equalsimpl0(pointerInputChange.m6594getTypeT8wyACA(), PointerType.Companion.m6659getTouchT8wyACA());
        long m6591getPositionF1C5BW0 = pointerInputChange.m6591getPositionF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m6591getPositionF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m6591getPositionF1C5BW0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = m6652equalsimpl0 ? 1.0f : 0.0f;
        float f2 = intBitsToFloat3 * f;
        float f3 = ((int) (j >> 32)) + f2;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-f2)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @hd0
    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.isConsumed()) ? Offset.m5094minusMKHz9U(pointerInputChange.m6591getPositionF1C5BW0(), pointerInputChange.m6592getPreviousPositionF1C5BW0()) : Offset.Companion.m5106getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m5087equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m5106getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m5087equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m5106getZeroF1C5BW0());
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
