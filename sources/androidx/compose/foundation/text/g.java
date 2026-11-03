package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ g(int i, Placeable placeable) {
        this.a = i;
        this.b = placeable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 measure_3p2s80s$lambda$0;
        int i = this.a;
        Placeable placeable = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measure_3p2s80s$lambda$0 = HeightInLinesNode.measure_3p2s80s$lambda$0(placeable, placementScope);
                return measure_3p2s80s$lambda$0;
            case 1:
                return TextFieldSizeConstrainerNode.a(placeable, placementScope);
            default:
                return TextFieldSizeNode.a(placeable, placementScope);
        }
    }
}
