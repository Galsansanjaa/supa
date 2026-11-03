package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ps0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 measure_3p2s80s$lambda$0;
        vy2 measure_3p2s80s$lambda$02;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (this.a) {
            case 0:
                return BoxKt$EmptyBoxMeasurePolicy$1.a(placementScope);
            case 1:
                return BoxMeasurePolicy.a(placementScope);
            case 2:
                measure_3p2s80s$lambda$0 = DerivedHeightModifierNode.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$0;
            case 3:
                measure_3p2s80s$lambda$02 = DerivedWidthModifierNode.measure_3p2s80s$lambda$0(placementScope);
                return measure_3p2s80s$lambda$02;
            case 4:
                return FlexBoxMeasurePolicy.a(placementScope);
            case 5:
                return FlowMeasureLazyPolicy.d(placementScope);
            case 6:
                return FlowMeasurePolicy.b(placementScope);
            case 7:
                return FlowMeasurePolicy.a(placementScope);
            default:
                return SpacerMeasurePolicy.a(placementScope);
        }
    }
}
