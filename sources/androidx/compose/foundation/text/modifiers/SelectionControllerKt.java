package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.a10;
import defpackage.e50;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    public static final Modifier makeDefaultSelectionModifier(SelectionRegistrar selectionRegistrar, long j, os0 os0Var) {
        return ComposeFoundationFlags.isSelectionAutoScrollEnabled ? new SelectionModifierElement(selectionRegistrar, j, os0Var) : makeLegacySelectionModifier(selectionRegistrar, j, os0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeLegacySelectionModifier$longPressDragObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeLegacySelectionModifier$mouseSelectionObserver$1] */
    public static final Modifier makeLegacySelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final os0 os0Var) {
        final ?? r0 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeLegacySelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;
            private SelectionAdjustment selectionAdjustmentMode;

            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m5106getZeroF1C5BW0();
                this.dragTotalDistance = companion.m5106getZeroF1C5BW0();
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final SelectionAdjustment getSelectionAdjustmentMode() {
                return this.selectionAdjustmentMode;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1651onDownk4lQ0M(long j2) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1652onDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        long m5095plusMKHz9U = Offset.m5095plusMKHz9U(this.dragTotalDistance, j2);
                        this.dragTotalDistance = m5095plusMKHz9U;
                        long m5095plusMKHz9U2 = Offset.m5095plusMKHz9U(this.lastPosition, m5095plusMKHz9U);
                        if (selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, m5095plusMKHz9U2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                            this.lastPosition = m5095plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m5106getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo1653onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo2166notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j2, this.selectionAdjustmentMode, true);
                    this.lastPosition = j2;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = Offset.Companion.m5106getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            public final void setDragTotalDistance(long j2) {
                this.dragTotalDistance = j2;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            public final void setSelectionAdjustmentMode(SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
            }
        };
        final ?? r1 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeLegacySelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m5106getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo2024onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j2;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo2025onExtendk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j2;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo2026onExtendDragk4lQ0M(long j2) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.mo2165notifySelectionUpdatenjBpvok(layoutCoordinates, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j2;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo2027onStart9KIMszo(long j2, SelectionAdjustment selectionAdjustment, int i) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) os0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo2166notifySelectionUpdateStartubNVwUQ(layoutCoordinates, j2, selectionAdjustment, false);
                this.lastPosition = j2;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }
        };
        return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r1, (Object) r0, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeLegacySelectionModifier$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, a10 a10Var) {
                Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, SelectionControllerKt$makeLegacySelectionModifier$mouseSelectionObserver$1.this, r0, a10Var);
                return awaitSelectionGestures == e50.a ? awaitSelectionGestures : vy2.a;
            }
        });
    }
}
