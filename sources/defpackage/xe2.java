package defpackage;

import androidx.compose.foundation.text.modifiers.SelectionController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionController b;

    public /* synthetic */ xe2(SelectionController selectionController, int i) {
        this.a = i;
        this.b = selectionController;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        SelectionController selectionController = this.b;
        switch (i) {
            case 0:
                return SelectionController.a(selectionController);
            case 1:
                return SelectionController.d(selectionController);
            case 2:
                return SelectionController.c(selectionController);
            default:
                return SelectionController.b(selectionController);
        }
    }
}
