package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private ps0 onFocusEvent;

    public FocusEventNode(ps0 ps0Var) {
        this.onFocusEvent = ps0Var;
    }

    public final ps0 getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(ps0 ps0Var) {
        this.onFocusEvent = ps0Var;
    }
}
