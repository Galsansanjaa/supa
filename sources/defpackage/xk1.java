package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ os0 m;

    public /* synthetic */ xk1(String str, os0 os0Var, int i) {
        this.a = i;
        this.b = str;
        this.m = os0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 Scrim_KTwxG1Y$lambda$31$lambda$30;
        vy2 Scrim_Bx497Mc$lambda$69$lambda$68;
        switch (this.a) {
            case 0:
                Scrim_KTwxG1Y$lambda$31$lambda$30 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30(this.b, this.m, (SemanticsPropertyReceiver) obj);
                return Scrim_KTwxG1Y$lambda$31$lambda$30;
            default:
                Scrim_Bx497Mc$lambda$69$lambda$68 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68(this.b, this.m, (SemanticsPropertyReceiver) obj);
                return Scrim_Bx497Mc$lambda$69$lambda$68;
        }
    }
}
