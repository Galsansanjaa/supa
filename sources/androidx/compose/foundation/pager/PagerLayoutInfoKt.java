package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.gestures.Orientation;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int calculateContentSize(PagerLayoutInfo pagerLayoutInfo, int i) {
        int afterContentPadding = pagerLayoutInfo.getAfterContentPadding() + pagerLayoutInfo.getBeforeContentPadding();
        if (i == 0) {
            return afterContentPadding;
        }
        long j = i;
        long pageSpacing = ((j - 1) * pagerLayoutInfo.getPageSpacing()) + (pagerLayoutInfo.getPageSize() * j) + afterContentPadding;
        if (pageSpacing > SieveCacheKt.NodeLinkMask) {
            pageSpacing = 2147483647L;
        }
        return (int) pageSpacing;
    }

    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == Orientation.Vertical ? pagerLayoutInfo.mo1320getViewportSizeYbymL2g() & 4294967295L : pagerLayoutInfo.mo1320getViewportSizeYbymL2g() >> 32);
    }
}
