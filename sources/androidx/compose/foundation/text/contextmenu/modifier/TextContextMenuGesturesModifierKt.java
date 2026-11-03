package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuGesturesModifierKt {
    public static final Modifier showTextContextMenuOnSecondaryClick(Modifier modifier, ts0 ts0Var) {
        return modifier.then(new TextContextMenuGestureElement(ts0Var));
    }

    public static /* synthetic */ Modifier showTextContextMenuOnSecondaryClick$default(Modifier modifier, ts0 ts0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ts0Var = null;
        }
        return showTextContextMenuOnSecondaryClick(modifier, ts0Var);
    }
}
