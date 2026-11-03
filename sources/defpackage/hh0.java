package defpackage;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ DragAndDropTarget m;

    public /* synthetic */ hh0(ps0 ps0Var, DragAndDropTarget dragAndDropTarget, int i) {
        this.a = i;
        this.b = ps0Var;
        this.m = dragAndDropTarget;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DragAndDropNodeKt.b(this.b, this.m, (DragAndDropEvent) obj);
            default:
                return DragAndDropNodeKt.a(this.b, this.m, (DragAndDropEvent) obj);
        }
    }
}
