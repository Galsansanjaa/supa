package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    private final ps0 onKeyEvent;
    private final ps0 onPreKeyEvent;

    public KeyInputElement(ps0 ps0Var, ps0 ps0Var2) {
        this.onKeyEvent = ps0Var;
        this.onPreKeyEvent = ps0Var2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    public final ps0 getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final ps0 getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ps0 ps0Var = this.onKeyEvent;
        int hashCode = (ps0Var != null ? ps0Var.hashCode() : 0) * 31;
        ps0 ps0Var2 = this.onPreKeyEvent;
        return hashCode + (ps0Var2 != null ? ps0Var2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        ps0 ps0Var = this.onKeyEvent;
        if (ps0Var != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", ps0Var);
        }
        ps0 ps0Var2 = this.onPreKeyEvent;
        if (ps0Var2 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", ps0Var2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
