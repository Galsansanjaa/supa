package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.geometry.Rect;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier.Node b;

    public /* synthetic */ b(int i, Modifier.Node node) {
        this.a = i;
        this.b = node;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Modifier.Node node = this.b;
        switch (i) {
            case 0:
                return FocusGroupPropertiesNode.a((FocusGroupPropertiesNode) node, (FocusEnterExitScope) obj);
            case 1:
                return FocusGroupPropertiesNode.b((FocusGroupPropertiesNode) node, (FocusEnterExitScope) obj);
            default:
                return BringIntoViewNode.a((BringIntoViewNode) node, (Rect) obj);
        }
    }
}
