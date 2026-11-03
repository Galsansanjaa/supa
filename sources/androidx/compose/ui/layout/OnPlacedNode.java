package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private ps0 callback;

    public OnPlacedNode(ps0 ps0Var) {
        this.callback = ps0Var;
    }

    public final ps0 getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo113onRemeasuredozmzZPI(long j) {
    }

    public final void setCallback(ps0 ps0Var) {
        this.callback = ps0Var;
    }
}
