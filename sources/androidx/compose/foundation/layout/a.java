package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ a(int i, Placeable placeable) {
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
                return AspectRatioNode.a(placeable, placementScope);
            case 1:
                return DerivedHeightModifierNode.d(placeable, placementScope);
            case 2:
                return DerivedWidthModifierNode.c(placeable, placementScope);
            case 3:
                return FillNode.a(placeable, placementScope);
            case 4:
                return IntrinsicSizeModifier.a(placeable, placementScope);
            case 5:
                return RecalculateWindowInsetsModifierNode.d(placeable, placementScope);
            case 6:
                return SizeNode.a(placeable, placementScope);
            default:
                return UnspecifiedConstraintsNode.a(placeable, placementScope);
        }
    }
}
