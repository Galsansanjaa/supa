package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import defpackage.bb1;
import defpackage.os0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class SharedTransitionScope$skipToLookaheadPosition$3 extends bb1 implements ts0 {
    final /* synthetic */ os0 $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$3(os0 os0Var) {
        super(2);
        this.$enabled = os0Var;
    }

    @Override // defpackage.ts0
    public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return (Boolean) this.$enabled.invoke();
    }
}
