package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.hu2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                int i2;
                int i3;
                int i4;
                i2 = insets.top;
                i3 = insets.right;
                i4 = insets.bottom;
                return Insets.of(i, i2, i3, i4);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo1102consumedOffsetsMKHz9U(long j) {
                return Offset.m5082constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo1103consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m8283getXimpl(j) - f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float hideMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf > 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float showMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf < 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i;
                i = insets.left;
                return i;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                int i2;
                int i3;
                int i4;
                i2 = insets.left;
                i3 = insets.right;
                i4 = insets.bottom;
                return Insets.of(i2, i, i3, i4);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo1102consumedOffsetsMKHz9U(long j) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo1103consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m8284getYimpl(j) - f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float hideMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf > 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float showMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf < 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i;
                i = insets.top;
                return i;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                int i2;
                int i3;
                int i4;
                i2 = insets.left;
                i3 = insets.top;
                i4 = insets.bottom;
                return Insets.of(i2, i3, i, i4);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo1102consumedOffsetsMKHz9U(long j) {
                return Offset.m5082constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo1103consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m8283getXimpl(j) + f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float hideMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf > 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float showMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf < 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i;
                i = insets.right;
                return i;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                int i2;
                int i3;
                int i4;
                i2 = insets.left;
                i3 = insets.top;
                i4 = insets.right;
                return Insets.of(i2, i3, i4, i);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo1102consumedOffsetsMKHz9U(long j) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                return Offset.m5082constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo1103consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m8284getYimpl(j) + f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float hideMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf > 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public final float showMotion(float f, float f2) {
                float motionOf = motionOf(f, f2);
                if (motionOf < 0.0f) {
                    return 0.0f;
                }
                return motionOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i;
                i = insets.bottom;
                return i;
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m1104chooseCalculatorni1skBw(int i, LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1169getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1172getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1170getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1166getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1171getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m1155equalsimpl0(i, companion.m1167getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            hu2.h("Only Left, Top, Right, Bottom, Start and End are allowed");
            return null;
        }
    }

    Insets adjustInsets(Insets insets, int i);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo1102consumedOffsetsMKHz9U(long j);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo1103consumedVelocityQWom1Mo(long j, float f);

    float hideMotion(float f, float f2);

    float motionOf(float f, float f2);

    float showMotion(float f, float f2);

    int valueOf(Insets insets);
}
