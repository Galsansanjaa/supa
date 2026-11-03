package androidx.compose.ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import defpackage.os0;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final os0 onActionModeDestroy;
    private os0 onAutofillRequested;
    private os0 onCopyRequested;
    private os0 onCutRequested;
    private os0 onPasteRequested;
    private os0 onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public TextActionModeCallback(os0 os0Var, Rect rect, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5, os0 os0Var6) {
        this.onActionModeDestroy = os0Var;
        this.rect = rect;
        this.onCopyRequested = os0Var2;
        this.onPasteRequested = os0Var3;
        this.onCutRequested = os0Var4;
        this.onSelectAllRequested = os0Var5;
        this.onAutofillRequested = os0Var6;
    }

    public /* synthetic */ TextActionModeCallback(os0 os0Var, Rect rect, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5, os0 os0Var6, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : os0Var, (i & 2) != 0 ? Rect.Companion.getZero() : rect, (i & 4) != 0 ? null : os0Var2, (i & 8) != 0 ? null : os0Var3, (i & 16) != 0 ? null : os0Var4, (i & 32) != 0 ? null : os0Var5, (i & 64) != 0 ? null : os0Var6);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, os0 os0Var) {
        if (os0Var != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui(menu, menuItemOption);
        } else {
            if (os0Var != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final os0 getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final os0 getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final os0 getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final os0 getOnCutRequested() {
        return this.onCutRequested;
    }

    public final os0 getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final os0 getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            os0 os0Var = this.onCopyRequested;
            if (os0Var != null) {
                os0Var.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            os0 os0Var2 = this.onPasteRequested;
            if (os0Var2 != null) {
                os0Var2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            os0 os0Var3 = this.onCutRequested;
            if (os0Var3 != null) {
                os0Var3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            os0 os0Var4 = this.onSelectAllRequested;
            if (os0Var4 != null) {
                os0Var4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            os0 os0Var5 = this.onAutofillRequested;
            if (os0Var5 != null) {
                os0Var5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            v5.m("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            v5.m("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        addMenuItem$ui(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        os0 os0Var = this.onActionModeDestroy;
        if (os0Var != null) {
            os0Var.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui(menu);
        return true;
    }

    public final void setOnAutofillRequested(os0 os0Var) {
        this.onAutofillRequested = os0Var;
    }

    public final void setOnCopyRequested(os0 os0Var) {
        this.onCopyRequested = os0Var;
    }

    public final void setOnCutRequested(os0 os0Var) {
        this.onCutRequested = os0Var;
    }

    public final void setOnPasteRequested(os0 os0Var) {
        this.onPasteRequested = os0Var;
    }

    public final void setOnSelectAllRequested(os0 os0Var) {
        this.onSelectAllRequested = os0Var;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    public final void updateMenuItems$ui(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }
}
