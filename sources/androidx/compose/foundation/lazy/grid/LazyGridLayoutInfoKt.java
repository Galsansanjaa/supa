package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int calculateContentSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int afterContentPadding = lazyGridLayoutInfo.getAfterContentPadding() + lazyGridLayoutInfo.getBeforeContentPadding();
        if (lazyGridLayoutInfo.getTotalItemsCount() == 0) {
            return afterContentPadding;
        }
        int ceil = (int) Math.ceil(lazyGridLayoutInfo.getTotalItemsCount() / lazyGridLayoutInfo.getMaxSpan());
        return (lazyGridLayoutInfo.getMainAxisItemSpacing() * (ceil - 1)) + ((visibleLinesAverageMainAxisSize(lazyGridLayoutInfo) - lazyGridLayoutInfo.getMainAxisItemSpacing()) * ceil) + afterContentPadding;
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridLayoutInfo.mo1206getViewportSizeYbymL2g() & 4294967295L : lazyGridLayoutInfo.mo1206getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int visibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i);
            if (visibleLinesAverageMainAxisSize$lineOf == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i) == visibleLinesAverageMainAxisSize$lineOf) {
                    i4 = Math.max(i4, (int) (z ? visibleItemsInfo.get(i).mo1204getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i).mo1204getSizeYbymL2g() >> 32));
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return lazyGridLayoutInfo.getMainAxisItemSpacing() + (i2 / i3);
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z, LazyGridLayoutInfo lazyGridLayoutInfo, int i) {
        return z ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getColumn();
    }
}
