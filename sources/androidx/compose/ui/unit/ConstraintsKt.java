package androidx.compose.ui.unit;

import defpackage.i70;
import defpackage.lt;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < MaxFocusMask ? 18 : 255;
    }

    /* renamed from: constrain-4WqzIAM */
    public static final long m8028constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int m8016getMinWidthimpl = Constraints.m8016getMinWidthimpl(j);
        int m8014getMaxWidthimpl = Constraints.m8014getMaxWidthimpl(j);
        if (i < m8016getMinWidthimpl) {
            i = m8016getMinWidthimpl;
        }
        if (i <= m8014getMaxWidthimpl) {
            m8014getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int m8015getMinHeightimpl = Constraints.m8015getMinHeightimpl(j);
        int m8013getMaxHeightimpl = Constraints.m8013getMaxHeightimpl(j);
        if (i2 < m8015getMinHeightimpl) {
            i2 = m8015getMinHeightimpl;
        }
        if (i2 <= m8013getMaxHeightimpl) {
            m8013getMaxHeightimpl = i2;
        }
        return IntSize.m8211constructorimpl((m8014getMaxWidthimpl << 32) | (4294967295L & m8013getMaxHeightimpl));
    }

    /* renamed from: constrain-N9IONVI */
    public static final long m8029constrainN9IONVI(long j, long j2) {
        int m8016getMinWidthimpl = Constraints.m8016getMinWidthimpl(j);
        int m8014getMaxWidthimpl = Constraints.m8014getMaxWidthimpl(j);
        int m8015getMinHeightimpl = Constraints.m8015getMinHeightimpl(j);
        int m8013getMaxHeightimpl = Constraints.m8013getMaxHeightimpl(j);
        int m8016getMinWidthimpl2 = Constraints.m8016getMinWidthimpl(j2);
        if (m8016getMinWidthimpl2 < m8016getMinWidthimpl) {
            m8016getMinWidthimpl2 = m8016getMinWidthimpl;
        }
        if (m8016getMinWidthimpl2 > m8014getMaxWidthimpl) {
            m8016getMinWidthimpl2 = m8014getMaxWidthimpl;
        }
        int m8014getMaxWidthimpl2 = Constraints.m8014getMaxWidthimpl(j2);
        if (m8014getMaxWidthimpl2 >= m8016getMinWidthimpl) {
            m8016getMinWidthimpl = m8014getMaxWidthimpl2;
        }
        if (m8016getMinWidthimpl <= m8014getMaxWidthimpl) {
            m8014getMaxWidthimpl = m8016getMinWidthimpl;
        }
        int m8015getMinHeightimpl2 = Constraints.m8015getMinHeightimpl(j2);
        if (m8015getMinHeightimpl2 < m8015getMinHeightimpl) {
            m8015getMinHeightimpl2 = m8015getMinHeightimpl;
        }
        if (m8015getMinHeightimpl2 > m8013getMaxHeightimpl) {
            m8015getMinHeightimpl2 = m8013getMaxHeightimpl;
        }
        int m8013getMaxHeightimpl2 = Constraints.m8013getMaxHeightimpl(j2);
        if (m8013getMaxHeightimpl2 >= m8015getMinHeightimpl) {
            m8015getMinHeightimpl = m8013getMaxHeightimpl2;
        }
        if (m8015getMinHeightimpl <= m8013getMaxHeightimpl) {
            m8013getMaxHeightimpl = m8015getMinHeightimpl;
        }
        return Constraints(m8016getMinWidthimpl2, m8014getMaxWidthimpl, m8015getMinHeightimpl2, m8013getMaxHeightimpl);
    }

    /* renamed from: constrainHeight-K40F9xA */
    public static final int m8030constrainHeightK40F9xA(long j, int i) {
        int m8015getMinHeightimpl = Constraints.m8015getMinHeightimpl(j);
        int m8013getMaxHeightimpl = Constraints.m8013getMaxHeightimpl(j);
        if (i < m8015getMinHeightimpl) {
            i = m8015getMinHeightimpl;
        }
        return i > m8013getMaxHeightimpl ? m8013getMaxHeightimpl : i;
    }

    /* renamed from: constrainWidth-K40F9xA */
    public static final int m8031constrainWidthK40F9xA(long j, int i) {
        int m8016getMinWidthimpl = Constraints.m8016getMinWidthimpl(j);
        int m8014getMaxWidthimpl = Constraints.m8014getMaxWidthimpl(j);
        if (i < m8016getMinWidthimpl) {
            i = m8016getMinWidthimpl;
        }
        return i > m8014getMaxWidthimpl ? m8014getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int bitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int bitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (bitsNeedForSizeUnchecked + bitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = bitsNeedForSizeUnchecked2 - 13;
        return Constraints.m8002constructorimpl(((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (bitsNeedForSizeUnchecked2 + 2)) | ((i8 & (~(i8 >> 31))) << (bitsNeedForSizeUnchecked2 + 33)));
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return (((i & 2) >> 1) * 3) + ((i & 1) << 1);
    }

    /* renamed from: isSatisfiedBy-4WqzIAM */
    public static final boolean m8032isSatisfiedBy4WqzIAM(long j, long j2) {
        int m8016getMinWidthimpl = Constraints.m8016getMinWidthimpl(j);
        int m8014getMaxWidthimpl = Constraints.m8014getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (m8016getMinWidthimpl > i || i > m8014getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return Constraints.m8015getMinHeightimpl(j) <= i2 && i2 <= Constraints.m8013getMaxHeightimpl(j);
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        i70.i();
        return 0;
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    /* renamed from: offset-NN6Ew-U */
    public static final long m8033offsetNN6EwU(long j, int i, int i2) {
        int m8016getMinWidthimpl = Constraints.m8016getMinWidthimpl(j) + i;
        if (m8016getMinWidthimpl < 0) {
            m8016getMinWidthimpl = 0;
        }
        int m8014getMaxWidthimpl = Constraints.m8014getMaxWidthimpl(j);
        if (m8014getMaxWidthimpl != Integer.MAX_VALUE && (m8014getMaxWidthimpl = m8014getMaxWidthimpl + i) < 0) {
            m8014getMaxWidthimpl = 0;
        }
        int m8015getMinHeightimpl = Constraints.m8015getMinHeightimpl(j) + i2;
        if (m8015getMinHeightimpl < 0) {
            m8015getMinHeightimpl = 0;
        }
        int m8013getMaxHeightimpl = Constraints.m8013getMaxHeightimpl(j);
        return Constraints(m8016getMinWidthimpl, m8014getMaxWidthimpl, m8015getMinHeightimpl, (m8013getMaxHeightimpl == Integer.MAX_VALUE || (m8013getMaxHeightimpl = m8013getMaxHeightimpl + i2) >= 0) ? m8013getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default */
    public static /* synthetic */ long m8034offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m8033offsetNN6EwU(j, i, i2);
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException(lt.x("Can't represent a width of ", i, " and height of ", i2, " in Constraints"));
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(sg3.o(i, "Can't represent a size of ", " in Constraints"));
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }
}
