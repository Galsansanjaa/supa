package defpackage;

import androidx.compose.foundation.style.StyleInnerNode;
import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.KeylinesKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class wa1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ float n;

    public /* synthetic */ wa1(float f, Arrangement arrangement, float f2, int i) {
        this.a = i;
        this.b = f;
        this.m = arrangement;
        this.n = f2;
    }

    public /* synthetic */ wa1(Placeable placeable, float f, float f2) {
        this.a = 2;
        this.m = placeable;
        this.b = f;
        this.n = f2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.n;
        float f2 = this.b;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return KeylinesKt.a(f2, (Arrangement) obj2, f, (KeylineListScope) obj);
            case 1:
                return KeylinesKt.b(f2, (Arrangement) obj2, f, (KeylineListScope) obj);
            default:
                return StyleInnerNode.a((Placeable) obj2, f2, f, (Placeable.PlacementScope) obj);
        }
    }
}
