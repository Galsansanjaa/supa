package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AppBarMenuState {
    public static final int $stable = 0;
    private final MutableState isExpanded$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    private final void setExpanded(boolean z) {
        this.isExpanded$delegate.setValue(Boolean.valueOf(z));
    }

    public final void dismiss() {
        setExpanded(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isExpanded() {
        return ((Boolean) this.isExpanded$delegate.getValue()).booleanValue();
    }

    public final void show() {
        setExpanded(true);
    }
}
