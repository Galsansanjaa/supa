package defpackage;

import androidx.compose.material3.TooltipScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yr2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TooltipScope b;

    public /* synthetic */ yr2(TooltipScope tooltipScope, int i) {
        this.a = i;
        this.b = tooltipScope;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        LayoutCoordinates obtainAnchorBounds;
        LayoutCoordinates obtainAnchorBounds2;
        int i = this.a;
        TooltipScope tooltipScope = this.b;
        MeasureScope measureScope = (MeasureScope) obj;
        switch (i) {
            case 0:
                obtainAnchorBounds = tooltipScope.obtainAnchorBounds(measureScope);
                return obtainAnchorBounds;
            default:
                obtainAnchorBounds2 = tooltipScope.obtainAnchorBounds(measureScope);
                return obtainAnchorBounds2;
        }
    }
}
