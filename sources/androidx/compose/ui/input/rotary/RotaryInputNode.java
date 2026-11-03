package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private ps0 onEvent;
    private ps0 onPreEvent;

    public RotaryInputNode(ps0 ps0Var, ps0 ps0Var2) {
        this.onEvent = ps0Var;
        this.onPreEvent = ps0Var2;
    }

    public final ps0 getOnEvent() {
        return this.onEvent;
    }

    public final ps0 getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        ps0 ps0Var = this.onPreEvent;
        if (ps0Var != null) {
            return ((Boolean) ps0Var.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        ps0 ps0Var = this.onEvent;
        if (ps0Var != null) {
            return ((Boolean) ps0Var.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(ps0 ps0Var) {
        this.onEvent = ps0Var;
    }

    public final void setOnPreEvent(ps0 ps0Var) {
        this.onPreEvent = ps0Var;
    }
}
