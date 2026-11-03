package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yp2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y42 b;
    public final /* synthetic */ y42 m;
    public final /* synthetic */ TextFieldSelectionState n;

    public /* synthetic */ yp2(y42 y42Var, TextFieldSelectionState textFieldSelectionState, y42 y42Var2, int i) {
        this.a = i;
        this.b = y42Var;
        this.n = textFieldSelectionState;
        this.m = y42Var2;
    }

    public /* synthetic */ yp2(y42 y42Var, y42 y42Var2, TextFieldSelectionState textFieldSelectionState, int i) {
        this.a = i;
        this.b = y42Var;
        this.m = y42Var2;
        this.n = textFieldSelectionState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        y42 y42Var = this.m;
        TextFieldSelectionState textFieldSelectionState = this.n;
        y42 y42Var2 = this.b;
        switch (i) {
            case 0:
                return TextFieldSelectionState.l(y42Var2, y42Var, textFieldSelectionState);
            case 1:
                return TextFieldSelectionState.b(y42Var2, y42Var, textFieldSelectionState);
            case 2:
                return TextFieldSelectionState.a(y42Var2, y42Var, textFieldSelectionState);
            default:
                return TextFieldSelectionState.h(y42Var2, y42Var, textFieldSelectionState);
        }
    }
}
