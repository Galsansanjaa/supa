package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, us0 us0Var) {
        return modifier.then(new LayoutElement(us0Var));
    }
}
