package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ps implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;

    public /* synthetic */ ps(ps0 ps0Var, int i) {
        this.a = i;
        this.b = ps0Var;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                ps0Var.invoke((Throwable) obj);
                return vy2.a;
            default:
                return DragGestureDetectorKt.o(ps0Var, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
        }
    }
}
