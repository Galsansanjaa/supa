package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ os0 m;

    public /* synthetic */ tk1(SheetState sheetState, os0 os0Var, int i) {
        this.a = i;
        this.b = sheetState;
        this.m = os0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2;
        vy2 ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5;
        int i = this.a;
        os0 os0Var = this.m;
        SheetState sheetState = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2(sheetState, os0Var, th);
                return ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2;
            default:
                ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5 = ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5(sheetState, os0Var, th);
                return ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5;
        }
    }
}
