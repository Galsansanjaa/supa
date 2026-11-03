package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FilterTextContextMenuDataComponentsNode extends Modifier.Node implements TraversableNode {
    private ps0 filter;

    public FilterTextContextMenuDataComponentsNode(ps0 ps0Var) {
        this.filter = ps0Var;
    }

    public final ps0 getFilter() {
        return this.filter;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TextContextMenuDataTraverseKey.INSTANCE;
    }

    public final void setFilter(ps0 ps0Var) {
        this.filter = ps0Var;
    }
}
