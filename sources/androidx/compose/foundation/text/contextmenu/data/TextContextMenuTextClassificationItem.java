package androidx.compose.foundation.text.contextmenu.data;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuTextClassificationItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final Drawable icon;
    private final int index;
    private final TextClassification textClassification;

    public TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i;
        this.icon = drawable;
    }

    public /* synthetic */ TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i, Drawable drawable, int i2, sb0 sb0Var) {
        this(obj, textClassification, i, (i2 & 8) != 0 ? null : drawable);
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final int getIndex() {
        return this.index;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public String toString() {
        return "TextContextMenuTextClassificationItem(key=" + getKey() + ", textClassification=" + this.textClassification + ", index=" + this.index + ", icon=" + this.icon + ")";
    }
}
