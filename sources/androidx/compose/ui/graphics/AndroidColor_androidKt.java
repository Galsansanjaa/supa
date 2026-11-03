package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidColor_androidKt {
    public static final long fromColorLong(Color.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return Color.m5328constructorimpl(j);
    }

    /* renamed from: isColorSpaceSupported-8_81llA, reason: not valid java name */
    public static final boolean m5199isColorSpaceSupported8_81llA(long j) {
        int i = (int) (j & 63);
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return (i == colorSpaces.getOklab().getId$ui_graphics() || i == colorSpaces.getCieXyz().getId$ui_graphics() || i == colorSpaces.getCieLab().getId$ui_graphics()) ? false : true;
    }

    /* renamed from: toColorLong-8_81llA, reason: not valid java name */
    public static final long m5200toColorLong8_81llA(long j) {
        long j2 = 63 & j;
        int i = (int) j2;
        if (i <= 15) {
            return j;
        }
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return i == colorSpaces.getUnspecified$ui_graphics().getId$ui_graphics() ? ColorKt.m5386toArgb8_81llA(j) : ((i == colorSpaces.getBt2020Hlg().getId$ui_graphics() || i == colorSpaces.getBt2020Pq().getId$ui_graphics()) && Build.VERSION.SDK_INT < 34) ? ColorKt.m5386toArgb8_81llA(j) : (i != colorSpaces.getOklab().getId$ui_graphics() || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : ColorKt.m5386toArgb8_81llA(j);
    }

    /* renamed from: toSupportedColorLong-8_81llA, reason: not valid java name */
    public static final long m5201toSupportedColorLong8_81llA(long j) {
        return m5199isColorSpaceSupported8_81llA(j) ? m5200toColorLong8_81llA(j) : m5200toColorLong8_81llA(Color.m5329convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()));
    }
}
