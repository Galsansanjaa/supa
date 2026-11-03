package androidx.compose.foundation.lazy.layout;

import defpackage.jh2;
import defpackage.kw;
import defpackage.m6;
import defpackage.oi0;
import defpackage.ow;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new m6(9);

    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$0(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return jh2.s(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    public static final Object getParentData(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i) {
        return lazyLayoutMeasuredItem.getPlaceables().get(i).getParentData();
    }

    public static final int getPlaceablesCount(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        return lazyLayoutMeasuredItem.getPlaceables().size();
    }

    public static final int mainAxisSizeWithSpacings(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        int horizontalAxisSize;
        int horizontalAxisSpacing;
        if (z) {
            horizontalAxisSize = lazyLayoutMeasuredItem.getVerticalAxisSize();
            horizontalAxisSpacing = lazyLayoutMeasuredItem.getVerticalAxisSpacing();
        } else {
            horizontalAxisSize = lazyLayoutMeasuredItem.getHorizontalAxisSize();
            horizontalAxisSpacing = lazyLayoutMeasuredItem.getHorizontalAxisSpacing();
        }
        return horizontalAxisSpacing + horizontalAxisSize;
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i, int i2, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return oi0.a;
        }
        ArrayList M0 = kw.M0(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            int index = t.getIndex();
            if (i <= index && index <= i2) {
                M0.add(t);
            }
        }
        ow.a0(M0, LazyLayoutMeasuredItemIndexComparator);
        return M0;
    }
}
