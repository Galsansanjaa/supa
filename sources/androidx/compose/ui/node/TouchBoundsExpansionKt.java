package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TouchBoundsExpansionKt {
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4 */
    public static final DpTouchBoundsExpansion m7109DpTouchBoundsExpansiona9UjIt4(float f, float f2, float f3, float f4) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default */
    public static /* synthetic */ DpTouchBoundsExpansion m7110DpTouchBoundsExpansiona9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m8049constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m8049constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m8049constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m8049constructorimpl(0.0f);
        }
        return m7109DpTouchBoundsExpansiona9UjIt4(f, f2, f3, f4);
    }

    public static final long TouchBoundsExpansion(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i2 >= 0 && i2 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i4 >= 0 && i4 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m7095constructorimpl(TouchBoundsExpansion.Companion.pack$ui(i, i2, i3, i4, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return TouchBoundsExpansion(i, i2, i3, i4);
    }
}
