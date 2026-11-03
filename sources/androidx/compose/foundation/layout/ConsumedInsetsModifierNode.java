package androidx.compose.foundation.layout;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class ConsumedInsetsModifierNode extends InsetsConsumingModifierNode {
    private ps0 block;

    public ConsumedInsetsModifierNode(ps0 ps0Var) {
        this.block = ps0Var;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        this.block.invoke(windowInsets);
        return windowInsets;
    }

    public final void update(ps0 ps0Var) {
        if (ps0Var != this.block) {
            this.block = ps0Var;
            insetsInvalidated();
        }
    }
}
