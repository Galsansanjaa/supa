package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;

    public /* synthetic */ g(int i, ts0 ts0Var) {
        this.a = i;
        this.b = ts0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 invokeSuspend$lambda$1;
        vy2 invokeSuspend$lambda$12;
        int i = this.a;
        ts0 ts0Var = this.b;
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        switch (i) {
            case 0:
                return DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.d(ts0Var, pointerInputChange);
            case 1:
                invokeSuspend$lambda$1 = DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend$lambda$1(ts0Var, pointerInputChange);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$12 = DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend$lambda$1(ts0Var, pointerInputChange);
                return invokeSuspend$lambda$12;
        }
    }
}
