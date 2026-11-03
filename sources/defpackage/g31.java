package defpackage;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class g31 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InsetsConsumingModifierNode b;

    public /* synthetic */ g31(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.a = i;
        this.b = insetsConsumingModifierNode;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        InsetsConsumingModifierNode insetsConsumingModifierNode = this.b;
        TraversableNode traversableNode = (TraversableNode) obj;
        switch (i) {
            case 0:
                return InsetsConsumingModifierNode.b(insetsConsumingModifierNode, traversableNode);
            default:
                return Boolean.valueOf(InsetsConsumingModifierNode.a(insetsConsumingModifierNode, traversableNode));
        }
    }
}
