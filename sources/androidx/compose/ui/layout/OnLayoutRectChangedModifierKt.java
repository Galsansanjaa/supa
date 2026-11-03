package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OnLayoutRectChangedModifierKt {
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j, long j2, ps0 ps0Var) {
        return modifier.then(new OnLayoutRectChangedElement(j, j2, ps0Var));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j, long j2, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 64;
        }
        return onLayoutRectChanged(modifier, j3, j2, ps0Var);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j, long j2, ps0 ps0Var) {
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnRectChangedCallback(requireLayoutNode.getSemanticsId(), j, j2, delegatableNode, ps0Var);
    }
}
