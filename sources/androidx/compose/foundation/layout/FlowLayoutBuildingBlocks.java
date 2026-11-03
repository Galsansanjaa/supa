package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j;
            this.placeEllipsisOnLastContentLine = z;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z, int i, sb0 sb0Var) {
            this(measurable, placeable, j, (i & 8) != 0 ? true : z, null);
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j, boolean z, sb0 sb0Var) {
            this(measurable, placeable, j, z);
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m914getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z) {
            this.placeEllipsisOnLastContentLine = z;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WrapInfo() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo.<init>():void");
        }

        public WrapInfo(boolean z, boolean z2) {
            this.isLastItemInLine = z;
            this.isLastItemInContainer = z2;
        }

        public /* synthetic */ WrapInfo(boolean z, boolean z2, int i, sb0 sb0Var) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }
    }

    private FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4) {
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j;
        this.maxLines = i2;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4, sb0 sb0Var) {
        this(i, flowLayoutOverflowState, j, i2, i3, i4);
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean z, int i, int i2, int i3, int i4) {
        WrapEllipsisInfo ellipsisInfo$foundation_layout;
        if (!wrapInfo.isLastItemInContainer() || (ellipsisInfo$foundation_layout = this.overflow.ellipsisInfo$foundation_layout(z, i, i2)) == null) {
            return null;
        }
        ellipsisInfo$foundation_layout.setPlaceEllipsisOnLastContentLine(i >= 0 && (i4 == 0 || (i3 - IntIntPair.m30getFirstimpl(ellipsisInfo$foundation_layout.m914getEllipsisSizeOO21N7I()) >= 0 && i4 < this.maxItemsInMainAxis)));
        return ellipsisInfo$foundation_layout;
    }

    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m913getWrapInfoOpUlnko(boolean z, int i, long j, IntIntPair intIntPair, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible && (i2 >= this.maxLines || IntIntPair.m31getSecondimpl(j) - IntIntPair.m31getSecondimpl(intIntPair.m34unboximpl()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i != 0 && (i >= this.maxItemsInMainAxis || IntIntPair.m30getFirstimpl(j) - IntIntPair.m30getFirstimpl(intIntPair.m34unboximpl()) < 0)) {
            return z2 ? new WrapInfo(true, true) : new WrapInfo(true, m913getWrapInfoOpUlnko(z, 0, IntIntPair.m26constructorimpl(Constraints.m8014getMaxWidthimpl(this.constraints), (IntIntPair.m31getSecondimpl(j) - this.crossAxisSpacing) - i4), IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(IntIntPair.m30getFirstimpl(intIntPair.m34unboximpl()) - this.mainAxisSpacing, IntIntPair.m31getSecondimpl(intIntPair.m34unboximpl()))), i2 + 1, i5, 0, true, false).isLastItemInContainer());
        }
        int max = Math.max(i4, IntIntPair.m31getSecondimpl(intIntPair.m34unboximpl())) + i3;
        IntIntPair m918ellipsisSizeF35zmw$foundation_layout = z3 ? null : this.overflow.m918ellipsisSizeF35zmw$foundation_layout(z, i2, max);
        if (m918ellipsisSizeF35zmw$foundation_layout != null) {
            m918ellipsisSizeF35zmw$foundation_layout.m34unboximpl();
            if (i + 1 >= this.maxItemsInMainAxis || ((IntIntPair.m30getFirstimpl(j) - IntIntPair.m30getFirstimpl(intIntPair.m34unboximpl())) - this.mainAxisSpacing) - IntIntPair.m30getFirstimpl(m918ellipsisSizeF35zmw$foundation_layout.m34unboximpl()) < 0) {
                if (z3) {
                    return new WrapInfo(true, true);
                }
                WrapInfo m913getWrapInfoOpUlnko = m913getWrapInfoOpUlnko(false, 0, IntIntPair.m26constructorimpl(Constraints.m8014getMaxWidthimpl(this.constraints), (IntIntPair.m31getSecondimpl(j) - this.crossAxisSpacing) - Math.max(i4, IntIntPair.m31getSecondimpl(intIntPair.m34unboximpl()))), m918ellipsisSizeF35zmw$foundation_layout, i2 + 1, max, 0, true, true);
                return new WrapInfo(m913getWrapInfoOpUlnko.isLastItemInContainer(), m913getWrapInfoOpUlnko.isLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }
}
