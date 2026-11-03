package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class af2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;
    public final /* synthetic */ os0 m;

    public /* synthetic */ af2(os0 os0Var, os0 os0Var2, int i) {
        this.a = i;
        this.b = os0Var;
        this.m = os0Var2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SelectionManager_androidKt.k(this.b, this.m, (TextContextMenuSession) obj);
            default:
                return TextFieldSelectionManager_androidKt.a(this.b, this.m, (TextContextMenuSession) obj);
        }
    }
}
