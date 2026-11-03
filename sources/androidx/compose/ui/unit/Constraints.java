package androidx.compose.ui.unit;

import defpackage.hd0;
import defpackage.i70;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default */
        public static /* synthetic */ long m8021restrictConstraintsxF2OJ5Q$default(Companion companion, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return companion.m8027restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        /* renamed from: fitPrioritizingHeight-Zbe2FdA */
        public final long m8022fitPrioritizingHeightZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i3, 262142);
            int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        i70.i();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
        }

        /* renamed from: fitPrioritizingWidth-Zbe2FdA */
        public final long m8023fitPrioritizingWidthZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int min = Math.min(i, 262142);
            int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        i70.i();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        /* renamed from: fixed-JhjzzOo */
        public final long m8024fixedJhjzzOo(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, i2, i2);
        }

        /* renamed from: fixedHeight-OenEA2s */
        public final long m8025fixedHeightOenEA2s(int i) {
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i, i);
        }

        /* renamed from: fixedWidth-OenEA2s */
        public final long m8026fixedWidthOenEA2s(int i) {
            if (!(i >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, 0, Integer.MAX_VALUE);
        }

        @hd0
        /* renamed from: restrictConstraints-xF2OJ5Q */
        public final long m8027restrictConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
            return z ? m8023fitPrioritizingWidthZbe2FdA(i, i2, i3, i4) : m8022fitPrioritizingHeightZbe2FdA(i, i2, i3, i4);
        }
    }

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Constraints m8001boximpl(long j) {
        return new Constraints(j);
    }

    /* renamed from: constructor-impl */
    public static long m8002constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-Zbe2FdA */
    public static final long m8003copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (!(i2 >= i && i4 >= i3 && i >= 0 && i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i4);
    }

    /* renamed from: copy-Zbe2FdA$default */
    public static /* synthetic */ long m8004copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m8016getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m8014getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m8015getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m8013getMaxHeightimpl(j);
        }
        return m8003copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* renamed from: copyMaxDimensions-msEJaDk */
    public static final long m8005copyMaxDimensionsmsEJaDk(long j) {
        return m8002constructorimpl(j & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl */
    public static boolean m8006equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).m8020unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m8007equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFocusIndex-impl */
    private static final int m8008getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* renamed from: getHasBoundedHeight-impl */
    public static final boolean m8009getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl */
    public static final boolean m8010getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl */
    public static final boolean m8011getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl */
    public static final boolean m8012getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* renamed from: getMaxHeight-impl */
    public static final int m8013getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMaxWidth-impl */
    public static final int m8014getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* renamed from: getMinHeight-impl */
    public static final int m8015getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* renamed from: getMinWidth-impl */
    public static final int m8016getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m8017hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl */
    public static final boolean m8018isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* renamed from: toString-impl */
    public static String m8019toStringimpl(long j) {
        int m8014getMaxWidthimpl = m8014getMaxWidthimpl(j);
        String valueOf = m8014getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m8014getMaxWidthimpl);
        int m8013getMaxHeightimpl = m8013getMaxHeightimpl(j);
        String valueOf2 = m8013getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(m8013getMaxHeightimpl) : "Infinity";
        return "Constraints(minWidth = " + m8016getMinWidthimpl(j) + ", maxWidth = " + valueOf + ", minHeight = " + m8015getMinHeightimpl(j) + ", maxHeight = " + valueOf2 + ")";
    }

    public boolean equals(Object obj) {
        return m8006equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m8017hashCodeimpl(this.value);
    }

    public String toString() {
        return m8019toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m8020unboximpl() {
        return this.value;
    }
}
