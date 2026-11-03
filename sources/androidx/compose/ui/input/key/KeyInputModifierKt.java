package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new KeyInputElement(ps0Var, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new KeyInputElement(null, ps0Var));
    }
}
