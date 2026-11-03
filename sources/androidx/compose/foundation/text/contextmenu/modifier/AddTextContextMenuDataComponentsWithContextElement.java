package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ts0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsWithContextElement extends ModifierNodeElement<AddTextContextMenuDataComponentsWithContextNode> {
    private final ts0 builder;

    public AddTextContextMenuDataComponentsWithContextElement(ts0 ts0Var) {
        this.builder = ts0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AddTextContextMenuDataComponentsWithContextNode create() {
        return new AddTextContextMenuDataComponentsWithContextNode(this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsWithContextElement) && this.builder == ((AddTextContextMenuDataComponentsWithContextElement) obj).builder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.builder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponentsWithResources");
        inspectorInfo.getProperties().set("builder", this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode) {
        addTextContextMenuDataComponentsWithContextNode.setBuilder(this.builder);
    }
}
