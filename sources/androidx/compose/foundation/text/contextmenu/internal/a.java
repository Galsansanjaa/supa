package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean updateMenuItems$lambda$0$0;
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                updateMenuItems$lambda$0$0 = AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl.updateMenuItems$lambda$0$0((TextContextMenuItem) obj2, (AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj, menuItem);
                return updateMenuItems$lambda$0$0;
            default:
                return TextToolbarHelperApi28.b((Context) obj2, (TextClassification) obj, menuItem);
        }
    }
}
