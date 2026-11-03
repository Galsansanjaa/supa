package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object m;

    public /* synthetic */ l(Object obj, int i, float f) {
        this.a = i;
        this.b = f;
        this.m = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ChipKt$InputChip$1.a(this.b, (Shape) this.m, (GraphicsLayerScope) obj);
            default:
                return NavigationDrawerKt$ModalNavigationDrawer$2$6$1.a(this.b, (MutableFloatState) this.m, (DraggableAnchorsConfig) obj);
        }
    }
}
