package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    public static final int $stable = 8;
    private ps0 builder;

    public AddTextContextMenuDataComponentsNode(ps0 ps0Var) {
        this.builder = ps0Var;
    }

    public final ps0 getBuilder() {
        return this.builder;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setBuilder(ps0 ps0Var) {
        this.builder = ps0Var;
    }
}
