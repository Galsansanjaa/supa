package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class ExposedDropdownMenuAnchorNode extends Modifier.Node {
    private os0 updateStateOnAttach;

    public ExposedDropdownMenuAnchorNode(os0 os0Var) {
        this.updateStateOnAttach = os0Var;
    }

    public final os0 getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.updateStateOnAttach.invoke();
    }

    public final void setUpdateStateOnAttach(os0 os0Var) {
        this.updateStateOnAttach = os0Var;
    }
}
