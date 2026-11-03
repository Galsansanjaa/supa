package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.kw;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private final int initialNestedPrefetchItemCount;
    private int lineToPrefetch;
    private float previousPassDelta;
    private int previousPassItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyGridPrefetchStrategy() {
        this(0, 1, null);
    }

    public DefaultLazyGridPrefetchStrategy(int i) {
        this.initialNestedPrefetchItemCount = i;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.previousPassItemCount = -1;
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    private final int calculateClosestNextItemToPrefetch(LazyGridLayoutInfo lazyGridLayoutInfo, boolean z) {
        return z ? ((LazyGridItemInfo) kw.x0(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyGridItemInfo) kw.p0(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
    }

    private final int calculateLineIndexToPrefetch(LazyGridLayoutInfo lazyGridLayoutInfo, boolean z) {
        if (z) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) kw.x0(lazyGridLayoutInfo.getVisibleItemsInfo());
            return (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        }
        LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) kw.p0(lazyGridLayoutInfo.getVisibleItemsInfo());
        return (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
    }

    private final void evaluatePrefetchForCancellation(LazyGridLayoutInfo lazyGridLayoutInfo, int i, boolean z) {
        if (i == -1 || lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty() || i == calculateLineIndexToPrefetch(lazyGridLayoutInfo, z)) {
            return;
        }
        resetPrefetchState();
    }

    private final void resetPrefetchState() {
        this.lineToPrefetch = -1;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
        LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            prefetchHandleArr[i].cancel();
        }
        this.currentLinePrefetchHandles.clear();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i2 = 0; i2 < nestedPrefetchItemCount; i2++) {
            nestedPrefetchScope.schedulePrecomposition(i + i2);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f, LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int i = 0;
            boolean z = f < 0.0f;
            int calculateLineIndexToPrefetch = calculateLineIndexToPrefetch(lazyGridLayoutInfo, z);
            int calculateClosestNextItemToPrefetch = calculateClosestNextItemToPrefetch(lazyGridLayoutInfo, z);
            if (calculateClosestNextItemToPrefetch >= 0 && calculateClosestNextItemToPrefetch < lazyGridLayoutInfo.getTotalItemsCount()) {
                if (calculateLineIndexToPrefetch != this.lineToPrefetch && calculateLineIndexToPrefetch >= 0) {
                    if (this.wasScrollingForward != z) {
                        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                        LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            prefetchHandleArr[i2].cancel();
                        }
                    }
                    this.wasScrollingForward = z;
                    this.lineToPrefetch = calculateLineIndexToPrefetch;
                    this.currentLinePrefetchHandles.clear();
                    MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector2 = this.currentLinePrefetchHandles;
                    mutableVector2.addAll(mutableVector2.getSize(), (List<? extends LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(calculateLineIndexToPrefetch));
                }
                if (z) {
                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) kw.x0(lazyGridLayoutInfo.getVisibleItemsInfo());
                    if (((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, lazyGridLayoutInfo.getOrientation()) + LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, lazyGridLayoutInfo.getOrientation())) + lazyGridLayoutInfo.getMainAxisItemSpacing()) - lazyGridLayoutInfo.getViewportEndOffset() < (-f)) {
                        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector3 = this.currentLinePrefetchHandles;
                        LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr2 = mutableVector3.content;
                        int size2 = mutableVector3.getSize();
                        while (i < size2) {
                            prefetchHandleArr2[i].markAsUrgent();
                            i++;
                        }
                    }
                } else if (lazyGridLayoutInfo.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) kw.p0(lazyGridLayoutInfo.getVisibleItemsInfo()), lazyGridLayoutInfo.getOrientation()) < f) {
                    MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector4 = this.currentLinePrefetchHandles;
                    LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr3 = mutableVector4.content;
                    int size3 = mutableVector4.getSize();
                    while (i < size3) {
                        prefetchHandleArr3[i].markAsUrgent();
                        i++;
                    }
                }
            }
        }
        this.previousPassDelta = f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        evaluatePrefetchForCancellation(lazyGridLayoutInfo, this.lineToPrefetch, this.wasScrollingForward);
        int totalItemsCount = lazyGridLayoutInfo.getTotalItemsCount();
        int i = this.previousPassItemCount;
        if (i != -1 && this.previousPassDelta != 0.0f && i != totalItemsCount && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int calculateLineIndexToPrefetch = calculateLineIndexToPrefetch(lazyGridLayoutInfo, this.previousPassDelta < 0.0f);
            int calculateClosestNextItemToPrefetch = calculateClosestNextItemToPrefetch(lazyGridLayoutInfo, this.previousPassDelta < 0.0f);
            if (calculateClosestNextItemToPrefetch >= 0 && calculateClosestNextItemToPrefetch < lazyGridLayoutInfo.getTotalItemsCount() && calculateLineIndexToPrefetch != this.lineToPrefetch && calculateLineIndexToPrefetch >= 0) {
                this.lineToPrefetch = calculateLineIndexToPrefetch;
                this.currentLinePrefetchHandles.clear();
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                mutableVector.addAll(mutableVector.getSize(), (List<? extends LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(calculateLineIndexToPrefetch));
            }
        }
        this.previousPassItemCount = totalItemsCount;
    }
}
