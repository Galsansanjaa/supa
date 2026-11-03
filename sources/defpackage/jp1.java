package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jp1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerPredictiveBackState b;
    public final /* synthetic */ boolean m;

    public /* synthetic */ jp1(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, int i) {
        this.a = i;
        this.b = drawerPredictiveBackState;
        this.m = z;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 predictiveBackDrawerChild$lambda$57;
        vy2 predictiveBackDrawerContainer$lambda$56;
        switch (this.a) {
            case 0:
                predictiveBackDrawerChild$lambda$57 = NavigationDrawerKt.predictiveBackDrawerChild$lambda$57(this.b, this.m, (GraphicsLayerScope) obj);
                return predictiveBackDrawerChild$lambda$57;
            default:
                predictiveBackDrawerContainer$lambda$56 = NavigationDrawerKt.predictiveBackDrawerContainer$lambda$56(this.b, this.m, (GraphicsLayerScope) obj);
                return predictiveBackDrawerContainer$lambda$56;
        }
    }
}
