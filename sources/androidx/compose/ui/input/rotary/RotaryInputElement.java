package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final ps0 onPreRotaryScrollEvent;
    private final ps0 onRotaryScrollEvent;

    public RotaryInputElement(ps0 ps0Var, ps0 ps0Var2) {
        this.onRotaryScrollEvent = ps0Var;
        this.onPreRotaryScrollEvent = ps0Var2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return this.onRotaryScrollEvent == rotaryInputElement.onRotaryScrollEvent && this.onPreRotaryScrollEvent == rotaryInputElement.onPreRotaryScrollEvent;
    }

    public final ps0 getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final ps0 getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ps0 ps0Var = this.onRotaryScrollEvent;
        int hashCode = (ps0Var != null ? ps0Var.hashCode() : 0) * 31;
        ps0 ps0Var2 = this.onPreRotaryScrollEvent;
        return hashCode + (ps0Var2 != null ? ps0Var2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        ps0 ps0Var = this.onRotaryScrollEvent;
        if (ps0Var != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", ps0Var);
        }
        ps0 ps0Var2 = this.onPreRotaryScrollEvent;
        if (ps0Var2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", ps0Var2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
