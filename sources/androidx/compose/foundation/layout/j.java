package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 measure_3p2s80s$lambda$0;
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return GridMeasurePolicy.a((GridTrackSizes) obj3, (ResolvedGridItemIndicesResult) obj2, (Placeable.PlacementScope) obj);
            case 1:
                return OffsetNode.a((OffsetNode) obj3, (Placeable) obj2, (Placeable.PlacementScope) obj);
            case 2:
                return OffsetPxNode.a((OffsetPxNode) obj3, (Placeable) obj2, (Placeable.PlacementScope) obj);
            case 3:
                return PaddingNode.a((PaddingNode) obj3, (Placeable) obj2, (Placeable.PlacementScope) obj);
            default:
                measure_3p2s80s$lambda$0 = VisibilityNode.measure_3p2s80s$lambda$0((VisibilityNode) obj3, (Placeable) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
        }
    }
}
