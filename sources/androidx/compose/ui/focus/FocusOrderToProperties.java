package androidx.compose.ui.focus;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final ps0 focusOrderReceiver;

    public FocusOrderToProperties(ps0 ps0Var) {
        this.focusOrderReceiver = ps0Var;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final ps0 getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
