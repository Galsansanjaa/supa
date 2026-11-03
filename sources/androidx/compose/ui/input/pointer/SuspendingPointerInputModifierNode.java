package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    PointerInputEventHandler getPointerInputEventHandler();

    ts0 getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler);

    void setPointerInputHandler(ts0 ts0Var);
}
