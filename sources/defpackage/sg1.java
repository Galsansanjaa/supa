package defpackage;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextDragObserver b;

    public /* synthetic */ sg1(TextDragObserver textDragObserver, int i) {
        this.a = i;
        this.b = textDragObserver;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        TextDragObserver textDragObserver = this.b;
        switch (i) {
            case 0:
                return LongPressTextDragObserverKt.c(textDragObserver, (Offset) obj);
            case 1:
                return SelectionGesturesKt.b(textDragObserver, (PointerInputChange) obj);
            default:
                return SelectionGesturesKt.d(textDragObserver, (PointerInputChange) obj);
        }
    }
}
