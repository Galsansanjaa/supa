package defpackage;

import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ MutableState m;

    public /* synthetic */ bf2(Density density, MutableState mutableState, int i) {
        this.a = i;
        this.b = density;
        this.m = mutableState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 selectionMagnifier$lambda$0$4$0$1;
        Modifier selectionMagnifier$lambda$0$4$0;
        Modifier textFieldMagnifier$lambda$0$4$0;
        vy2 textFieldMagnifier$lambda$0$4$0$1;
        switch (this.a) {
            case 0:
                selectionMagnifier$lambda$0$4$0$1 = SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$1(this.b, this.m, (DpSize) obj);
                return selectionMagnifier$lambda$0$4$0$1;
            case 1:
                selectionMagnifier$lambda$0$4$0 = SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0(this.b, this.m, (os0) obj);
                return selectionMagnifier$lambda$0$4$0;
            case 2:
                textFieldMagnifier$lambda$0$4$0 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0(this.b, this.m, (os0) obj);
                return textFieldMagnifier$lambda$0$4$0;
            default:
                textFieldMagnifier$lambda$0$4$0$1 = TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$1(this.b, this.m, (DpSize) obj);
                return textFieldMagnifier$lambda$0$4$0$1;
        }
    }
}
