package defpackage;

import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LayoutNode b;

    public /* synthetic */ lb1(LayoutNode layoutNode, int i) {
        this.a = i;
        this.b = layoutNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 _foldedChildren$lambda$0;
        int i = this.a;
        LayoutNode layoutNode = this.b;
        switch (i) {
            case 0:
                _foldedChildren$lambda$0 = LayoutNode._foldedChildren$lambda$0(layoutNode);
                return _foldedChildren$lambda$0;
            default:
                return LookaheadScopeKt.e(layoutNode);
        }
    }
}
