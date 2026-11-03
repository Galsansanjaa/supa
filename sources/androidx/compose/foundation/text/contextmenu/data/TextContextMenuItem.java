package androidx.compose.foundation.text.contextmenu.data;

import defpackage.lt;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final String label;
    private final int leadingIcon;
    private final ps0 onClick;

    public TextContextMenuItem(Object obj, String str, int i, ps0 ps0Var) {
        super(obj);
        this.label = str;
        this.leadingIcon = i;
        this.onClick = ps0Var;
    }

    public /* synthetic */ TextContextMenuItem(Object obj, String str, int i, ps0 ps0Var, int i2, sb0 sb0Var) {
        this(obj, str, (i2 & 4) != 0 ? 0 : i, ps0Var);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getLeadingIcon() {
        return this.leadingIcon;
    }

    public final ps0 getOnClick() {
        return this.onClick;
    }

    public String toString() {
        Object key = getKey();
        String str = this.label;
        int i = this.leadingIcon;
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(key);
        sb.append(", label=\"");
        sb.append(str);
        sb.append("\", leadingIcon=");
        return lt.A(sb, ")", i);
    }
}
