package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import defpackage.k2;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new k2(this, 8), null, null, null, null, null, null, 126, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 textActionModeCallback$lambda$0(AndroidTextToolbar androidTextToolbar) {
        androidTextToolbar.actionMode = null;
        return vy2.a;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4) {
        showMenu(rect, os0Var, os0Var2, os0Var3, os0Var4, null);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(os0Var);
        this.textActionModeCallback.setOnCutRequested(os0Var3);
        this.textActionModeCallback.setOnPasteRequested(os0Var2);
        this.textActionModeCallback.setOnSelectAllRequested(os0Var4);
        this.textActionModeCallback.setOnAutofillRequested(os0Var5);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        }
    }
}
