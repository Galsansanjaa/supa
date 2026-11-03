package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r21, float r22, float r23, float r24, androidx.compose.ui.graphics.colorspace.ColorSpace r25) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long Color(int i) {
        return Color.m5328constructorimpl(i << 32);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long Color(long j) {
        return Color.m5328constructorimpl(j << 32);
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m5377compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m5329convertvNxB06k = Color.m5329convertvNxB06k(j, Color.m5336getColorSpaceimpl(j2));
        float m5334getAlphaimpl = Color.m5334getAlphaimpl(j2);
        float m5334getAlphaimpl2 = Color.m5334getAlphaimpl(m5329convertvNxB06k);
        float f3 = 1.0f - m5334getAlphaimpl2;
        float f4 = (m5334getAlphaimpl * f3) + m5334getAlphaimpl2;
        float m5338getRedimpl = Color.m5338getRedimpl(m5329convertvNxB06k);
        float m5338getRedimpl2 = Color.m5338getRedimpl(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((m5338getRedimpl2 * m5334getAlphaimpl) * f3) + (m5338getRedimpl * m5334getAlphaimpl2)) / f4;
        }
        float m5337getGreenimpl = Color.m5337getGreenimpl(m5329convertvNxB06k);
        float m5337getGreenimpl2 = Color.m5337getGreenimpl(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((m5337getGreenimpl2 * m5334getAlphaimpl) * f3) + (m5337getGreenimpl * m5334getAlphaimpl2)) / f4;
        }
        float m5335getBlueimpl = Color.m5335getBlueimpl(m5329convertvNxB06k);
        float m5335getBlueimpl2 = Color.m5335getBlueimpl(j2);
        if (f4 != 0.0f) {
            f5 = (((m5335getBlueimpl2 * m5334getAlphaimpl) * f3) + (m5335getBlueimpl * m5334getAlphaimpl2)) / f4;
        }
        return UncheckedColor(f, f2, f5, f4, Color.m5336getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m5378getComponents8_81llA(long j) {
        return new float[]{Color.m5338getRedimpl(j), Color.m5337getGreenimpl(j), Color.m5335getBlueimpl(j), Color.m5334getAlphaimpl(j)};
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m5379isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m5380isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m5381isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m5382isUnspecified8_81llA$annotations(long j) {
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m5383lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m5329convertvNxB06k = Color.m5329convertvNxB06k(j, oklab);
        long m5329convertvNxB06k2 = Color.m5329convertvNxB06k(j2, oklab);
        float m5334getAlphaimpl = Color.m5334getAlphaimpl(m5329convertvNxB06k);
        float m5338getRedimpl = Color.m5338getRedimpl(m5329convertvNxB06k);
        float m5337getGreenimpl = Color.m5337getGreenimpl(m5329convertvNxB06k);
        float m5335getBlueimpl = Color.m5335getBlueimpl(m5329convertvNxB06k);
        float m5334getAlphaimpl2 = Color.m5334getAlphaimpl(m5329convertvNxB06k2);
        float m5338getRedimpl2 = Color.m5338getRedimpl(m5329convertvNxB06k2);
        float m5337getGreenimpl2 = Color.m5337getGreenimpl(m5329convertvNxB06k2);
        float m5335getBlueimpl2 = Color.m5335getBlueimpl(m5329convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m5329convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m5338getRedimpl, m5338getRedimpl2, f), MathHelpersKt.lerp(m5337getGreenimpl, m5337getGreenimpl2, f), MathHelpersKt.lerp(m5335getBlueimpl, m5335getBlueimpl2, f), MathHelpersKt.lerp(m5334getAlphaimpl, m5334getAlphaimpl2, f), oklab), Color.m5336getColorSpaceimpl(j2));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m5384luminance8_81llA(long j) {
        ColorSpace m5336getColorSpaceimpl = Color.m5336getColorSpaceimpl(j);
        if (!ColorModel.m5763equalsimpl0(m5336getColorSpaceimpl.m5772getModelxdoWZVw(), ColorModel.Companion.m5770getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.m5766toStringimpl(m5336getColorSpaceimpl.m5772getModelxdoWZVw()));
        }
        DoubleFunction eotfFunc$ui_graphics = ((Rgb) m5336getColorSpaceimpl).getEotfFunc$ui_graphics();
        double invoke = eotfFunc$ui_graphics.invoke(Color.m5338getRedimpl(j));
        float invoke2 = (float) ((eotfFunc$ui_graphics.invoke(Color.m5335getBlueimpl(j)) * 0.0722d) + (eotfFunc$ui_graphics.invoke(Color.m5337getGreenimpl(j)) * 0.7152d) + (invoke * 0.2126d));
        if (invoke2 < 0.0f) {
            invoke2 = 0.0f;
        }
        if (invoke2 > 1.0f) {
            return 1.0f;
        }
        return invoke2;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m5385takeOrElseDxMtmZc(long j, os0 os0Var) {
        return j != 16 ? j : ((Color) os0Var.invoke()).m5342unboximpl();
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m5386toArgb8_81llA(long j) {
        return (int) (Color.m5329convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }
}
