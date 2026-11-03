package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.collection.CircularIntArray;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.z72;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Grid {
    static final int START_DEFAULT = -1;
    protected int mNumRows;
    protected Provider mProvider;
    protected boolean mReversedFlow;
    protected int mSpacing;
    protected CircularIntArray[] mTmpItemPositionsInRows;
    Object[] mTmpItem = new Object[1];
    protected int mFirstVisibleIndex = -1;
    protected int mLastVisibleIndex = -1;
    protected int mStartIndex = -1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Location {
        int mRow;

        public Location(int i) {
            this.mRow = i;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public interface Provider {
        void addItem(Object obj, int i, int i2, int i3, int i4);

        int createItem(int i, boolean z, Object[] objArr, boolean z2);

        int getCount();

        int getEdge(int i);

        int getMinIndex();

        int getSize(int i);

        void removeItem(int i);
    }

    public static Grid createGrid(int i) {
        if (i == 1) {
            return new SingleRow();
        }
        StaggeredGridDefault staggeredGridDefault = new StaggeredGridDefault();
        staggeredGridDefault.setNumRows(i);
        return staggeredGridDefault;
    }

    private void resetVisibleIndexIfEmpty() {
        if (this.mLastVisibleIndex < this.mFirstVisibleIndex) {
            resetVisibleIndex();
        }
    }

    public boolean appendOneColumnVisibleItems() {
        return appendVisibleItems(this.mReversedFlow ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public final void appendVisibleItems(int i) {
        appendVisibleItems(i, false);
    }

    public abstract boolean appendVisibleItems(int i, boolean z);

    public final boolean checkAppendOverLimit(int i) {
        if (this.mLastVisibleIndex < 0) {
            return false;
        }
        return this.mReversedFlow ? findRowMin(true, null) <= i + this.mSpacing : findRowMax(false, null) >= i - this.mSpacing;
    }

    public final boolean checkPrependOverLimit(int i) {
        if (this.mLastVisibleIndex < 0) {
            return false;
        }
        return this.mReversedFlow ? findRowMax(false, null) >= i - this.mSpacing : findRowMin(true, null) <= i + this.mSpacing;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
    }

    public abstract void debugPrint(PrintWriter printWriter);

    public void fillDisappearingItems(int[] iArr, int i, SparseIntArray sparseIntArray) {
        int lastVisibleIndex = getLastVisibleIndex();
        int binarySearch = lastVisibleIndex >= 0 ? Arrays.binarySearch(iArr, 0, i, lastVisibleIndex) : 0;
        if (binarySearch < 0) {
            boolean z = this.mReversedFlow;
            Provider provider = this.mProvider;
            int edge = z ? (provider.getEdge(lastVisibleIndex) - this.mProvider.getSize(lastVisibleIndex)) - this.mSpacing : provider.getEdge(lastVisibleIndex) + this.mProvider.getSize(lastVisibleIndex) + this.mSpacing;
            for (int i2 = (-binarySearch) - 1; i2 < i; i2++) {
                int i3 = iArr[i2];
                int i4 = sparseIntArray.get(i3);
                int i5 = i4 < 0 ? 0 : i4;
                int createItem = this.mProvider.createItem(i3, true, this.mTmpItem, true);
                this.mProvider.addItem(this.mTmpItem[0], i3, createItem, i5, edge);
                boolean z2 = this.mReversedFlow;
                int i6 = this.mSpacing;
                edge = z2 ? (edge - createItem) - i6 : edge + createItem + i6;
            }
        }
        int firstVisibleIndex = getFirstVisibleIndex();
        int binarySearch2 = firstVisibleIndex >= 0 ? Arrays.binarySearch(iArr, 0, i, firstVisibleIndex) : 0;
        if (binarySearch2 < 0) {
            int i7 = (-binarySearch2) - 2;
            boolean z3 = this.mReversedFlow;
            Provider provider2 = this.mProvider;
            int edge2 = z3 ? provider2.getEdge(firstVisibleIndex) : provider2.getEdge(firstVisibleIndex);
            while (i7 >= 0) {
                int i8 = iArr[i7];
                int i9 = sparseIntArray.get(i8);
                int i10 = i9 < 0 ? 0 : i9;
                int createItem2 = this.mProvider.createItem(i8, false, this.mTmpItem, true);
                boolean z4 = this.mReversedFlow;
                int i11 = this.mSpacing;
                int i12 = z4 ? edge2 + i11 + createItem2 : (edge2 - i11) - createItem2;
                this.mProvider.addItem(this.mTmpItem[0], i8, createItem2, i10, i12);
                i7--;
                edge2 = i12;
            }
        }
    }

    public abstract int findRowMax(boolean z, int i, int[] iArr);

    public final int findRowMax(boolean z, int[] iArr) {
        return findRowMax(z, this.mReversedFlow ? this.mFirstVisibleIndex : this.mLastVisibleIndex, iArr);
    }

    public abstract int findRowMin(boolean z, int i, int[] iArr);

    public final int findRowMin(boolean z, int[] iArr) {
        return findRowMin(z, this.mReversedFlow ? this.mLastVisibleIndex : this.mFirstVisibleIndex, iArr);
    }

    public final int getFirstVisibleIndex() {
        return this.mFirstVisibleIndex;
    }

    public final CircularIntArray[] getItemPositionsInRows() {
        return getItemPositionsInRows(getFirstVisibleIndex(), getLastVisibleIndex());
    }

    public abstract CircularIntArray[] getItemPositionsInRows(int i, int i2);

    public final int getLastVisibleIndex() {
        return this.mLastVisibleIndex;
    }

    public abstract Location getLocation(int i);

    public int getNumRows() {
        return this.mNumRows;
    }

    public final int getRowIndex(int i) {
        Location location = getLocation(i);
        if (location == null) {
            return -1;
        }
        return location.mRow;
    }

    public void invalidateItemsAfter(int i) {
        int i2;
        if (i >= 0 && (i2 = this.mLastVisibleIndex) >= 0) {
            if (i2 >= i) {
                this.mLastVisibleIndex = i - 1;
            }
            resetVisibleIndexIfEmpty();
            if (getFirstVisibleIndex() < 0) {
                setStart(i);
            }
        }
    }

    public boolean isReversedFlow() {
        return this.mReversedFlow;
    }

    public final boolean prependOneColumnVisibleItems() {
        return prependVisibleItems(this.mReversedFlow ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    public final void prependVisibleItems(int i) {
        prependVisibleItems(i, false);
    }

    public abstract boolean prependVisibleItems(int i, boolean z);

    public void removeInvisibleItemsAtEnd(int i, int i2) {
        while (true) {
            int i3 = this.mLastVisibleIndex;
            if (i3 < this.mFirstVisibleIndex || i3 <= i) {
                break;
            }
            boolean z = this.mReversedFlow;
            Provider provider = this.mProvider;
            if (!z) {
                if (provider.getEdge(i3) < i2) {
                    break;
                }
                this.mProvider.removeItem(this.mLastVisibleIndex);
                this.mLastVisibleIndex--;
            } else {
                if (provider.getEdge(i3) > i2) {
                    break;
                }
                this.mProvider.removeItem(this.mLastVisibleIndex);
                this.mLastVisibleIndex--;
            }
        }
        resetVisibleIndexIfEmpty();
    }

    public void removeInvisibleItemsAtFront(int i, int i2) {
        while (true) {
            int i3 = this.mLastVisibleIndex;
            int i4 = this.mFirstVisibleIndex;
            if (i3 < i4 || i4 >= i) {
                break;
            }
            int size = this.mProvider.getSize(i4);
            boolean z = this.mReversedFlow;
            Provider provider = this.mProvider;
            if (!z) {
                if (provider.getEdge(this.mFirstVisibleIndex) + size > i2) {
                    break;
                }
                this.mProvider.removeItem(this.mFirstVisibleIndex);
                this.mFirstVisibleIndex++;
            } else {
                if (provider.getEdge(this.mFirstVisibleIndex) - size < i2) {
                    break;
                }
                this.mProvider.removeItem(this.mFirstVisibleIndex);
                this.mFirstVisibleIndex++;
            }
        }
        resetVisibleIndexIfEmpty();
    }

    public void resetVisibleIndex() {
        this.mLastVisibleIndex = -1;
        this.mFirstVisibleIndex = -1;
    }

    public void setNumRows(int i) {
        if (i <= 0) {
            z72.k();
            return;
        }
        if (this.mNumRows == i) {
            return;
        }
        this.mNumRows = i;
        this.mTmpItemPositionsInRows = new CircularIntArray[i];
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            this.mTmpItemPositionsInRows[i2] = new CircularIntArray();
        }
    }

    public void setProvider(Provider provider) {
        this.mProvider = provider;
    }

    public final void setReversedFlow(boolean z) {
        this.mReversedFlow = z;
    }

    public final void setSpacing(int i) {
        this.mSpacing = i;
    }

    public void setStart(int i) {
        this.mStartIndex = i;
    }
}
