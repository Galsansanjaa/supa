package androidx.compose.foundation.text.input.internal;

import androidx.collection.SieveCacheKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntervalKt {
    private static final long FLAG1_MASK = Long.MIN_VALUE;
    private static final long FLAG2_MASK = 2147483648L;
    private static final long INT1_MASK = 9223372032559808512L;
    private static final long INT2_MASK = 2147483647L;

    /* renamed from: overlaps-NFQVc3s, reason: not valid java name */
    public static final boolean m1897overlapsNFQVc3s(long j, int i, int i2) {
        return IntIntervalTreeKt.intersect(i, i2, Interval.m1881getStartimpl(j), Interval.m1878getEndimpl(j));
    }

    public static final long packFlag1(long j, boolean z) {
        return z ? j | Long.MIN_VALUE : j & Long.MAX_VALUE;
    }

    public static final long packFlag2(long j, boolean z) {
        return z ? j | FLAG2_MASK : j & (-2147483649L);
    }

    public static final long packValue1(long j, int i) {
        return (j & (-9223372032559808513L)) | ((i << 32) & INT1_MASK);
    }

    public static final long packValue2(long j, int i) {
        return (j & SieveCacheKt.NodeMetaAndPreviousMask) | i;
    }

    public static final long packValuesAndFlags(boolean z, int i, boolean z2, int i2) {
        long j = i;
        long j2 = i2 & 2147483647L;
        long j3 = z ? (j << 32) | Long.MIN_VALUE : (j << 32) & Long.MAX_VALUE;
        if (z2) {
            j2 |= FLAG2_MASK;
        }
        return j3 | j2;
    }

    public static final boolean unpackFlag1(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    public static final boolean unpackFlag2(long j) {
        return (j & FLAG2_MASK) != 0;
    }

    public static final int unpackValue1(long j) {
        return (int) ((j & INT1_MASK) >>> 32);
    }

    public static final int unpackValue2(long j) {
        return (int) (j & 2147483647L);
    }
}
