package androidx.compose.runtime;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntStack {
    public static final int $stable = 8;
    public int[] slots = new int[10];
    public int tos;

    private final int[] resize() {
        int[] iArr = this.slots;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        this.slots = copyOf;
        return copyOf;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final int indexOf(int i) {
        int[] iArr = this.slots;
        int min = Math.min(iArr.length, this.tos);
        for (int i2 = 0; i2 < min; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek(int i) {
        return this.slots[i];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peekOr(int i) {
        int i2 = this.tos - 1;
        return i2 >= 0 ? this.slots[i2] : i;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int popOr(int i) {
        int i2 = this.tos;
        if (i2 <= 0) {
            return i;
        }
        int[] iArr = this.slots;
        int i3 = i2 - 1;
        this.tos = i3;
        return iArr[i3];
    }

    public final void push(int i) {
        int[] iArr = this.slots;
        if (this.tos >= iArr.length) {
            iArr = resize();
        }
        int i2 = this.tos;
        this.tos = i2 + 1;
        iArr[i2] = i;
    }
}
