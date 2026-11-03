package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Placeable m;

    public /* synthetic */ q1(ArrayList arrayList, Placeable placeable, int i) {
        this.a = i;
        this.b = arrayList;
        this.m = placeable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Placeable placeable = this.m;
        ArrayList arrayList = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.a(arrayList, placeable, placementScope);
            default:
                return TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.a(arrayList, placeable, placementScope);
        }
    }
}
