package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.n0;
import defpackage.r0;
import defpackage.sb0;
import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList() {
        this(0, 1, null);
    }

    public MutableDoubleList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableDoubleList(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i);
    }

    public final void add(int i, double d) {
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i2 = this._size;
        if (i != i2) {
            wd.h0(dArr, dArr, i + 1, i, i2);
        }
        dArr[i] = d;
        this._size++;
    }

    public final boolean add(double d) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i = this._size;
        dArr[i] = d;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, DoubleList doubleList) {
        doubleList.getClass();
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i2 = doubleList._size;
        if (i2 == 0) {
            return false;
        }
        ensureCapacity(this._size + i2);
        double[] dArr = this.content;
        int i3 = this._size;
        if (i != i3) {
            wd.h0(dArr, dArr, doubleList._size + i, i, i3);
        }
        wd.h0(doubleList.content, dArr, i, 0, doubleList._size);
        this._size += doubleList._size;
        return true;
    }

    public final boolean addAll(int i, double[] dArr) {
        dArr.getClass();
        if (i < 0 || i > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (dArr.length == 0) {
            return false;
        }
        ensureCapacity(this._size + dArr.length);
        double[] dArr2 = this.content;
        int i2 = this._size;
        if (i != i2) {
            wd.h0(dArr2, dArr2, dArr.length + i, i, i2);
        }
        wd.h0(dArr, dArr2, i, 0, dArr.length);
        this._size += dArr.length;
        return true;
    }

    public final boolean addAll(DoubleList doubleList) {
        doubleList.getClass();
        return addAll(this._size, doubleList);
    }

    public final boolean addAll(double[] dArr) {
        dArr.getClass();
        return addAll(this._size, dArr);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        double[] dArr = this.content;
        if (dArr.length < i) {
            this.content = Arrays.copyOf(dArr, Math.max(i, (dArr.length * 3) / 2));
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(double d) {
        remove(d);
    }

    public final void minusAssign(DoubleList doubleList) {
        doubleList.getClass();
        double[] dArr = doubleList.content;
        int i = doubleList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(dArr[i2]);
        }
    }

    public final void minusAssign(double[] dArr) {
        dArr.getClass();
        for (double d : dArr) {
            remove(d);
        }
    }

    public final void plusAssign(double d) {
        add(d);
    }

    public final void plusAssign(DoubleList doubleList) {
        doubleList.getClass();
        addAll(this._size, doubleList);
    }

    public final void plusAssign(double[] dArr) {
        dArr.getClass();
        addAll(this._size, dArr);
    }

    public final boolean remove(double d) {
        int indexOf = indexOf(d);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(DoubleList doubleList) {
        doubleList.getClass();
        int i = this._size;
        int i2 = doubleList._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(doubleList.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean removeAll(double[] dArr) {
        dArr.getClass();
        int i = this._size;
        for (double d : dArr) {
            remove(d);
        }
        return i != this._size;
    }

    public final double removeAt(int i) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d = dArr[i];
        int i2 = this._size;
        if (i != i2 - 1) {
            wd.h0(dArr, dArr, i, i + 1, i2);
        }
        this._size--;
        return d;
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
                double[] dArr = this.content;
                wd.h0(dArr, dArr, i, i2, i4);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(DoubleList doubleList) {
        doubleList.getClass();
        int i = this._size;
        double[] dArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!doubleList.contains(dArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(double[] dArr) {
        dArr.getClass();
        int i = this._size;
        double[] dArr2 = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            double d = dArr2[i2];
            int length = dArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (dArr[i3] == d) {
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

    public final double set(int i, double d) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        double[] dArr = this.content;
        dArr.getClass();
        Arrays.sort(dArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        double[] dArr = this.content;
        dArr.getClass();
        Arrays.sort(dArr, 0, i);
        n0 n0Var = r0.Companion;
        int length = dArr.length;
        n0Var.getClass();
        n0.d(0, i, length);
        int i2 = i / 2;
        if (i2 == 0) {
            return;
        }
        int i3 = i - 1;
        for (int i4 = 0; i4 < i2; i4++) {
            double d = dArr[i4];
            dArr[i4] = dArr[i3];
            dArr[i3] = d;
            i3--;
        }
    }

    public final void trim(int i) {
        int max = Math.max(i, this._size);
        double[] dArr = this.content;
        if (dArr.length > max) {
            this.content = Arrays.copyOf(dArr, max);
        }
    }
}
