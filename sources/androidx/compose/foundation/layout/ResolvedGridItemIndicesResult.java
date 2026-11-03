package androidx.compose.foundation.layout;

import androidx.collection.MutableObjectList;
import defpackage.sb0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ResolvedGridItemIndicesResult {
    private final MutableObjectList<GridItem> gridItems;
    private final long gridSize;

    private ResolvedGridItemIndicesResult(MutableObjectList<GridItem> mutableObjectList, long j) {
        this.gridItems = mutableObjectList;
        this.gridSize = j;
    }

    public /* synthetic */ ResolvedGridItemIndicesResult(MutableObjectList mutableObjectList, long j, sb0 sb0Var) {
        this(mutableObjectList, j);
    }

    public final MutableObjectList<GridItem> getGridItems() {
        return this.gridItems;
    }

    /* renamed from: getGridSize-YbymL2g, reason: not valid java name */
    public final long m1101getGridSizeYbymL2g() {
        return this.gridSize;
    }
}
