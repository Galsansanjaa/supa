package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ g0(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 invoke$lambda$12$lambda$10$lambda$9;
        int i = this.a;
        State state = this.b;
        switch (i) {
            case 0:
                invoke$lambda$12$lambda$10$lambda$9 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$12$lambda$10$lambda$9(state, (GraphicsLayerScope) obj);
                return invoke$lambda$12$lambda$10$lambda$9;
            case 1:
                return NavigationBarKt$NavigationBarItem$2$indicator$1.a(state, (GraphicsLayerScope) obj);
            case 2:
                return NavigationRailKt$NavigationRailItem$1$indicator$1.a(state, (GraphicsLayerScope) obj);
            default:
                return TabRowDefaults$tabIndicatorOffset$2.a(state, (Density) obj);
        }
    }
}
