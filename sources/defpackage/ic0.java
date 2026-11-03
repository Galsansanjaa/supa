package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.EffectsKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;

    public /* synthetic */ ic0(os0 os0Var, int i) {
        this.a = i;
        this.b = os0Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        float TwoRowsTopAppBar$lambda$8$lambda$7;
        float TwoRowsTopAppBar$lambda$10$lambda$9;
        boolean TwoRowsTopAppBar$lambda$12$lambda$11;
        boolean Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67;
        float LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3;
        float CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21;
        int i = this.a;
        vy2 vy2Var = vy2.a;
        os0 os0Var = this.b;
        switch (i) {
            case 0:
                TwoRowsTopAppBar$lambda$8$lambda$7 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$8$lambda$7(os0Var);
                return Float.valueOf(TwoRowsTopAppBar$lambda$8$lambda$7);
            case 1:
                TwoRowsTopAppBar$lambda$10$lambda$9 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$10$lambda$9(os0Var);
                return Float.valueOf(TwoRowsTopAppBar$lambda$10$lambda$9);
            case 2:
                TwoRowsTopAppBar$lambda$12$lambda$11 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$12$lambda$11(os0Var);
                return Boolean.valueOf(TwoRowsTopAppBar$lambda$12$lambda$11);
            case 3:
                return EffectsKt.b(os0Var);
            case 4:
                os0Var.invoke();
                return vy2Var;
            case 5:
                os0Var.invoke();
                return vy2Var;
            case 6:
                return Boolean.valueOf(ModalBottomSheetKt.s(os0Var));
            case 7:
                Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67(os0Var);
                return Boolean.valueOf(Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67);
            case 8:
                LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3(os0Var);
                return Float.valueOf(LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3);
            default:
                CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21(os0Var);
                return Float.valueOf(CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21);
        }
    }
}
