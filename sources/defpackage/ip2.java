package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ip2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ ip2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.os0
    public final Object invoke() {
        String observeUntransformedTextChanges$lambda$0;
        boolean applySemantics$lambda$9;
        vy2 updateWindowFocus$lambda$0;
        vy2 updateNode$lambda$0;
        vy2 _init_$lambda$0;
        ReceiveContentConfiguration receiveContentConfiguration;
        Set dragAndDropNode$lambda$0;
        int i = this.a;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                observeUntransformedTextChanges$lambda$0 = TextFieldDecoratorModifierNode.observeUntransformedTextChanges$lambda$0(textFieldDecoratorModifierNode);
                return observeUntransformedTextChanges$lambda$0;
            case 1:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$9(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
            case 2:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$10(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
            case 3:
                updateWindowFocus$lambda$0 = TextFieldDecoratorModifierNode.updateWindowFocus$lambda$0(textFieldDecoratorModifierNode);
                return updateWindowFocus$lambda$0;
            case 4:
                updateNode$lambda$0 = TextFieldDecoratorModifierNode.updateNode$lambda$0(textFieldDecoratorModifierNode);
                return updateNode$lambda$0;
            case 5:
                _init_$lambda$0 = TextFieldDecoratorModifierNode._init_$lambda$0(textFieldDecoratorModifierNode);
                return _init_$lambda$0;
            case 6:
                receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
                return receiveContentConfiguration;
            case 7:
                dragAndDropNode$lambda$0 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$0(textFieldDecoratorModifierNode);
                return dragAndDropNode$lambda$0;
            case 8:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.onKeyEvent_ZmokQxo$lambda$0(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
            case 9:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$11(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
            case 10:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$7(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
            default:
                applySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$8(textFieldDecoratorModifierNode);
                return Boolean.valueOf(applySemantics$lambda$9);
        }
    }
}
