package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import defpackage.z72;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextToolbarHelperApi28 {
    public static final TextToolbarHelperApi28 INSTANCE = new TextToolbarHelperApi28();

    private TextToolbarHelperApi28() {
    }

    public static /* synthetic */ void addLegacyMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i, Context context, TextClassification textClassification, Drawable drawable, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addLegacyMenuItem(menu, i, context, textClassification, drawable);
    }

    public static final boolean addLegacyMenuItem$lambda$0(Context context, TextClassification textClassification, MenuItem menuItem) {
        TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return true;
    }

    public static /* synthetic */ void addMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addMenuItem(menu, i, context, textClassification, i2, drawable);
    }

    public static /* synthetic */ void addMenuItem$default(TextToolbarHelperApi28 textToolbarHelperApi28, Menu menu, int i, boolean z, RemoteAction remoteAction, Drawable drawable, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            drawable = null;
        }
        textToolbarHelperApi28.addMenuItem(menu, i, z, remoteAction, drawable);
    }

    public static final boolean addMenuItem$lambda$0(RemoteAction remoteAction, MenuItem menuItem) {
        TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return true;
    }

    public final void addLegacyMenuItem(Menu menu, int i, Context context, TextClassification textClassification, Drawable drawable) {
        MenuItem add = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
        add.setShowAsAction(2);
        add.setIcon(drawable);
        add.setOnMenuItemClickListener(new a(1, context, textClassification));
    }

    public final void addMenuItem(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        if (i2 < 0) {
            addLegacyMenuItem(menu, i, context, textClassification, drawable);
        } else {
            addMenuItem(menu, i, i2 == 0, z72.b(textClassification.getActions().get(i2)), drawable);
        }
    }

    public final void addMenuItem(Menu menu, int i, boolean z, final RemoteAction remoteAction, Drawable drawable) {
        MenuItem add = menu.add(R.id.textAssist, z ? 16908353 : 0, i, remoteAction.getTitle());
        add.setShowAsAction(z ? 2 : 0);
        if (drawable != null) {
            add.setIcon(drawable);
        }
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.i
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean addMenuItem$lambda$0;
                addMenuItem$lambda$0 = TextToolbarHelperApi28.addMenuItem$lambda$0(remoteAction, menuItem);
                return addMenuItem$lambda$0;
            }
        });
    }
}
