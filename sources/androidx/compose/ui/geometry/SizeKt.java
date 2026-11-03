package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SizeKt {
    public static final long Size(float f, float f2) {
        return Size.m5150constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m5169getCenteruvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5170getCenteruvyYCjk$annotations(long j) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m5171isSpecifieduvyYCjk(long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5172isSpecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m5173isUnspecifieduvyYCjk(long j) {
        return j == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m5174isUnspecifieduvyYCjk$annotations(long j) {
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m5175lerpVgWVRYQ(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return Size.m5150constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m5176takeOrElseTmRCtEA(long j, os0 os0Var) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((Size) os0Var.invoke()).m5164unboximpl();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5177timesd16Qtg0(double d, long j) {
        return Size.m5162times7Ah8Wj8(j, (float) d);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5178timesd16Qtg0(float f, long j) {
        return Size.m5162times7Ah8Wj8(j, f);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m5179timesd16Qtg0(int i, long j) {
        return Size.m5162times7Ah8Wj8(j, i);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m5180toRectuvyYCjk(long j) {
        return RectKt.m5130Recttz77jQw(Offset.Companion.m5106getZeroF1C5BW0(), j);
    }
}
