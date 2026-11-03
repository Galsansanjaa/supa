package androidx.compose.ui.layout;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return LayoutNodeSubcompositionsState.b((LayoutNodeSubcompositionsState.NodeState) obj);
            default:
                return OnFirstVisibleNode.a((OnFirstVisibleNode) obj);
        }
    }
}
