package defpackage;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b20 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode b;

    public /* synthetic */ b20(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.a = i;
        this.b = coreTextFieldSemanticsModifierNode;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.os0
    public final Object invoke() {
        boolean a;
        int i = this.a;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldSemanticsModifierNode.g(coreTextFieldSemanticsModifierNode);
            case 1:
                a = CoreTextFieldSemanticsModifierNode.a(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
            case 2:
                a = CoreTextFieldSemanticsModifierNode.j(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
            case 3:
                a = CoreTextFieldSemanticsModifierNode.h(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
            case 4:
                return CoreTextFieldSemanticsModifierNode.m(coreTextFieldSemanticsModifierNode);
            case 5:
                a = CoreTextFieldSemanticsModifierNode.i(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
            case 6:
                a = CoreTextFieldSemanticsModifierNode.f(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
            default:
                a = CoreTextFieldSemanticsModifierNode.k(coreTextFieldSemanticsModifierNode);
                return Boolean.valueOf(a);
        }
    }
}
