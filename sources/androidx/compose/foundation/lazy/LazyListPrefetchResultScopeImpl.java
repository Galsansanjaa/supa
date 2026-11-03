package androidx.compose.foundation.lazy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyListPrefetchResultScopeImpl implements LazyListPrefetchResultScope {
    public static final int $stable = 0;
    private final int index;
    private final int mainAxisSize;

    public LazyListPrefetchResultScopeImpl(int i, int i2) {
        this.index = i;
        this.mainAxisSize = i2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getMainAxisSize() {
        return this.mainAxisSize;
    }
}
