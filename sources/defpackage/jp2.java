package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jp2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ jp2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 focusableNode$lambda$0;
        vy2 dragAndDropNode$lambda$2;
        vy2 dragAndDropNode$lambda$3;
        vy2 dragAndDropNode$lambda$4;
        vy2 dragAndDropNode$lambda$5;
        vy2 dragAndDropNode$lambda$6;
        boolean applySemantics$lambda$2;
        int i = this.a;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                focusableNode$lambda$0 = TextFieldDecoratorModifierNode.focusableNode$lambda$0(textFieldDecoratorModifierNode, ((Boolean) obj).booleanValue());
                return focusableNode$lambda$0;
            case 1:
                dragAndDropNode$lambda$2 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$2(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$2;
            case 2:
                dragAndDropNode$lambda$3 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$3(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$3;
            case 3:
                dragAndDropNode$lambda$4 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$4(textFieldDecoratorModifierNode, (Offset) obj);
                return dragAndDropNode$lambda$4;
            case 4:
                dragAndDropNode$lambda$5 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$5(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$5;
            case 5:
                dragAndDropNode$lambda$6 = TextFieldDecoratorModifierNode.dragAndDropNode$lambda$6(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
                return dragAndDropNode$lambda$6;
            default:
                applySemantics$lambda$2 = TextFieldDecoratorModifierNode.applySemantics$lambda$2(textFieldDecoratorModifierNode, (List) obj);
                return Boolean.valueOf(applySemantics$lambda$2);
        }
    }
}
