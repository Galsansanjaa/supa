package androidx.compose.runtime.composer.linkbuffer;

import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SlotMoveManager {
    public static final int $stable = 8;
    private Object[] destination;
    private final Object[] source;
    private int pendingMoveOffset = -1;
    private int pendingMoveStart = -1;
    private int pendingMoveEnd = -1;
    private int highest = -1;

    public SlotMoveManager(Object[] objArr, Object[] objArr2) {
        this.source = objArr;
        this.destination = objArr2;
    }

    private final void flush() {
        int i = this.pendingMoveOffset;
        if (i >= 0) {
            Object[] objArr = this.source;
            wd.k0(objArr, this.destination, i, this.pendingMoveStart, this.pendingMoveEnd);
            if (objArr == this.destination) {
                Arrays.fill(objArr, this.pendingMoveStart, this.pendingMoveEnd, SlotTableAddresSpaceKt.access$getUnallocated$p());
            }
            int i2 = (this.pendingMoveEnd - this.pendingMoveStart) + this.pendingMoveOffset;
            this.pendingMoveOffset = -1;
            this.pendingMoveEnd = -1;
            if (i2 > this.highest) {
                this.highest = i2;
            }
        }
    }

    public final Object[] done() {
        flush();
        int i = this.highest;
        if (i >= 0) {
            Object[] objArr = this.destination;
            if (i < objArr.length) {
                int length = objArr.length;
                if (length == i + 1) {
                    objArr[i] = SlotTableAddresSpaceKt.access$getUnallocated$p();
                } else {
                    wd.r0(SlotTableAddresSpaceKt.access$getUnallocated$p(), objArr, i, length);
                }
            }
        }
        return this.destination;
    }

    public final Object[] getDestination() {
        return this.destination;
    }

    public final Object[] getSource() {
        return this.source;
    }

    public final void move(int i, int i2, int i3) {
        Object[] objArr = this.source;
        Object[] objArr2 = this.destination;
        if (objArr == objArr2) {
            if (i2 != i) {
                int i4 = (i3 - i2) + i + i;
                if (i4 < objArr2.length) {
                    for (int i5 = i; i5 < i4; i5++) {
                        if (objArr2[i5] == SlotTableAddresSpaceKt.access$getUnallocated$p()) {
                        }
                    }
                }
                Object[] objArr3 = this.source;
                this.destination = Arrays.copyOf(objArr3, objArr3.length);
                break;
            } else {
                return;
            }
        }
        if (this.pendingMoveEnd == i2) {
            this.pendingMoveEnd = i3;
            return;
        }
        flush();
        this.pendingMoveOffset = i;
        this.pendingMoveStart = i2;
        this.pendingMoveEnd = i3;
    }

    public final void setDestination(Object[] objArr) {
        this.destination = objArr;
    }
}
