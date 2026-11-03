package defpackage;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalRuler;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w63 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VerticalRuler[] b;

    public /* synthetic */ w63(VerticalRuler[] verticalRulerArr, int i) {
        this.a = i;
        this.b = verticalRulerArr;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        float minOf$lambda$0;
        int i = this.a;
        VerticalRuler[] verticalRulerArr = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                minOf$lambda$0 = VerticalRuler.Companion.minOf$lambda$0(verticalRulerArr, placementScope, floatValue);
                break;
            default:
                minOf$lambda$0 = VerticalRuler.Companion.maxOf$lambda$0(verticalRulerArr, placementScope, floatValue);
                break;
        }
        return Float.valueOf(minOf$lambda$0);
    }
}
