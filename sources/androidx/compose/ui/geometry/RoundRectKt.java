package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long m5044constructorimpl = CornerRadius.m5044constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        return new RoundRect(f, f2, f3, f4, m5044constructorimpl, m5044constructorimpl, m5044constructorimpl, m5044constructorimpl, null);
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m5142RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m5144RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m5145RoundRectsniSvfs(Rect rect, long j) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        float width = (roundRect.getWidth() / 2.0f) + roundRect.getLeft();
        float height = (roundRect.getHeight() / 2.0f) + roundRect.getTop();
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        float max = Math.max(Float.intBitsToFloat((int) (roundRect.m5138getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m5140getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float max2 = Math.max(Float.intBitsToFloat((int) (roundRect.m5140getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m5141getTopRightCornerRadiuskKHJgLs() & 4294967295L)));
        return new Rect((max * 0.29289323f) + roundRect.getLeft(), (max2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m5141getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m5139getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m5139getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (4294967295L & roundRect.m5138getBottomLeftCornerRadiuskKHJgLs()))) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m5140getTopLeftCornerRadiuskKHJgLs() == roundRect.m5141getTopRightCornerRadiuskKHJgLs() && roundRect.m5141getTopRightCornerRadiuskKHJgLs() == roundRect.m5139getBottomRightCornerRadiuskKHJgLs() && roundRect.m5139getBottomRightCornerRadiuskKHJgLs() == roundRect.m5138getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m5140getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m5140getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long m5140getTopLeftCornerRadiuskKHJgLs = roundRect.m5140getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m5140getTopLeftCornerRadiuskKHJgLs) & (m5140getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m5141getTopRightCornerRadiuskKHJgLs = roundRect.m5141getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m5141getTopRightCornerRadiuskKHJgLs) & (m5141getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m5138getBottomLeftCornerRadiuskKHJgLs = roundRect.m5138getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~m5138getBottomLeftCornerRadiuskKHJgLs) & (m5138getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long m5139getBottomRightCornerRadiuskKHJgLs = roundRect.m5139getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~m5139getBottomRightCornerRadiuskKHJgLs) & (m5139getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long m5140getTopLeftCornerRadiuskKHJgLs = roundRect.m5140getTopLeftCornerRadiuskKHJgLs();
        return (m5140getTopLeftCornerRadiuskKHJgLs >>> 32) == (m5140getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m5140getTopLeftCornerRadiuskKHJgLs() == roundRect.m5141getTopRightCornerRadiuskKHJgLs() && roundRect.m5140getTopLeftCornerRadiuskKHJgLs() == roundRect.m5139getBottomRightCornerRadiuskKHJgLs() && roundRect.m5140getTopLeftCornerRadiuskKHJgLs() == roundRect.m5138getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m5063lerp3Ry4LBc(roundRect.m5140getTopLeftCornerRadiuskKHJgLs(), roundRect2.m5140getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m5063lerp3Ry4LBc(roundRect.m5141getTopRightCornerRadiuskKHJgLs(), roundRect2.m5141getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m5063lerp3Ry4LBc(roundRect.m5139getBottomRightCornerRadiuskKHJgLs(), roundRect2.m5139getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m5063lerp3Ry4LBc(roundRect.m5138getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m5138getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m5146translateUv8p0NA(RoundRect roundRect, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (4294967295L & j);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getTop(), roundRect.getRight() + Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + roundRect.getBottom(), roundRect.m5140getTopLeftCornerRadiuskKHJgLs(), roundRect.m5141getTopRightCornerRadiuskKHJgLs(), roundRect.m5139getBottomRightCornerRadiuskKHJgLs(), roundRect.m5138getBottomLeftCornerRadiuskKHJgLs(), null);
    }
}
