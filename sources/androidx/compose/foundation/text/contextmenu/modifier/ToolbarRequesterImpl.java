package androidx.compose.foundation.text.contextmenu.modifier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ToolbarRequesterImpl extends ToolbarRequester {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void hide() {
        TextContextMenuToolbarHandlerNode toolbarHandlerNode$foundation = getToolbarHandlerNode$foundation();
        if (toolbarHandlerNode$foundation != null) {
            toolbarHandlerNode$foundation.hide();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester
    public void show() {
        TextContextMenuToolbarHandlerNode requireInitialized$foundation = requireInitialized$foundation();
        if (requireInitialized$foundation != null) {
            requireInitialized$foundation.show();
        }
    }
}
