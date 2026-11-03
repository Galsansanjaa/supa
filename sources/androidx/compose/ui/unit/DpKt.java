package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.ea0;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DpKt {
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m8070DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m8105constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m8071DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m8138constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m8072coerceAtLeastYgX7TsA(float f, float f2) {
        if (f < f2) {
            f = f2;
        }
        return Dp.m8049constructorimpl(f);
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m8073coerceAtMostYgX7TsA(float f, float f2) {
        if (f > f2) {
            f = f2;
        }
        return Dp.m8049constructorimpl(f);
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m8074coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m8049constructorimpl(ea0.n(f, f2, f3));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m8075getCenterEaSLcWc(long j) {
        float m8049constructorimpl = Dp.m8049constructorimpl(DpSize.m8147getWidthD9Ej5fM(j) / 2.0f);
        float m8049constructorimpl2 = Dp.m8049constructorimpl(DpSize.m8145getHeightD9Ej5fM(j) / 2.0f);
        return DpOffset.m8105constructorimpl((Float.floatToRawIntBits(m8049constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(m8049constructorimpl) << 32));
    }

    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8076getCenterEaSLcWc$annotations(long j) {
    }

    public static final float getDp(double d) {
        return Dp.m8049constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return Dp.m8049constructorimpl(f);
    }

    public static final float getDp(int i) {
        return Dp.m8049constructorimpl(i);
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m8049constructorimpl(dpRect.m8131getBottomD9Ej5fM() - dpRect.m8134getTopD9Ej5fM());
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m8071DpSizeYgX7TsA(Dp.m8049constructorimpl(dpRect.m8133getRightD9Ej5fM() - dpRect.m8132getLeftD9Ej5fM()), Dp.m8049constructorimpl(dpRect.m8131getBottomD9Ej5fM() - dpRect.m8134getTopD9Ej5fM()));
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m8049constructorimpl(dpRect.m8133getRightD9Ej5fM() - dpRect.m8132getLeftD9Ej5fM());
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m8077isFinite0680j_4(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8078isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m8079isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8080isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m8081isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8082isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m8083isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m8084isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m8085isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m8086isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m8087isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m8088isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m8089isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m8090isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m8091lerpIDex15A(long j, long j2, float f) {
        float m8092lerpMdfbLM = m8092lerpMdfbLM(DpSize.m8147getWidthD9Ej5fM(j), DpSize.m8147getWidthD9Ej5fM(j2), f);
        float m8092lerpMdfbLM2 = m8092lerpMdfbLM(DpSize.m8145getHeightD9Ej5fM(j), DpSize.m8145getHeightD9Ej5fM(j2), f);
        return DpSize.m8138constructorimpl((Float.floatToRawIntBits(m8092lerpMdfbLM) << 32) | (Float.floatToRawIntBits(m8092lerpMdfbLM2) & 4294967295L));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m8092lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m8049constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m8093lerpxhh869w(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(DpOffset.m8110getXD9Ej5fM(j), DpOffset.m8110getXD9Ej5fM(j2), f);
        float lerp2 = MathHelpersKt.lerp(DpOffset.m8112getYD9Ej5fM(j), DpOffset.m8112getYD9Ej5fM(j2), f);
        return DpOffset.m8105constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m8094maxYgX7TsA(float f, float f2) {
        return Dp.m8049constructorimpl(Math.max(f, f2));
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m8095minYgX7TsA(float f, float f2) {
        return Dp.m8049constructorimpl(Math.min(f, f2));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m8096takeOrElseD5KLDUw(float f, os0 os0Var) {
        return !Float.isNaN(f) ? f : ((Dp) os0Var.invoke()).m8063unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m8097takeOrElsegVKV90s(long j, os0 os0Var) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpOffset) os0Var.invoke()).m8118unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m8098takeOrElseitqla9I(long j, os0 os0Var) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpSize) os0Var.invoke()).m8155unboximpl();
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8099times3ABfNKs(double d, float f) {
        return Dp.m8049constructorimpl(((float) d) * f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8100times3ABfNKs(float f, float f2) {
        return Dp.m8049constructorimpl(f * f2);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m8101times3ABfNKs(int i, float f) {
        return Dp.m8049constructorimpl(i * f);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m8102times6HolHcs(float f, long j) {
        return DpSize.m8152timesGh9hcWk(j, f);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m8103times6HolHcs(int i, long j) {
        return DpSize.m8153timesGh9hcWk(j, i);
    }
}
