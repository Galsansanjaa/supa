package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class u10 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionManager b;

    public /* synthetic */ u10(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.a = i;
        this.b = textFieldSelectionManager;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        TextFieldSelectionManager textFieldSelectionManager = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldKt.d(textFieldSelectionManager, (DisposableEffectScope) obj);
            default:
                return TextFieldSelectionManager.b(textFieldSelectionManager, (LayoutCoordinates) obj);
        }
    }
}
