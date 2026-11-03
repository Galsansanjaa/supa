package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldPointerModifier_commonKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class y10 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LegacyTextFieldState b;

    public /* synthetic */ y10(LegacyTextFieldState legacyTextFieldState, int i) {
        this.a = i;
        this.b = legacyTextFieldState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 CoreTextField$lambda$21;
        vy2 onValueChange$lambda$0;
        vy2 onImeActionPerformed$lambda$0;
        boolean onImeActionPerformedWithResult$lambda$0;
        int i = this.a;
        LegacyTextFieldState legacyTextFieldState = this.b;
        switch (i) {
            case 0:
                CoreTextField$lambda$21 = CoreTextFieldKt.CoreTextField$lambda$21(legacyTextFieldState, (LayoutCoordinates) obj);
                return CoreTextField$lambda$21;
            case 1:
                onValueChange$lambda$0 = LegacyTextFieldState.onValueChange$lambda$0(legacyTextFieldState, (TextFieldValue) obj);
                return onValueChange$lambda$0;
            case 2:
                onImeActionPerformed$lambda$0 = LegacyTextFieldState.onImeActionPerformed$lambda$0(legacyTextFieldState, (ImeAction) obj);
                return onImeActionPerformed$lambda$0;
            case 3:
                onImeActionPerformedWithResult$lambda$0 = LegacyTextFieldState.onImeActionPerformedWithResult$lambda$0(legacyTextFieldState, (ImeAction) obj);
                return Boolean.valueOf(onImeActionPerformedWithResult$lambda$0);
            default:
                return TextFieldPointerModifier_commonKt.b(legacyTextFieldState, ((Boolean) obj).booleanValue());
        }
    }
}
