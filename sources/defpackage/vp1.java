package defpackage;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class vp1 implements ps0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ vp1(int i, int i2, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.b = i;
        this.m = i2;
        this.n = mutableObjectIntMap;
        this.o = nearestRangeKeyIndexMap;
    }

    public /* synthetic */ vp1(RectRulers rectRulers, int i, int i2, Placeable placeable) {
        this.n = rectRulers;
        this.b = i;
        this.m = i2;
        this.o = placeable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 lambda$1$0;
        int i = this.a;
        Object obj2 = this.o;
        int i2 = this.m;
        int i3 = this.b;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                lambda$1$0 = NearestRangeKeyIndexMap.lambda$1$0(i3, i2, (MutableObjectIntMap) obj3, (NearestRangeKeyIndexMap) obj2, (IntervalList.Interval) obj);
                return lambda$1$0;
            default:
                return RulerAlignmentKt.f((RectRulers) obj3, i3, i2, (Placeable) obj2, (Placeable.PlacementScope) obj);
        }
    }
}
