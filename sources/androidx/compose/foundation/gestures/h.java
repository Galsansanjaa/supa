package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.ts0;
import defpackage.w42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w42 b;

    public /* synthetic */ h(w42 w42Var, int i) {
        this.a = i;
        this.b = w42Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        w42 w42Var = this.b;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectHorizontalDragGestures$5.d(w42Var, pointerInputChange, floatValue);
            default:
                return DragGestureDetectorKt$detectVerticalDragGestures$5.d(w42Var, pointerInputChange, floatValue);
        }
    }
}
