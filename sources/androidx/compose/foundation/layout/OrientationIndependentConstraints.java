package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.k93;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ OrientationIndependentConstraints m1022boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl */
    public static long m1023constructorimpl(int i, int i2, int i3, int i4) {
        return m1024constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl */
    private static long m1024constructorimpl(long j) {
        return j;
    }

    /* renamed from: constructor-impl */
    public static long m1025constructorimpl(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m1023constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m8016getMinWidthimpl(j) : Constraints.m8015getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m8014getMaxWidthimpl(j) : Constraints.m8013getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m8015getMinHeightimpl(j) : Constraints.m8016getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m8013getMaxHeightimpl(j) : Constraints.m8014getMaxWidthimpl(j));
    }

    /* renamed from: copy-yUG9Ft0 */
    public static final long m1026copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m1023constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: copy-yUG9Ft0$default */
    public static /* synthetic */ long m1027copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m8016getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m8014getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m8015getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m8013getMaxHeightimpl(j);
        }
        return m1026copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl */
    public static boolean m1028equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m8007equalsimpl0(j, ((OrientationIndependentConstraints) obj).m1040unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m1029equalsimpl0(long j, long j2) {
        return Constraints.m8007equalsimpl0(j, j2);
    }

    /* renamed from: getCrossAxisMax-impl */
    public static final int m1030getCrossAxisMaximpl(long j) {
        return Constraints.m8013getMaxHeightimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl */
    public static final int m1031getCrossAxisMinimpl(long j) {
        return Constraints.m8015getMinHeightimpl(j);
    }

    /* renamed from: getMainAxisMax-impl */
    public static final int m1032getMainAxisMaximpl(long j) {
        return Constraints.m8014getMaxWidthimpl(j);
    }

    /* renamed from: getMainAxisMin-impl */
    public static final int m1033getMainAxisMinimpl(long j) {
        return Constraints.m8016getMinWidthimpl(j);
    }

    /* renamed from: hashCode-impl */
    public static int m1034hashCodeimpl(long j) {
        return Constraints.m8017hashCodeimpl(j);
    }

    /* renamed from: maxHeight-impl */
    public static final int m1035maxHeightimpl(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m8013getMaxHeightimpl(j) : Constraints.m8014getMaxWidthimpl(j);
    }

    /* renamed from: maxWidth-impl */
    public static final int m1036maxWidthimpl(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m8014getMaxWidthimpl(j) : Constraints.m8013getMaxHeightimpl(j);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y */
    public static final long m1037stretchCrossAxisq4ezo7Y(long j) {
        return m1023constructorimpl(Constraints.m8016getMinWidthimpl(j), Constraints.m8014getMaxWidthimpl(j), Constraints.m8013getMaxHeightimpl(j) != Integer.MAX_VALUE ? Constraints.m8013getMaxHeightimpl(j) : Constraints.m8015getMinHeightimpl(j), Constraints.m8013getMaxHeightimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s */
    public static final long m1038toBoxConstraintsOenEA2s(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m8016getMinWidthimpl(j), Constraints.m8014getMaxWidthimpl(j), Constraints.m8015getMinHeightimpl(j), Constraints.m8013getMaxHeightimpl(j)) : ConstraintsKt.Constraints(Constraints.m8015getMinHeightimpl(j), Constraints.m8013getMaxHeightimpl(j), Constraints.m8016getMinWidthimpl(j), Constraints.m8014getMaxWidthimpl(j));
    }

    /* renamed from: toString-impl */
    public static String m1039toStringimpl(long j) {
        return k93.m("OrientationIndependentConstraints(value=", Constraints.m8019toStringimpl(j), ")");
    }

    public boolean equals(Object obj) {
        return m1028equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1034hashCodeimpl(this.value);
    }

    public String toString() {
        return m1039toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m1040unboximpl() {
        return this.value;
    }
}
