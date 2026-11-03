package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.hu2;
import defpackage.lt;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private ts0 getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i3 & 2) != 0) {
            i = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i3 & 4) != 0) {
            i2 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 setOverflowMeasurables__hBUhpc$lambda$2$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.seeMoreSize = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(i, i2));
        flowLayoutOverflowState.seeMorePlaceable = placeable;
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 setOverflowMeasurables__hBUhpc$lambda$3$0(FlowLayoutOverflowState flowLayoutOverflowState, FlowLineMeasurePolicy flowLineMeasurePolicy, Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.collapseSize = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(i, i2));
        flowLayoutOverflowState.collapsePlaceable = placeable;
        return vy2.a;
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout() {
        return this.type;
    }

    public final int component2$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        return new FlowLayoutOverflowState(overflowType, i, i2);
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout(boolean z, int i, int i2) {
        Measurable measurable;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3 && i3 != 4) {
                hu2.e();
                return null;
            }
            if (z) {
                ts0 ts0Var = this.getOverflowMeasurable;
                if (ts0Var == null || (measurable = (Measurable) ts0Var.invoke(Boolean.TRUE, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                    measurable = this.seeMoreMeasurable;
                }
                intIntPair = this.seeMoreSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.seeMorePlaceable;
                    placeable2 = placeable;
                    measurable2 = measurable;
                }
                measurable2 = measurable;
                placeable2 = null;
            } else {
                if (i < this.minLinesToShowCollapse - 1 || i2 < this.minCrossAxisSizeToShowCollapse) {
                    measurable = null;
                } else {
                    ts0 ts0Var2 = this.getOverflowMeasurable;
                    if (ts0Var2 == null || (measurable = (Measurable) ts0Var2.invoke(Boolean.FALSE, Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                        measurable = this.collapseMeasurable;
                    }
                }
                intIntPair = this.collapseSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.collapsePlaceable;
                    placeable2 = placeable;
                    measurable2 = measurable;
                }
                measurable2 = measurable;
                placeable2 = null;
            }
            if (measurable2 != null) {
                intIntPair.getClass();
                return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable2, placeable2, intIntPair.m34unboximpl(), false, 8, null);
            }
        }
        return null;
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout, reason: not valid java name */
    public final IntIntPair m918ellipsisSizeF35zmw$foundation_layout(boolean z, int i, int i2) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    hu2.e();
                    return null;
                }
                if (z) {
                    return this.seeMoreSize;
                }
                if (i + 1 < this.minLinesToShowCollapse || i2 < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (z) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int getItemCount$foundation_layout() {
        return this.itemCount;
    }

    public final int getItemShown$foundation_layout() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        hu2.h(this.shownItemLazyErrorMessage);
        return 0;
    }

    public final String getShownItemLazyErrorMessage$foundation_layout() {
        return this.shownItemLazyErrorMessage;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.minLinesToShowCollapse) * 31) + this.minCrossAxisSizeToShowCollapse;
    }

    public final void setItemCount$foundation_layout(int i) {
        this.itemCount = i;
    }

    public final void setItemShown$foundation_layout(int i) {
        this.itemShown = i;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m919setOverflowMeasurableshBUhpc$foundation_layout(final FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long m1038toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m1038toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m1027copyyUG9Ft0$default(OrientationIndependentConstraints.m1025constructorimpl(j, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            final int i = 0;
            FlowLayoutKt.m916measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, m1038toBoxConstraintsOenEA2s, new ps0(this) { // from class: wq0
                public final /* synthetic */ FlowLayoutOverflowState b;

                {
                    this.b = this;
                }

                @Override // defpackage.ps0
                public final Object invoke(Object obj) {
                    vy2 overflowMeasurables__hBUhpc$lambda$2$0;
                    vy2 overflowMeasurables__hBUhpc$lambda$3$0;
                    int i2 = i;
                    FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                    FlowLayoutOverflowState flowLayoutOverflowState = this.b;
                    Placeable placeable = (Placeable) obj;
                    switch (i2) {
                        case 0:
                            overflowMeasurables__hBUhpc$lambda$2$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$2$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$2$0;
                        default:
                            overflowMeasurables__hBUhpc$lambda$3$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$3$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$3$0;
                    }
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            final int i2 = 1;
            FlowLayoutKt.m916measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, m1038toBoxConstraintsOenEA2s, new ps0(this) { // from class: wq0
                public final /* synthetic */ FlowLayoutOverflowState b;

                {
                    this.b = this;
                }

                @Override // defpackage.ps0
                public final Object invoke(Object obj) {
                    vy2 overflowMeasurables__hBUhpc$lambda$2$0;
                    vy2 overflowMeasurables__hBUhpc$lambda$3$0;
                    int i22 = i2;
                    FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                    FlowLayoutOverflowState flowLayoutOverflowState = this.b;
                    Placeable placeable = (Placeable) obj;
                    switch (i22) {
                        case 0:
                            overflowMeasurables__hBUhpc$lambda$2$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$2$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$2$0;
                        default:
                            overflowMeasurables__hBUhpc$lambda$3$0 = FlowLayoutOverflowState.setOverflowMeasurables__hBUhpc$lambda$3$0(flowLayoutOverflowState, flowLineMeasurePolicy2, placeable);
                            return overflowMeasurables__hBUhpc$lambda$3$0;
                    }
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m920setOverflowMeasurableshBUhpc$foundation_layout(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z, long j) {
        long m1025constructorimpl = OrientationIndependentConstraints.m1025constructorimpl(j, z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int mainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z, Constraints.m8013getMaxHeightimpl(m1025constructorimpl));
            this.seeMoreSize = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(mainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z, mainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int mainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z, Constraints.m8013getMaxHeightimpl(m1025constructorimpl));
            this.collapseSize = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(mainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z, mainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout, reason: not valid java name */
    public final void m921setOverflowMeasurablesVKLhPVY$foundation_layout(FlowLineMeasurePolicy flowLineMeasurePolicy, long j, ts0 ts0Var) {
        this.itemShown = 0;
        this.getOverflowMeasurable = ts0Var;
        m919setOverflowMeasurableshBUhpc$foundation_layout(flowLineMeasurePolicy, (Measurable) ts0Var.invoke(Boolean.TRUE, 0), (Measurable) ts0Var.invoke(Boolean.FALSE, 0), j);
    }

    public String toString() {
        FlowLayoutOverflow.OverflowType overflowType = this.type;
        int i = this.minLinesToShowCollapse;
        int i2 = this.minCrossAxisSizeToShowCollapse;
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(overflowType);
        sb.append(", minLinesToShowCollapse=");
        sb.append(i);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return lt.A(sb, ")", i2);
    }
}
