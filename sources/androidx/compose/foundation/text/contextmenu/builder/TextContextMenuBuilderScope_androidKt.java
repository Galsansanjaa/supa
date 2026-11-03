package androidx.compose.foundation.text.contextmenu.builder;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope_androidKt {
    public static final void item(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i, ps0 ps0Var) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuItem(obj, str, i, ps0Var));
    }

    public static /* synthetic */ void item$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i, ps0 ps0Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        item(textContextMenuBuilderScope, obj, str, i, ps0Var);
    }

    public static final void textClassificationItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i, Drawable drawable) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuTextClassificationItem(obj, textClassification, i, drawable));
    }

    public static /* synthetic */ void textClassificationItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i, Drawable drawable, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            drawable = null;
        }
        textClassificationItem(textContextMenuBuilderScope, obj, textClassification, i, drawable);
    }
}
