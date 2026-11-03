package defpackage;

import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.TopAppBarState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class k8 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    public /* synthetic */ k8(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.m = f2;
        this.n = f3;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        BottomAppBarState BottomAppBarState;
        TopAppBarState rememberTopAppBarState$lambda$26$lambda$25;
        switch (this.a) {
            case 0:
                BottomAppBarState = AppBarKt.BottomAppBarState(this.b, this.m, this.n);
                return BottomAppBarState;
            default:
                rememberTopAppBarState$lambda$26$lambda$25 = AppBarKt.rememberTopAppBarState$lambda$26$lambda$25(this.b, this.m, this.n);
                return rememberTopAppBarState$lambda$26$lambda$25;
        }
    }
}
