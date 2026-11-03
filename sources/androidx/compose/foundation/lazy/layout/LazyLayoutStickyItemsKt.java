package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import defpackage.oi0;
import defpackage.os0;
import defpackage.ps0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final /* synthetic */ int access$mainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        return mainAxisOffset(lazyLayoutMeasuredItem, z);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, int i, int i2, List<T> list, IntList intList, int i3, int i4, int i5, int i6, boolean z, ps0 ps0Var) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        boolean z2 = z;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return oi0.a;
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(i, i2, intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t = list.get(i7);
            if (intList.contains(t.getIndex())) {
                arrayList2.add(t);
            }
        }
        int[] iArr = stickingIndices.content;
        int i8 = stickingIndices._size;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            Iterator<T> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next().getIndex() == i10) {
                    break;
                }
                i11++;
            }
            T remove = i11 == -1 ? (LazyLayoutMeasuredItem) ps0Var.invoke(Integer.valueOf(i10)) : list.remove(i11);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = remove;
            int calculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i10, LazyLayoutMeasuredItemKt.mainAxisSizeWithSpacings(remove, z2), i11 == -1 ? Integer.MIN_VALUE : mainAxisOffset(remove, z2), i3, i4, i5, i6, z2);
            lazyLayoutMeasuredItem.makeNonScrollable();
            lazyLayoutMeasuredItem.position(calculateStickingItemOffset, 0, i5, i6);
            arrayList.add(lazyLayoutMeasuredItem);
            i9++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            z2 = z;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    private static final void debugLog(os0 os0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        long mo1183getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1183getOffsetBjo55l4(0);
        return z ? IntOffset.m8174getYimpl(mo1183getOffsetBjo55l4) : IntOffset.m8173getXimpl(mo1183getOffsetBjo55l4);
    }
}
