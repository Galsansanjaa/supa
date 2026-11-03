package defpackage;

import androidx.compose.animation.AnimateBoundsModifierKt;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements BoundsTransform {
    public final /* synthetic */ int a;

    public /* synthetic */ i7(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        switch (this.a) {
            case 0:
                return AnimateBoundsModifierKt.a(rect, rect2);
            case 1:
                return SharedBoundsNode.a(rect, rect2);
            default:
                return SharedTransitionDefaults.a(rect, rect2);
        }
    }
}
