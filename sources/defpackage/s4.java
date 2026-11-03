package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;

    public /* synthetic */ s4(Density density, int i) {
        this.a = i;
        this.b = density;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        float d;
        int i = this.a;
        Density density = this.b;
        switch (i) {
            case 0:
                d = AnchoredDraggableKt.d(density);
                break;
            case 1:
                d = ModalWideNavigationRailState.c(density);
                break;
            case 2:
                d = SheetState.f(density);
                break;
            case 3:
                d = SheetState.d(density);
                break;
            case 4:
                d = SheetState.Companion.b(density);
                break;
            case 5:
                d = SheetState.Companion.d(density);
                break;
            default:
                d = SwipeToDismissBoxState.b(density);
                break;
        }
        return Float.valueOf(d);
    }
}
