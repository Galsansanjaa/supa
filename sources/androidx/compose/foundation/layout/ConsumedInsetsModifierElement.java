package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ConsumedInsetsModifierElement extends ModifierNodeElement<ConsumedInsetsModifierNode> {
    private final ps0 block;
    private final ps0 inspectorInfo;

    public ConsumedInsetsModifierElement(ps0 ps0Var, ps0 ps0Var2) {
        this.block = ps0Var;
        this.inspectorInfo = ps0Var2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ConsumedInsetsModifierNode create() {
        return new ConsumedInsetsModifierNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifierElement) && ((ConsumedInsetsModifierElement) obj).block == this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ConsumedInsetsModifierNode consumedInsetsModifierNode) {
        consumedInsetsModifierNode.update(this.block);
    }
}
