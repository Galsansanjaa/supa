package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m8049constructorimpl(10.0f);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m2200getRippleEndRadiuscSwnlzA(Density density, boolean z, long j) {
        float m5088getDistanceimpl = Offset.m5088getDistanceimpl(OffsetKt.Offset(Size.m5159getWidthimpl(j), Size.m5156getHeightimpl(j))) / 2.0f;
        return z ? density.mo473toPx0680j_4(BoundedRippleExtraRadius) + m5088getDistanceimpl : m5088getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m2201getRippleStartRadiusuvyYCjk(long j) {
        return Math.max(Size.m5159getWidthimpl(j), Size.m5156getHeightimpl(j)) * 0.3f;
    }
}
