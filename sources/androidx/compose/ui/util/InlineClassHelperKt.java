package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final float unpackAbsFloat1(long j) {
        return Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j) {
        return Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackFloat2(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }
}
