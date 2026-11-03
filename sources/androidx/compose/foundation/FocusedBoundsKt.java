package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.hd0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    @hd0
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new FocusedBoundsObserverElement(ps0Var));
    }
}
