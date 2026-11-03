package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntSizeKt {
    public static final long IntSize(int i, int i2) {
        return IntSize.m8211constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m8222getCenterozmzZPI(long j) {
        return IntOffset.m8167constructorimpl((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }

    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m8223getCenterozmzZPI$annotations(long j) {
    }

    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m8224roundToIntSizeuvyYCjk(long j) {
        return IntSize.m8211constructorimpl((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m8225timesO0kMr_c(int i, long j) {
        return IntSize.m8218timesYEO4UFw(j, i);
    }

    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m8226toIntRectozmzZPI(long j) {
        return IntRectKt.m8206IntRectVbeCjmY(IntOffset.Companion.m8184getZeronOccac(), j);
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m8227toIntSizeuvyYCjk(long j) {
        return IntSize.m8211constructorimpl((((int) Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m8228toSizeozmzZPI(long j) {
        return Size.m5150constructorimpl((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }
}
