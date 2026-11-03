package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridItemInfoKt {
    public static final int lineIndex(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn();
    }
}
