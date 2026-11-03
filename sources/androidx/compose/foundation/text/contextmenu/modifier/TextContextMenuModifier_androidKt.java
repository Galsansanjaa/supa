package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextContextMenuModifier_androidKt {
    public static final Modifier addTextContextMenuComponentsWithContext(Modifier modifier, ts0 ts0Var) {
        return modifier.then(new AddTextContextMenuDataComponentsWithContextElement(ts0Var));
    }
}
