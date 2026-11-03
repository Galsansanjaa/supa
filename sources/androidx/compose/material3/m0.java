package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;

    public /* synthetic */ m0(os0 os0Var, int i) {
        this.a = i;
        this.b = os0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        os0 os0Var = this.b;
        Offset offset = (Offset) obj;
        switch (i) {
            case 0:
                return ModalBottomSheetKt$Scrim$dismissSheet$1$1.a(os0Var, offset);
            default:
                return NavigationDrawerKt$Scrim$dismissDrawer$1$1.a(os0Var, offset);
        }
    }
}
