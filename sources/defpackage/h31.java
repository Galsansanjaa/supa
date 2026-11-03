package defpackage;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.layout.InsetsPaddingModifierNode;
import androidx.compose.material3.MinimumInteractiveModifierNode;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class h31 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Placeable m;
    public final /* synthetic */ int n;

    public /* synthetic */ h31(int i, int i2, Placeable placeable) {
        this.a = 1;
        this.b = i;
        this.m = placeable;
        this.n = i2;
    }

    public /* synthetic */ h31(Placeable placeable, int i, int i2, int i3) {
        this.a = i3;
        this.m = placeable;
        this.b = i;
        this.n = i2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.n;
        int i3 = this.b;
        Placeable placeable = this.m;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return InsetsPaddingModifierNode.c(i3, placeable, i2, placementScope);
            case 1:
                return MinimumInteractiveModifierNode.a(i3, placeable, i2, placementScope);
            default:
                return ScrollNode.c(i3, placeable, i2, placementScope);
        }
    }
}
