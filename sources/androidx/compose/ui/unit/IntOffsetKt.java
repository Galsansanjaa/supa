package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m8167constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m8185lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset.m8167constructorimpl((MathHelpersKt.lerp(IntOffset.m8173getXimpl(j), IntOffset.m8173getXimpl(j2), f) << 32) | (MathHelpersKt.lerp(IntOffset.m8174getYimpl(j), IntOffset.m8174getYimpl(j2), f) & 4294967295L));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m8186minusNvtHpc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - IntOffset.m8173getXimpl(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - IntOffset.m8174getYimpl(j2);
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m8187minusoCl6YwE(long j, long j2) {
        float m8173getXimpl = IntOffset.m8173getXimpl(j) - Float.intBitsToFloat((int) (j2 >> 32));
        float m8174getYimpl = IntOffset.m8174getYimpl(j) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(m8173getXimpl) << 32) | (Float.floatToRawIntBits(m8174getYimpl) & 4294967295L));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m8188plusNvtHpc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + IntOffset.m8173getXimpl(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + IntOffset.m8174getYimpl(j2);
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m8189plusoCl6YwE(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + IntOffset.m8173getXimpl(j);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + IntOffset.m8174getYimpl(j);
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m8190roundk4lQ0M(long j) {
        return IntOffset.m8167constructorimpl((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m8191toOffsetgyyYBs(long j) {
        float m8173getXimpl = IntOffset.m8173getXimpl(j);
        float m8174getYimpl = IntOffset.m8174getYimpl(j);
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(m8174getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m8173getXimpl) << 32));
    }
}
