package defpackage;

import androidx.compose.ui.node.BackwardsCompatNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BackwardsCompatNode b;

    public /* synthetic */ sk(BackwardsCompatNode backwardsCompatNode, int i) {
        this.a = i;
        this.b = backwardsCompatNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        BackwardsCompatNode backwardsCompatNode = this.b;
        switch (i) {
            case 0:
                return BackwardsCompatNode.a(backwardsCompatNode);
            default:
                return BackwardsCompatNode.b(backwardsCompatNode);
        }
    }
}
