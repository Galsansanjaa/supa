package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yk1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object m;

    public /* synthetic */ yk1(Object obj, int i, long j) {
        this.a = i;
        this.b = j;
        this.m = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 Scrim_KTwxG1Y$lambda$33$lambda$32;
        vy2 Scrim_3J_VO9M$lambda$35$lambda$34;
        vy2 Scrim_Bx497Mc$lambda$71$lambda$70;
        switch (this.a) {
            case 0:
                Scrim_KTwxG1Y$lambda$33$lambda$32 = ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$33$lambda$32(this.b, (State) this.m, (DrawScope) obj);
                return Scrim_KTwxG1Y$lambda$33$lambda$32;
            case 1:
                Scrim_3J_VO9M$lambda$35$lambda$34 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$35$lambda$34(this.b, (State) this.m, (DrawScope) obj);
                return Scrim_3J_VO9M$lambda$35$lambda$34;
            default:
                Scrim_Bx497Mc$lambda$71$lambda$70 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$71$lambda$70(this.b, (os0) this.m, (DrawScope) obj);
                return Scrim_Bx497Mc$lambda$71$lambda$70;
        }
    }
}
