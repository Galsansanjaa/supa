package androidx.compose.material3;

import defpackage.os0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements os0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ y40 m;
    public final /* synthetic */ Object n;

    public /* synthetic */ k0(SheetState sheetState, y40 y40Var, SheetState sheetState2) {
        this.b = sheetState;
        this.m = y40Var;
        this.n = sheetState2;
    }

    public /* synthetic */ k0(SheetState sheetState, y40 y40Var, os0 os0Var) {
        this.b = sheetState;
        this.n = os0Var;
        this.m = y40Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.n;
        y40 y40Var = this.m;
        SheetState sheetState = this.b;
        switch (i) {
            case 0:
                return ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.a(sheetState, y40Var, (os0) obj);
            default:
                return Boolean.valueOf(ModalBottomSheetKt$ModalBottomSheetContent$7$2$1.e(sheetState, y40Var, (SheetState) obj));
        }
    }
}
