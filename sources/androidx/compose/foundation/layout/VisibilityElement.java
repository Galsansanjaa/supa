package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class VisibilityElement extends ModifierNodeElement<VisibilityNode> {
    private final boolean visible;

    public VisibilityElement(boolean z) {
        this.visible = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public VisibilityNode create() {
        return new VisibilityNode(this.visible);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        VisibilityElement visibilityElement = obj instanceof VisibilityElement ? (VisibilityElement) obj : null;
        return visibilityElement != null && this.visible == visibilityElement.visible;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.visible ? 1231 : 1237;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("Visible");
        inspectorInfo.getProperties().set("Visible", Boolean.valueOf(this.visible));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(VisibilityNode visibilityNode) {
        boolean m1144getVisible = visibilityNode.m1144getVisible();
        boolean z = this.visible;
        if (m1144getVisible != z) {
            visibilityNode.setVisible(z);
        }
    }
}
