package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridPrefetchResultScopeImpl implements LazyGridPrefetchResultScope {
    public static final int $stable = 8;
    private final int lineIndex;
    private final List<Integer> mainAxisSizes;

    public LazyGridPrefetchResultScopeImpl(int i, List<Integer> list) {
        this.lineIndex = i;
        this.mainAxisSizes = list;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineItemCount() {
        return this.mainAxisSizes.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getMainAxisSize(int i) {
        return this.mainAxisSizes.get(i).intValue();
    }
}
