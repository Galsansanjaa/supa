package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionModifierNodeKt {
    public static final TextDragObserver DefaultLongPressDragObserver(final SelectionRegistrar selectionRegistrar, final os0 os0Var, final os0 os0Var2) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionModifierNodeKt$DefaultLongPressDragObserver$1
            private long dragTotalDistance;
            private long lastOffsetInRoot;
            private long lastPosition;
            private SelectionAdjustment selectionAdjustmentMode;

            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m5105getUnspecifiedF1C5BW0();
                this.lastOffsetInRoot = companion.m5105getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m5106getZeroF1C5BW0();
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastOffsetInRoot() {
                return this.lastOffsetInRoot;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final long getSelectableId() {
                return ((Number) os0.this.invoke()).longValue();
            }

            public final SelectionAdjustment getSelectionAdjustmentMode() {
                return this.selectionAdjustmentMode;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, getSelectableId())) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m5105getUnspecifiedF1C5BW0();
                this.lastOffsetInRoot = companion.m5105getUnspecifiedF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1651onDownk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1652onDragk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, getSelectableId())) {
                        this.dragTotalDistance = Offset.m5095plusMKHz9U(this.dragTotalDistance, j);
                        Offset.Companion companion = Offset.Companion;
                        long m5094minusMKHz9U = Offset.m5094minusMKHz9U(Offset.m5095plusMKHz9U(this.lastPosition, this.dragTotalDistance), Offset.m5094minusMKHz9U(layoutCoordinates.mo6715localToRootMKHz9U(companion.m5106getZeroF1C5BW0()), this.lastOffsetInRoot));
                        if (selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, m5094minusMKHz9U, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                            this.lastPosition = m5094minusMKHz9U;
                            this.lastOffsetInRoot = layoutCoordinates.mo6715localToRootMKHz9U(companion.m5106getZeroF1C5BW0());
                            this.dragTotalDistance = companion.m5106getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1653onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo2166notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j, this.selectionAdjustmentMode, true);
                    this.lastPosition = j;
                    this.lastOffsetInRoot = layoutCoordinates.mo6715localToRootMKHz9U(Offset.Companion.m5106getZeroF1C5BW0());
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, getSelectableId())) {
                    this.dragTotalDistance = Offset.Companion.m5106getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, getSelectableId())) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m5105getUnspecifiedF1C5BW0();
                this.lastOffsetInRoot = companion.m5105getUnspecifiedF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            public final void setDragTotalDistance(long j) {
                this.dragTotalDistance = j;
            }

            public final void setLastOffsetInRoot(long j) {
                this.lastOffsetInRoot = j;
            }

            public final void setLastPosition(long j) {
                this.lastPosition = j;
            }

            public final void setSelectionAdjustmentMode(SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
            }
        };
    }

    public static final MouseSelectionObserver DefaultMouseSelectionObserver(final SelectionRegistrar selectionRegistrar, final os0 os0Var, final os0 os0Var2) {
        return new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionModifierNodeKt$DefaultMouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m5106getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo2024onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.isAttached() || !shouldProcessSelectionGesture()) {
                    return false;
                }
                if (!selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo2025onExtendk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j;
                }
                return shouldProcessSelectionGesture();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo2026onExtendDragk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.isAttached() || !shouldProcessSelectionGesture()) {
                    return false;
                }
                if (!selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo2027onStart9KIMszo(long j, SelectionAdjustment selectionAdjustment, int i) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0Var2.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo2166notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j, selectionAdjustment, false);
                this.lastPosition = j;
                return shouldProcessSelectionGesture();
            }

            public final void setLastPosition(long j) {
                this.lastPosition = j;
            }

            public final boolean shouldProcessSelectionGesture() {
                os0 os0Var3 = os0.this;
                if (os0Var3 == null) {
                    return true;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar, ((Number) os0Var3.invoke()).longValue());
            }
        };
    }
}
