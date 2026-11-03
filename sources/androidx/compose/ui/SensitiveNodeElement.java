package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    private final boolean isContentSensitive;

    public SensitiveNodeElement(boolean z) {
        this.isContentSensitive = z;
    }

    public static /* synthetic */ SensitiveNodeElement copy$default(SensitiveNodeElement sensitiveNodeElement, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sensitiveNodeElement.isContentSensitive;
        }
        return sensitiveNodeElement.copy(z);
    }

    public final boolean component1() {
        return this.isContentSensitive;
    }

    public final SensitiveNodeElement copy(boolean z) {
        return new SensitiveNodeElement(z);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SensitiveContentNode create() {
        return new SensitiveContentNode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.isContentSensitive == ((SensitiveNodeElement) obj).isContentSensitive;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.isContentSensitive ? 1231 : 1237;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", Boolean.valueOf(this.isContentSensitive));
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public String toString() {
        return "SensitiveNodeElement(isContentSensitive=" + this.isContentSensitive + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.setContentSensitive(this.isContentSensitive);
    }
}
