package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RailPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesRail$delegate;

    public RailPredictiveBackState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.swipeEdgeMatchesRail$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesRail() {
        return ((Boolean) this.swipeEdgeMatchesRail$delegate.getValue()).booleanValue();
    }

    public final void setSwipeEdgeMatchesRail(boolean z) {
        this.swipeEdgeMatchesRail$delegate.setValue(Boolean.valueOf(z));
    }

    public final void update(boolean z, boolean z2) {
        setSwipeEdgeMatchesRail((z && !z2) || (!z && z2));
    }
}
