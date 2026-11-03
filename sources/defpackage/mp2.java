package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class mp2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;
    public final /* synthetic */ int m;

    public /* synthetic */ mp2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2) {
        this.a = i2;
        this.b = textFieldDecoratorModifierNode;
        this.m = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.m;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                return TextFieldDecoratorModifierNode.r(textFieldDecoratorModifierNode, i2);
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.z(textFieldDecoratorModifierNode, i2));
        }
    }
}
