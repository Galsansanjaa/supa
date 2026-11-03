package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    public /* synthetic */ j(Placeable placeable, float f, float f2, int i) {
        this.a = i;
        this.b = placeable;
        this.m = f;
        this.n = f2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DraggableAnchorsNode.a(this.b, this.m, this.n, (Placeable.PlacementScope) obj);
            default:
                return DraggableAnchorsNodeV2.a(this.b, this.m, this.n, (Placeable.PlacementScope) obj);
        }
    }
}
