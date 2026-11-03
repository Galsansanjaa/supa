package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class vm implements CodepointTransformation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                return BasicSecureTextFieldKt.j((State) obj, i, i2);
            default:
                return SecureTextFieldController.b((SecureTextFieldController) obj, i, i2);
        }
    }
}
