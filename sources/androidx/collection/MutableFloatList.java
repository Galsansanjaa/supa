package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.n0;
import defpackage.r0;
import defpackage.sb0;
import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableFloatList(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void add(int i, float f) {
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i2 = this._size;
        if (i != i2) {
            wd.i0(fArr, i + 1, fArr, i, i2);
        }
        fArr[i] = f;
        this._size++;
    }

    public final boolean add(float f) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = f;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, FloatList floatList) {
        floatList.getClass();
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i2 = floatList._size;
        if (i2 == 0) {
            return false;
        }
        ensureCapacity(this._size + i2);
        float[] fArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            wd.i0(fArr, floatList._size + i, fArr, i, i3);
        }
        wd.i0(floatList.content, i, fArr, 0, floatList._size);
        this._size += floatList._size;
        return true;
    }

    public final boolean addAll(int i, float[] fArr) {
        fArr.getClass();
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (fArr.length == 0) {
            return false;
        }
        ensureCapacity(this._size + fArr.length);
        float[] fArr2 = this.content;
        int i2 = this._size;
        if (i != i2) {
            wd.i0(fArr2, fArr.length + i, fArr2, i, i2);
        }
        wd.m0(fArr, i, 12, fArr2);
        this._size += fArr.length;
        return true;
    }

    public final boolean addAll(FloatList floatList) {
        floatList.getClass();
        return addAll(this._size, floatList);
    }

    public final boolean addAll(float[] fArr) {
        fArr.getClass();
        return addAll(this._size, fArr);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        float[] fArr = this.content;
        if (fArr.length < i) {
            this.content = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void minusAssign(FloatList floatList) {
        floatList.getClass();
        float[] fArr = floatList.content;
        int i = floatList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public final void minusAssign(float[] fArr) {
        fArr.getClass();
        for (float f : fArr) {
            remove(f);
        }
    }

    public final void plusAssign(float f) {
        add(f);
    }

    public final void plusAssign(FloatList floatList) {
        floatList.getClass();
        addAll(this._size, floatList);
    }

    public final void plusAssign(float[] fArr) {
        fArr.getClass();
        addAll(this._size, fArr);
    }

    public final boolean remove(float f) {
        int indexOf = indexOf(f);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(FloatList floatList) {
        floatList.getClass();
        int i = this._size;
        int i2 = floatList._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(floatList.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean removeAll(float[] fArr) {
        fArr.getClass();
        int i = this._size;
        for (float f : fArr) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(int i) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[i];
        int i2 = this._size;
        if (i != i2 - 1) {
            wd.i0(fArr, i, fArr, i + 1, i2);
        }
        this._size--;
        return f;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i2 < i) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = this._size;
            if (i2 < i4) {
                float[] fArr = this.content;
                wd.i0(fArr, i, fArr, i2, i4);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(FloatList floatList) {
        floatList.getClass();
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!floatList.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(float[] fArr) {
        fArr.getClass();
        int i = this._size;
        float[] fArr2 = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            float f = fArr2[i2];
            int length = fArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (fArr[i3] == f) {
                    i4 = i3;
                    break;
                }
                i3++;
            }
            if (i4 < 0) {
                removeAt(i2);
            }
            i2--;
        }
        return i != this._size;
    }

    public final float set(int i, float f) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        float[] fArr = this.content;
        fArr.getClass();
        Arrays.sort(fArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        float[] fArr = this.content;
        fArr.getClass();
        Arrays.sort(fArr, 0, i);
        n0 n0Var = r0.Companion;
        int length = fArr.length;
        n0Var.getClass();
        n0.d(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            float f = fArr[i4];
            fArr[i4] = fArr[i3];
            fArr[i3] = f;
            i3--;
        }
    }

    public final void trim(int i) {
        int max = Math.max(i, this._size);
        float[] fArr = this.content;
        if (fArr.length > max) {
            this.content = Arrays.copyOf(fArr, max);
        }
    }
}
