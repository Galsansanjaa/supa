package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class PredictiveBackStateImpl implements PredictiveBackState {
    private final MutableState value$delegate;

    public PredictiveBackStateImpl() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BackEventProgress.NotRunning.INSTANCE, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.material3.internal.PredictiveBackState
    public BackEventProgress getValue() {
        return (BackEventProgress) this.value$delegate.getValue();
    }

    public void setValue(BackEventProgress backEventProgress) {
        this.value$delegate.setValue(backEventProgress);
    }
}
