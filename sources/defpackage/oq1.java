package defpackage;

import androidx.compose.ui.node.NodeCoordinator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NodeCoordinator b;

    public /* synthetic */ oq1(NodeCoordinator nodeCoordinator, int i) {
        this.a = i;
        this.b = nodeCoordinator;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        NodeCoordinator nodeCoordinator = this.b;
        switch (i) {
            case 0:
                return NodeCoordinator.h(nodeCoordinator);
            default:
                return NodeCoordinator.l(nodeCoordinator);
        }
    }
}
