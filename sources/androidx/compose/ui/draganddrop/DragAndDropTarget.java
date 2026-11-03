package androidx.compose.ui.draganddrop;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface DragAndDropTarget {
    void onChanged(DragAndDropEvent dragAndDropEvent);

    boolean onDrop(DragAndDropEvent dragAndDropEvent);

    void onEnded(DragAndDropEvent dragAndDropEvent);

    void onEntered(DragAndDropEvent dragAndDropEvent);

    void onExited(DragAndDropEvent dragAndDropEvent);

    void onMoved(DragAndDropEvent dragAndDropEvent);

    void onStarted(DragAndDropEvent dragAndDropEvent);
}
