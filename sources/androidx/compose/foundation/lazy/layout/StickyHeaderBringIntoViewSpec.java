package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class StickyHeaderBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean isVertical;
    private final LayoutDirection layoutDirection;
    private final boolean reverseLayout;
    private final os0 stickyItemsCombinedSizeLambda;

    public StickyHeaderBringIntoViewSpec(os0 os0Var, boolean z, LayoutDirection layoutDirection, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.stickyItemsCombinedSizeLambda = os0Var;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
        this.isVertical = z2;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f, float f2, float f3) {
        float intValue = ((Number) this.stickyItemsCombinedSizeLambda.invoke()).intValue();
        boolean z = false;
        boolean z2 = this.layoutDirection == LayoutDirection.Rtl;
        boolean z3 = this.reverseLayout;
        if (!this.isVertical && z2) {
            z = true;
        }
        if (z3 == z) {
            f -= intValue;
        }
        return this.bringIntoViewSpec.calculateScrollDistance(f, f2, f3 - intValue);
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final AnimationSpec getScrollAnimationSpec() {
        return BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation();
    }
}
