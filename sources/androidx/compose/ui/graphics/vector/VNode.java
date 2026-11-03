package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private ps0 invalidateListener;

    private VNode() {
    }

    public /* synthetic */ VNode(sb0 sb0Var) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public ps0 getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        ps0 invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }

    public void setInvalidateListener$ui(ps0 ps0Var) {
        this.invalidateListener = ps0Var;
    }
}
