package defpackage;

import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int m;

    public /* synthetic */ s1(int i, int i2, Placeable placeable) {
        this.a = i2;
        this.b = placeable;
        this.m = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.m;
        Placeable placeable = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return AccessibilityUtilKt.e(placeable, i2, placementScope);
            default:
                return AccessibilityUtilKt.b(placeable, i2, placementScope);
        }
    }
}
