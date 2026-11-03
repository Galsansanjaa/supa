package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ps0;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int horizontalAxisSize;
    private final int horizontalAxisSpacing;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final int verticalAxisSize;
    private final int verticalAxisSpacing;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        int i8;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        List<Placeable> placeables = getPlaceables();
        int size = placeables.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = placeables.get(i10);
            i9 = Math.max(i9, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i9;
        boolean z3 = this.isVertical;
        if (z3) {
            this.verticalAxisSpacing = i3;
            this.verticalAxisSize = i9;
            i8 = this.crossAxisSize;
            this.horizontalAxisSize = i8;
            this.horizontalAxisSpacing = 0;
        } else {
            this.verticalAxisSpacing = 0;
            i8 = this.crossAxisSize;
            this.verticalAxisSize = i8;
            this.horizontalAxisSize = i9;
            this.horizontalAxisSpacing = i3;
        }
        this.size = z3 ? IntSize.m8211constructorimpl((i8 << 32) | (4294967295L & i9)) : IntSize.m8211constructorimpl((i8 & 4294967295L) | (i9 << 32));
        this.offset = IntOffset.Companion.m8184getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, sb0 sb0Var) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1208copy4Tuh3kE(long j, ps0 ps0Var) {
        return IntOffset.m8167constructorimpl(((this.isVertical ? IntOffset.m8173getXimpl(j) : ((Number) ps0Var.invoke(Integer.valueOf(IntOffset.m8173getXimpl(j)))).intValue()) << 32) | ((this.isVertical ? ((Number) ps0Var.invoke(Integer.valueOf(IntOffset.m8174getYimpl(j)))).intValue() : IntOffset.m8174getYimpl(j)) & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1209getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m8174getYimpl(j) : IntOffset.m8173getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i, boolean z) {
        if (this.nonScrollableItem) {
            return;
        }
        long mo1203getOffsetnOccac = mo1203getOffsetnOccac();
        int m8173getXimpl = this.isVertical ? IntOffset.m8173getXimpl(mo1203getOffsetnOccac) : IntOffset.m8173getXimpl(mo1203getOffsetnOccac) + i;
        boolean z2 = this.isVertical;
        int m8174getYimpl = IntOffset.m8174getYimpl(mo1203getOffsetnOccac);
        if (z2) {
            m8174getYimpl += i;
        }
        this.offset = IntOffset.m8167constructorimpl((m8173getXimpl << 32) | (m8174getYimpl & 4294967295L));
        if (z) {
            int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(this);
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
                if (animation != null) {
                    long m1231getTargetOffsetnOccac = animation.m1231getTargetOffsetnOccac();
                    int m8173getXimpl2 = this.isVertical ? IntOffset.m8173getXimpl(m1231getTargetOffsetnOccac) : Integer.valueOf(IntOffset.m8173getXimpl(m1231getTargetOffsetnOccac) + i).intValue();
                    boolean z3 = this.isVertical;
                    int m8174getYimpl2 = IntOffset.m8174getYimpl(m1231getTargetOffsetnOccac);
                    if (z3) {
                        m8174getYimpl2 = Integer.valueOf(m8174getYimpl2 + i).intValue();
                    }
                    animation.m1234setTargetOffsetgyyYBs(IntOffset.m8167constructorimpl((m8174getYimpl2 & 4294967295L) | (m8173getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo1182getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getHorizontalAxisSize() {
        return this.horizontalAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getHorizontalAxisSpacing() {
        return this.horizontalAxisSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        int horizontalAxisSize;
        int horizontalAxisSpacing;
        if (this.isVertical) {
            horizontalAxisSize = getVerticalAxisSize();
            horizontalAxisSpacing = getVerticalAxisSpacing();
        } else {
            horizontalAxisSize = getHorizontalAxisSize();
            horizontalAxisSpacing = getHorizontalAxisSpacing();
        }
        return horizontalAxisSpacing + horizontalAxisSize;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo1183getOffsetBjo55l4(int i) {
        return mo1203getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo1203getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public List<Placeable> getPlaceables() {
        return this.placeables;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo1204getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getVerticalAxisSize() {
        return this.verticalAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getVerticalAxisSpacing() {
        return this.verticalAxisSpacing;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void makeNonScrollable() {
        this.nonScrollableItem = true;
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z) {
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope2;
        int i = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = LazyLayoutMeasuredItemKt.getPlaceablesCount(this);
        while (i < placeablesCount) {
            Placeable placeable = getPlaceables().get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long mo1203getOffsetnOccac = mo1203getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                if (z) {
                    animation.m1232setLookaheadOffsetgyyYBs(mo1203getOffsetnOccac);
                } else {
                    long m8177plusqkQi6aY = IntOffset.m8177plusqkQi6aY(!IntOffset.m8172equalsimpl0(animation.m1228getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m1235getNotInitializednOccac()) ? animation.m1228getLookaheadOffsetnOccac() : mo1203getOffsetnOccac, animation.m1229getPlacementDeltanOccac());
                    if ((m1209getMainAxisgyyYBs(mo1203getOffsetnOccac) <= mainAxisSize && m1209getMainAxisgyyYBs(m8177plusqkQi6aY) <= mainAxisSize) || (m1209getMainAxisgyyYBs(mo1203getOffsetnOccac) >= i2 && m1209getMainAxisgyyYBs(m8177plusqkQi6aY) >= i2)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo1203getOffsetnOccac = m8177plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                mo1203getOffsetnOccac = IntOffset.m8167constructorimpl(((this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m8174getYimpl(mo1203getOffsetnOccac)) - getMainAxisSize(placeable) : IntOffset.m8174getYimpl(mo1203getOffsetnOccac)) & 4294967295L) | ((this.isVertical ? IntOffset.m8173getXimpl(mo1203getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m8173getXimpl(mo1203getOffsetnOccac)) - getMainAxisSize(placeable)) << 32));
            }
            long m8177plusqkQi6aY2 = IntOffset.m8177plusqkQi6aY(mo1203getOffsetnOccac, this.visualOffset);
            if (!z && animation != null) {
                animation.m1233setPlacementOffsetgyyYBs(m8177plusqkQi6aY2);
            }
            if (!this.isVertical) {
                placementScope2 = placementScope;
                GraphicsLayer graphicsLayer2 = graphicsLayer;
                if (graphicsLayer2 != null) {
                    Placeable.PlacementScope.m6760placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m8177plusqkQi6aY2, graphicsLayer2, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m6759placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m8177plusqkQi6aY2, 0.0f, (ps0) null, 6, (Object) null);
                }
            } else if (graphicsLayer != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6762placeWithLayeraW9wM$default(placementScope2, placeable, m8177plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m6761placeWithLayeraW9wM$default(placementScope2, placeable, m8177plusqkQi6aY2, 0.0f, (ps0) null, 6, (Object) null);
            }
            i++;
            placementScope = placementScope2;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i, int i2, int i3, int i4) {
        position(i, i2, i3, i4, -1, -1);
    }

    public final void position(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.crossAxisSize;
        }
        this.offset = z ? IntOffset.m8167constructorimpl((i & 4294967295L) | (i2 << 32)) : IntOffset.m8167constructorimpl((i2 & 4294967295L) | (i << 32));
        this.row = i5;
        this.column = i6;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    public final void updateMainAxisLayoutSize(int i) {
        this.mainAxisLayoutSize = i;
        this.maxMainAxisOffset = i + this.afterContentPadding;
    }
}
