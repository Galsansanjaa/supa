package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleWidth = Dp.m8049constructorimpl(25.0f);
    private static final float HandleHeight = Dp.m8049constructorimpl(25.0f);
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", (ts0) null, 2, (sb0) null);

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m2132getAdjustedCoordinatesk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f;
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z) {
        if (resolvedTextDirection != ResolvedTextDirection.Ltr || z) {
            return resolvedTextDirection == ResolvedTextDirection.Rtl && z;
        }
        return true;
    }

    public static final boolean isLeftSelectionHandle(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return z ? isHandleLtrDirection(resolvedTextDirection, z2) : !isHandleLtrDirection(resolvedTextDirection, z2);
    }
}
