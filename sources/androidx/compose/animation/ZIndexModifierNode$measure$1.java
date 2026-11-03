package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import defpackage.bb1;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ZIndexModifierNode$measure$1 extends bb1 implements ps0 {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ ZIndexModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZIndexModifierNode$measure$1(Placeable placeable, ZIndexModifierNode zIndexModifierNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = zIndexModifierNode;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return vy2.a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        placementScope.place(this.$placeable, 0, 0, this.this$0.getZIndex());
    }
}
