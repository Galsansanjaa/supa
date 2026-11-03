package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ h0(int i, Placeable placeable) {
        this.a = i;
        this.b = placeable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Placeable placeable = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return FloatingActionButtonKt$ExtendedFloatingActionButton$5.a(placeable, placementScope);
            default:
                return VisibleModifier.b(placeable, placementScope);
        }
    }
}
