package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class xb1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ xb1(List list, List list2, boolean z, int i) {
        this.a = i;
        this.b = list;
        this.m = list2;
        this.n = z;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return LazyGridMeasureKt.b(this.b, this.m, this.n, (Placeable.PlacementScope) obj);
            default:
                return LazyListMeasureKt.a(this.b, this.m, this.n, (Placeable.PlacementScope) obj);
        }
    }
}
