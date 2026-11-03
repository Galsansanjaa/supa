package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OnSizeChangedNode extends Modifier.Node implements MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private ps0 onSizeChanged;
    private final boolean shouldAutoInvalidate = true;
    private long previousSize = IntSize.m8211constructorimpl(-9223372034707292160L);

    public OnSizeChangedNode(ps0 ps0Var) {
        this.onSizeChanged = ps0Var;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo113onRemeasuredozmzZPI(long j) {
        if (IntSize.m8214equalsimpl0(this.previousSize, j)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m8208boximpl(j));
        this.previousSize = j;
    }

    public final void update(ps0 ps0Var) {
        this.onSizeChanged = ps0Var;
        this.previousSize = IntSize.m8211constructorimpl(-9223372034707292160L);
    }
}
