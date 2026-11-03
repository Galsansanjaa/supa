package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLinkStyles;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextLinkScopeKt {
    public static final /* synthetic */ boolean access$isNullOrEmpty(TextLinkStyles textLinkStyles) {
        return isNullOrEmpty(textLinkStyles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullOrEmpty(TextLinkStyles textLinkStyles) {
        if (textLinkStyles != null) {
            return textLinkStyles.getStyle() == null && textLinkStyles.getFocusedStyle() == null && textLinkStyles.getHoveredStyle() == null && textLinkStyles.getPressedStyle() == null;
        }
        return true;
    }
}
