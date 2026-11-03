package defpackage;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object n;

    public /* synthetic */ o6(int i, Object obj, boolean z, boolean z2) {
        this.a = i;
        this.n = obj;
        this.b = z;
        this.m = z2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AndroidSelectionHandles_androidKt.h((OffsetProvider) this.n, this.b, this.m, (SemanticsPropertyReceiver) obj);
            default:
                return SwipeToDismissBoxKt.b((IntSize) this.n, this.b, this.m, (DraggableAnchorsConfig) obj);
        }
    }
}
