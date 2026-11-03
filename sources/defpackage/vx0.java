package defpackage;

import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.ui.input.pointer.HoverIconModifierNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class vx0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v42 b;

    public /* synthetic */ vx0(v42 v42Var, int i) {
        this.a = i;
        this.b = v42Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        v42 v42Var = this.b;
        switch (i) {
            case 0:
                return HoverIconModifierNode.d(v42Var, (HoverIconModifierNode) obj);
            default:
                return SelectionLayoutKt.a(v42Var, (SelectableInfo) obj);
        }
    }
}
