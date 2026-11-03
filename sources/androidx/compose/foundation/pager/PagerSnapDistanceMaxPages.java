package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import defpackage.ea0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable = 0;
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i) {
        this.pagesLimit = i;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i, int i2, float f, int i3, int i4) {
        long j = i;
        int i5 = this.pagesLimit;
        long j2 = j - i5;
        if (j2 < 0) {
            j2 = 0;
        }
        int i6 = (int) j2;
        long j3 = j + i5;
        if (j3 > SieveCacheKt.NodeLinkMask) {
            j3 = 2147483647L;
        }
        return ea0.o(i2, i6, (int) j3);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
    }

    public int hashCode() {
        return this.pagesLimit;
    }
}
