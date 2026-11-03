package androidx.compose.material3;

import androidx.compose.ui.unit.DpSize;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DragHandleSizes {
    public static final int $stable = 0;
    private final long draggedSize;
    private final long pressedSize;
    private final long size;

    private DragHandleSizes(long j, long j2, long j3) {
        this.size = j;
        this.pressedSize = j2;
        this.draggedSize = j3;
    }

    public /* synthetic */ DragHandleSizes(long j, long j2, long j3, sb0 sb0Var) {
        this(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleSizes)) {
            return false;
        }
        DragHandleSizes dragHandleSizes = (DragHandleSizes) obj;
        return DpSize.m8144equalsimpl0(this.size, dragHandleSizes.size) && DpSize.m8144equalsimpl0(this.pressedSize, dragHandleSizes.pressedSize) && DpSize.m8144equalsimpl0(this.draggedSize, dragHandleSizes.draggedSize);
    }

    /* renamed from: getDraggedSize-MYxV2XQ, reason: not valid java name */
    public final long m2562getDraggedSizeMYxV2XQ() {
        return this.draggedSize;
    }

    /* renamed from: getPressedSize-MYxV2XQ, reason: not valid java name */
    public final long m2563getPressedSizeMYxV2XQ() {
        return this.pressedSize;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m2564getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m8149hashCodeimpl(this.draggedSize) + ((DpSize.m8149hashCodeimpl(this.pressedSize) + (DpSize.m8149hashCodeimpl(this.size) * 31)) * 31);
    }
}
