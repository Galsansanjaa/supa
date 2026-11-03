package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopAppBarState b;

    public /* synthetic */ d8(TopAppBarState topAppBarState, int i) {
        this.a = i;
        this.b = topAppBarState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 adjustHeightOffsetLimit$lambda$38$lambda$37;
        vy2 vy2Var;
        int i = this.a;
        TopAppBarState topAppBarState = this.b;
        switch (i) {
            case 0:
                adjustHeightOffsetLimit$lambda$38$lambda$37 = AppBarKt.adjustHeightOffsetLimit$lambda$38$lambda$37(topAppBarState, (IntSize) obj);
                return adjustHeightOffsetLimit$lambda$38$lambda$37;
            default:
                vy2Var = AppBarKt.settleAppBar$lambda$55(topAppBarState, (AnimationScope) obj);
                return vy2Var;
        }
    }
}
