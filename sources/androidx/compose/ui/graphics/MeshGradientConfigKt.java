package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MeshGradientConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: distanceFrom-0a9Yr6o, reason: not valid java name */
    public static final float m5595distanceFrom0a9Yr6o(long j, long j2) {
        return Offset.m5088getDistanceimpl(Offset.m5094minusMKHz9U(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getOffset(float[] fArr, int i) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalized-k-4lQ0M, reason: not valid java name */
    public static final long m5596normalizedk4lQ0M(long j) {
        float m5088getDistanceimpl = Offset.m5088getDistanceimpl(j);
        if (m5088getDistanceimpl == 0.0f) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / m5088getDistanceimpl;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / m5088getDistanceimpl;
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOffset-0AR0LA0, reason: not valid java name */
    public static final void m5597setOffset0AR0LA0(float[] fArr, int i, long j) {
        fArr[i] = Float.intBitsToFloat((int) (j >> 32));
        fArr[i + 1] = Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
