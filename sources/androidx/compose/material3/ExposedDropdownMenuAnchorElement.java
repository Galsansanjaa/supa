package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class ExposedDropdownMenuAnchorElement extends ModifierNodeElement<ExposedDropdownMenuAnchorNode> {
    private final os0 updateStateOnAttach;

    public ExposedDropdownMenuAnchorElement(os0 os0Var) {
        this.updateStateOnAttach = os0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ExposedDropdownMenuAnchorNode create() {
        return new ExposedDropdownMenuAnchorNode(this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExposedDropdownMenuAnchorElement) && this.updateStateOnAttach == ((ExposedDropdownMenuAnchorElement) obj).updateStateOnAttach;
    }

    public final os0 getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.updateStateOnAttach.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("exposedDropdownMenuAnchorType");
        inspectorInfo.getProperties().set("updateStateOnAttach", this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ExposedDropdownMenuAnchorNode exposedDropdownMenuAnchorNode) {
        exposedDropdownMenuAnchorNode.setUpdateStateOnAttach(this.updateStateOnAttach);
    }
}
