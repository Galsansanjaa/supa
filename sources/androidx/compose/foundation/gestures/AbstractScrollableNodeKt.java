package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerType;
import defpackage.d1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AbstractScrollableNodeKt {
    private static final ps0 CanDragCalculation = new d1(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CanDragCalculation$lambda$0(PointerType pointerType) {
        return !(pointerType == null ? false : PointerType.m6652equalsimpl0(pointerType.m6655unboximpl(), PointerType.Companion.m6657getMouseT8wyACA()));
    }

    public static final ps0 getCanDragCalculation() {
        return CanDragCalculation;
    }
}
