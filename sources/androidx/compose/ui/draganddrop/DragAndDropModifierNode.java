package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.DelegatableNode;
import defpackage.hd0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    @hd0
    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo4884drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j, ps0 ps0Var);
}
