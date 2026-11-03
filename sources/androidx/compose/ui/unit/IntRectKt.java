package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntRectKt {
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m8205IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m8173getXimpl(j), IntOffset.m8174getYimpl(j), IntOffset.m8173getXimpl(j2), IntOffset.m8174getYimpl(j2));
    }

    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m8206IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m8173getXimpl(j), IntOffset.m8174getYimpl(j), IntOffset.m8173getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m8174getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m8207IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m8173getXimpl(j) - i, IntOffset.m8174getYimpl(j) - i, IntOffset.m8173getXimpl(j) + i, IntOffset.m8174getYimpl(j) + i);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
