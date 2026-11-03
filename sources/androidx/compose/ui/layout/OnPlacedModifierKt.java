package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OnPlacedModifierKt {
    public static final Modifier onPlaced(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new OnPlacedElement(ps0Var));
    }
}
