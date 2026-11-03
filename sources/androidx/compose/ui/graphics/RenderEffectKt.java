package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RenderEffectKt {
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m5655BlurEffect3YTHUZs(float f, float f2, int i) {
        return new BlurEffect(null, f, f2, i, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m5656BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m5726getClamp3opZhB0();
        }
        return m5655BlurEffect3YTHUZs(f, f2, i);
    }

    public static final OffsetEffect OffsetEffect(float f, float f2) {
        return new OffsetEffect(null, Offset.m5082constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), null);
    }
}
