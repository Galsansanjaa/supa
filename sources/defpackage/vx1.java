package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PointerInteropFilter b;

    public /* synthetic */ vx1(PointerInteropFilter pointerInteropFilter, int i) {
        this.a = i;
        this.b = pointerInteropFilter;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 onCancel$lambda$7;
        vy2 stopDispatching$lambda$11;
        int i = this.a;
        PointerInteropFilter pointerInteropFilter = this.b;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (i) {
            case 0:
                onCancel$lambda$7 = PointerInteropFilter$pointerInputFilter$1.onCancel$lambda$7(pointerInteropFilter, motionEvent);
                return onCancel$lambda$7;
            default:
                stopDispatching$lambda$11 = PointerInteropFilter$pointerInputFilter$1.stopDispatching$lambda$11(pointerInteropFilter, motionEvent);
                return stopDispatching$lambda$11;
        }
    }
}
