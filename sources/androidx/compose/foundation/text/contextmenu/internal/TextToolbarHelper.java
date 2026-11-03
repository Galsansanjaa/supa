package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextToolbarHelper {
    public static final TextToolbarHelper INSTANCE = new TextToolbarHelper();

    private TextToolbarHelper() {
    }

    public final void invalidateContentRect(ActionMode actionMode) {
        TextToolbarHelperApi23.INSTANCE.invalidateContentRect(actionMode);
    }

    public final ActionMode startActionMode(View view, TextActionModeCallback textActionModeCallback) {
        return TextToolbarHelperApi23.INSTANCE.startActionMode(view, new FloatingTextActionModeCallback(textActionModeCallback), 1);
    }
}
