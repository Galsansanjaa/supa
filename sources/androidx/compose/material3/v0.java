package androidx.compose.material3;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;
    public final /* synthetic */ int m;
    public final /* synthetic */ TextFieldDecorator n;

    public /* synthetic */ v0(TextFieldDecorator textFieldDecorator, ts0 ts0Var, int i, int i2) {
        this.a = i2;
        this.n = textFieldDecorator;
        this.b = ts0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.m;
        ts0 ts0Var = this.b;
        TextFieldDecorator textFieldDecorator = this.n;
        switch (i) {
            case 0:
                return OutlinedTextFieldDefaults$decorator$2.a((OutlinedTextFieldDefaults$decorator$2) textFieldDecorator, ts0Var, i2, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return TextFieldDefaults$decorator$2.a((TextFieldDefaults$decorator$2) textFieldDecorator, ts0Var, i2, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
