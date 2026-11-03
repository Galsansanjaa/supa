package androidx.compose.foundation.text.contextmenu.data;

import androidx.compose.ui.util.ListUtilsKt;
import defpackage.k93;
import defpackage.oi0;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuData {
    private final List<TextContextMenuComponent> components;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TextContextMenuData Empty = new TextContextMenuData(oi0.a);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final TextContextMenuData getEmpty() {
            return TextContextMenuData.Empty;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuData(List<? extends TextContextMenuComponent> list) {
        this.components = list;
    }

    public final List<TextContextMenuComponent> getComponents() {
        return this.components;
    }

    public String toString() {
        return k93.m("TextContextMenuData(components=", ListUtilsKt.fastJoinToString$default(this.components, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null), ")");
    }
}
