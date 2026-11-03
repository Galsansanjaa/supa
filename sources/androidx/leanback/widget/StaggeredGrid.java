package androidx.leanback.widget;

import androidx.collection.CircularArray;
import androidx.collection.CircularIntArray;
import androidx.leanback.widget.Grid;
import defpackage.ak1;
import java.io.PrintWriter;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
abstract class StaggeredGrid extends Grid {
    protected Object mPendingItem;
    protected int mPendingItemSize;
    protected CircularArray<Location> mLocations = new CircularArray<>(64);
    protected int mFirstIndex = -1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Location extends Grid.Location {
        int mOffset;
        int mSize;

        public Location(int i, int i2, int i3) {
            super(i);
            this.mOffset = i2;
            this.mSize = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0039 -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int calculateOffsetAfterLastItem(int r3) {
        /*
            r2 = this;
            int r0 = r2.getLastIndex()
        L4:
            int r1 = r2.mFirstIndex
            if (r0 < r1) goto L14
            androidx.leanback.widget.StaggeredGrid$Location r1 = r2.getLocation(r0)
            int r1 = r1.mRow
            if (r1 != r3) goto L11
            goto L18
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            int r0 = r2.getLastIndex()
        L18:
            boolean r3 = r2.isReversedFlow()
            if (r3 == 0) goto L28
            androidx.leanback.widget.StaggeredGrid$Location r3 = r2.getLocation(r0)
            int r3 = r3.mSize
            int r3 = -r3
            int r1 = r2.mSpacing
            goto L3f
        L28:
            androidx.leanback.widget.StaggeredGrid$Location r3 = r2.getLocation(r0)
            int r3 = r3.mSize
            int r1 = r2.mSpacing
            int r3 = r3 + r1
        L31:
            int r0 = r0 + 1
            int r1 = r2.getLastIndex()
            if (r0 > r1) goto L41
            androidx.leanback.widget.StaggeredGrid$Location r1 = r2.getLocation(r0)
            int r1 = r1.mOffset
        L3f:
            int r3 = r3 - r1
            goto L31
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGrid.calculateOffsetAfterLastItem(int):int");
    }

    public final boolean appendVisbleItemsWithCache(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (this.mLocations.size() == 0) {
            return false;
        }
        int count = this.mProvider.getCount();
        int i5 = this.mLastVisibleIndex;
        if (i5 >= 0) {
            i2 = i5 + 1;
            i3 = this.mProvider.getEdge(i5);
        } else {
            int i6 = this.mStartIndex;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 > getLastIndex() + 1 || i2 < getFirstIndex()) {
                this.mLocations.clear();
                return false;
            }
            if (i2 > getLastIndex()) {
                return false;
            }
            i3 = Integer.MAX_VALUE;
        }
        int lastIndex = getLastIndex();
        int i7 = i2;
        while (i7 < count && i7 <= lastIndex) {
            Location location = getLocation(i7);
            if (i3 != Integer.MAX_VALUE) {
                i3 += location.mOffset;
            }
            int i8 = i3;
            int i9 = location.mRow;
            int createItem = this.mProvider.createItem(i7, true, this.mTmpItem, false);
            if (createItem != location.mSize) {
                location.mSize = createItem;
                this.mLocations.removeFromEnd(lastIndex - i7);
                i4 = i7;
            } else {
                i4 = lastIndex;
            }
            this.mLastVisibleIndex = i7;
            if (this.mFirstVisibleIndex < 0) {
                this.mFirstVisibleIndex = i7;
            }
            this.mProvider.addItem(this.mTmpItem[0], i7, createItem, i9, i8);
            if (!z && checkAppendOverLimit(i)) {
                return true;
            }
            int edge = i8 == Integer.MAX_VALUE ? this.mProvider.getEdge(i7) : i8;
            if (i9 == this.mNumRows - 1 && z) {
                return true;
            }
            i7++;
            lastIndex = i4;
            i3 = edge;
        }
        return false;
    }

    public final int appendVisibleItemToRow(int i, int i2, int i3) {
        int i4 = this.mLastVisibleIndex;
        if (i4 >= 0 && (i4 != getLastIndex() || (i4 = this.mLastVisibleIndex) != i - 1)) {
            ak1.i();
            return 0;
        }
        Location location = new Location(i2, i4 < 0 ? (this.mLocations.size() <= 0 || i != getLastIndex() + 1) ? 0 : calculateOffsetAfterLastItem(i2) : i3 - this.mProvider.getEdge(i4), 0);
        this.mLocations.addLast(location);
        Object obj = this.mPendingItem;
        if (obj != null) {
            location.mSize = this.mPendingItemSize;
            this.mPendingItem = null;
        } else {
            location.mSize = this.mProvider.createItem(i, true, this.mTmpItem, false);
            obj = this.mTmpItem[0];
        }
        Object obj2 = obj;
        if (this.mLocations.size() == 1) {
            this.mLastVisibleIndex = i;
            this.mFirstVisibleIndex = i;
            this.mFirstIndex = i;
        } else {
            int i5 = this.mLastVisibleIndex;
            if (i5 < 0) {
                this.mLastVisibleIndex = i;
                this.mFirstVisibleIndex = i;
            } else {
                this.mLastVisibleIndex = i5 + 1;
            }
        }
        this.mProvider.addItem(obj2, i, location.mSize, i2, i3);
        return location.mSize;
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean appendVisibleItems(int i, boolean z) {
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z && checkAppendOverLimit(i)) {
            return false;
        }
        try {
            if (!appendVisbleItemsWithCache(i, z)) {
                return appendVisibleItemsWithoutCache(i, z);
            }
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
            return true;
        } finally {
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
        }
    }

    public abstract boolean appendVisibleItemsWithoutCache(int i, boolean z);

    @Override // androidx.leanback.widget.Grid
    public final void debugPrint(PrintWriter printWriter) {
        int size = this.mLocations.size();
        for (int i = 0; i < size; i++) {
            printWriter.print("<" + (this.mFirstIndex + i) + "," + this.mLocations.get(i).mRow + ">");
            printWriter.print(" ");
            printWriter.println();
        }
    }

    public final int getFirstIndex() {
        return this.mFirstIndex;
    }

    @Override // androidx.leanback.widget.Grid
    public final CircularIntArray[] getItemPositionsInRows(int i, int i2) {
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            this.mTmpItemPositionsInRows[i3].clear();
        }
        if (i >= 0) {
            while (i <= i2) {
                CircularIntArray circularIntArray = this.mTmpItemPositionsInRows[getLocation(i).mRow];
                if (circularIntArray.size() <= 0 || circularIntArray.getLast() != i - 1) {
                    circularIntArray.addLast(i);
                    circularIntArray.addLast(i);
                } else {
                    circularIntArray.popLast();
                    circularIntArray.addLast(i);
                }
                i++;
            }
        }
        return this.mTmpItemPositionsInRows;
    }

    public final int getLastIndex() {
        return (this.mLocations.size() + this.mFirstIndex) - 1;
    }

    @Override // androidx.leanback.widget.Grid
    public final Location getLocation(int i) {
        int i2 = i - this.mFirstIndex;
        if (i2 < 0 || i2 >= this.mLocations.size()) {
            return null;
        }
        return this.mLocations.get(i2);
    }

    public final int getSize() {
        return this.mLocations.size();
    }

    @Override // androidx.leanback.widget.Grid
    public void invalidateItemsAfter(int i) {
        super.invalidateItemsAfter(i);
        this.mLocations.removeFromEnd((getLastIndex() - i) + 1);
        if (this.mLocations.size() == 0) {
            this.mFirstIndex = -1;
        }
    }

    public final boolean prependVisbleItemsWithCache(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (this.mLocations.size() == 0) {
            return false;
        }
        int i5 = this.mFirstVisibleIndex;
        if (i5 >= 0) {
            i3 = this.mProvider.getEdge(i5);
            i4 = getLocation(this.mFirstVisibleIndex).mOffset;
            i2 = this.mFirstVisibleIndex - 1;
        } else {
            int i6 = this.mStartIndex;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 > getLastIndex() || i2 < getFirstIndex() - 1) {
                this.mLocations.clear();
                return false;
            }
            if (i2 < getFirstIndex()) {
                return false;
            }
            i3 = Integer.MAX_VALUE;
            i4 = 0;
        }
        int max = Math.max(this.mProvider.getMinIndex(), this.mFirstIndex);
        for (int i7 = i2; i7 >= max; i7--) {
            Location location = getLocation(i7);
            int i8 = location.mRow;
            int createItem = this.mProvider.createItem(i7, false, this.mTmpItem, false);
            if (createItem != location.mSize) {
                this.mLocations.removeFromStart((i7 + 1) - this.mFirstIndex);
                this.mFirstIndex = this.mFirstVisibleIndex;
                this.mPendingItem = this.mTmpItem[0];
                this.mPendingItemSize = createItem;
                return false;
            }
            this.mFirstVisibleIndex = i7;
            if (this.mLastVisibleIndex < 0) {
                this.mLastVisibleIndex = i7;
            }
            this.mProvider.addItem(this.mTmpItem[0], i7, createItem, i8, i3 - i4);
            if (!z && checkPrependOverLimit(i)) {
                return true;
            }
            i3 = this.mProvider.getEdge(i7);
            i4 = location.mOffset;
            if (i8 == 0 && z) {
                return true;
            }
        }
        return false;
    }

    public final int prependVisibleItemToRow(int i, int i2, int i3) {
        int i4;
        int i5 = this.mFirstVisibleIndex;
        if (i5 >= 0 && (i5 != getFirstIndex() || this.mFirstVisibleIndex != i + 1)) {
            ak1.i();
            return 0;
        }
        int i6 = this.mFirstIndex;
        Location location = i6 >= 0 ? getLocation(i6) : null;
        int edge = this.mProvider.getEdge(this.mFirstIndex);
        Location location2 = new Location(i2, 0, 0);
        this.mLocations.addFirst(location2);
        Object obj = this.mPendingItem;
        if (obj != null) {
            int i7 = this.mPendingItemSize;
            location2.mSize = i7;
            this.mPendingItem = null;
            i4 = i7;
        } else {
            int createItem = this.mProvider.createItem(i, false, this.mTmpItem, false);
            location2.mSize = createItem;
            obj = this.mTmpItem[0];
            i4 = createItem;
        }
        Object obj2 = obj;
        this.mFirstVisibleIndex = i;
        this.mFirstIndex = i;
        if (this.mLastVisibleIndex < 0) {
            this.mLastVisibleIndex = i;
        }
        int i8 = !this.mReversedFlow ? i3 - i4 : i3 + i4;
        if (location != null) {
            location.mOffset = edge - i8;
        }
        this.mProvider.addItem(obj2, i, i4, i2, i8);
        return location2.mSize;
    }

    @Override // androidx.leanback.widget.Grid
    public final boolean prependVisibleItems(int i, boolean z) {
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z && checkPrependOverLimit(i)) {
            return false;
        }
        try {
            if (!prependVisbleItemsWithCache(i, z)) {
                return prependVisibleItemsWithoutCache(i, z);
            }
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
            return true;
        } finally {
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
        }
    }

    public abstract boolean prependVisibleItemsWithoutCache(int i, boolean z);
}
