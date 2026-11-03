package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LayoutBoundsHolder {
    public static final int $stable = 0;
    private final MutableState bounds$delegate;

    public LayoutBoundsHolder() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.bounds$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RelativeLayoutBounds getBounds() {
        return (RelativeLayoutBounds) this.bounds$delegate.getValue();
    }

    public final void setBounds$ui(RelativeLayoutBounds relativeLayoutBounds) {
        this.bounds$delegate.setValue(relativeLayoutBounds);
    }
}
