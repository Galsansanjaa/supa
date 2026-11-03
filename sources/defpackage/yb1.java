package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ List m;
    public final /* synthetic */ List n;
    public final /* synthetic */ boolean o;

    public /* synthetic */ yb1(MutableState mutableState, List list, List list2, boolean z, int i) {
        this.a = i;
        this.b = mutableState;
        this.m = list;
        this.n = list2;
        this.o = z;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 measureLazyGrid_t1x4au0$lambda$8;
        vy2 measureLazyList_pIk1_oM$lambda$8;
        switch (this.a) {
            case 0:
                measureLazyGrid_t1x4au0$lambda$8 = LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8(this.b, this.m, this.n, this.o, (Placeable.PlacementScope) obj);
                return measureLazyGrid_t1x4au0$lambda$8;
            default:
                measureLazyList_pIk1_oM$lambda$8 = LazyListMeasureKt.measureLazyList_pIk1_oM$lambda$8(this.b, this.m, this.n, this.o, (Placeable.PlacementScope) obj);
                return measureLazyList_pIk1_oM$lambda$8;
        }
    }
}
