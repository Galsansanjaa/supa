package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ts0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuGestureElement extends ModifierNodeElement<TextContextMenuGestureNode> {
    private final ts0 onPreShowContextMenu;

    public TextContextMenuGestureElement(ts0 ts0Var) {
        this.onPreShowContextMenu = ts0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextContextMenuGestureNode create() {
        return new TextContextMenuGestureNode(this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContextMenuGestureElement) && this.onPreShowContextMenu == ((TextContextMenuGestureElement) obj).onPreShowContextMenu;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ts0 ts0Var = this.onPreShowContextMenu;
        if (ts0Var != null) {
            return ts0Var.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set("onPreShowContextMenu", this.onPreShowContextMenu);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextContextMenuGestureNode textContextMenuGestureNode) {
        textContextMenuGestureNode.update(this.onPreShowContextMenu);
    }
}
