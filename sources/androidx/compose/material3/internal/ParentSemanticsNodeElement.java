package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ParentSemanticsNodeElement extends ModifierNodeElement<ParentSemanticsNode> {
    public static final int $stable = 0;
    private final ps0 properties;

    public ParentSemanticsNodeElement(ps0 ps0Var) {
        this.properties = ps0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ParentSemanticsNode create() {
        return new ParentSemanticsNode(this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.properties == ((ParentSemanticsNodeElement) obj).properties;
    }

    public final ps0 getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("parentSemantics");
        inspectorInfo.getProperties().set("properties", this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ParentSemanticsNode parentSemanticsNode) {
        parentSemanticsNode.setProperties(this.properties);
        SemanticsModifierNodeKt.invalidateSemantics(parentSemanticsNode);
    }
}
