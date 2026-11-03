package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class xp2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;
    public final /* synthetic */ ps0 m;

    public /* synthetic */ xp2(y40 y40Var, ps0 ps0Var, int i) {
        this.a = i;
        this.b = y40Var;
        this.m = ps0Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1;
        switch (this.a) {
            case 0:
                addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1 = TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(this.b, this.m);
                return addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1;
            default:
                return TextFieldSelectionState_androidKt.f(this.b, this.m);
        }
    }
}
