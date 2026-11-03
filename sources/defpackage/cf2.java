package defpackage;

import androidx.compose.foundation.text.modifiers.SelectionModifierNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionModifierNode b;

    public /* synthetic */ cf2(SelectionModifierNode selectionModifierNode, int i) {
        this.a = i;
        this.b = selectionModifierNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        long b;
        int i = this.a;
        SelectionModifierNode selectionModifierNode = this.b;
        switch (i) {
            case 0:
                b = SelectionModifierNode.b(selectionModifierNode);
                break;
            case 1:
                return SelectionModifierNode.a(selectionModifierNode);
            case 2:
                b = SelectionModifierNode.c(selectionModifierNode);
                break;
            default:
                return SelectionModifierNode.d(selectionModifierNode);
        }
        return Long.valueOf(b);
    }
}
