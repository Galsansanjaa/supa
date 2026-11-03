package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import defpackage.ea0;
import defpackage.i61;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface StickyItemsPlacement {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = list.get(i8);
                    if (lazyLayoutMeasuredItem.getIndex() != i) {
                        break;
                    }
                    i8++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int access$mainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItemsKt.access$mainAxisOffset(lazyLayoutMeasuredItem2, z) : Integer.MIN_VALUE;
                int max = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return access$mainAxisOffset != Integer.MIN_VALUE ? Math.min(max, access$mainAxisOffset - i2) : max;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public IntList getStickingIndices(int i, int i2, IntList intList) {
                int i3;
                if (i2 - i < 0 || (i3 = intList._size) == 0) {
                    return IntListKt.emptyIntList();
                }
                i61 M = ea0.M(0, i3);
                int i4 = M.a;
                int i5 = M.b;
                int i6 = -1;
                if (i4 <= i5) {
                    while (intList.get(i4) <= i) {
                        i6 = intList.get(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                return i6 == -1 ? IntListKt.emptyIntList() : IntListKt.intListOf(i6);
            }
        };

        private Companion() {
        }

        public final StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }

    int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    IntList getStickingIndices(int i, int i2, IntList intList);
}
