package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.ea0;
import defpackage.f31;
import defpackage.hu2;
import defpackage.i61;
import defpackage.lt;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class DoubleList {
    public int _size;
    public double[] content;

    private DoubleList(int i) {
        this.content = i == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i];
    }

    public /* synthetic */ DoubleList(int i, sb0 sb0Var) {
        this(i);
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: binarySearch");
            return 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = doubleList._size;
        }
        return doubleList.binarySearch(i, i2, i3);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ps0 ps0Var, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = doubleList.content;
        int i3 = doubleList._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            double d = dArr[i4];
            if (i4 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i4++;
        }
        return sb.toString();
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) ps0Var.invoke(Double.valueOf(dArr[i2]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public final int binarySearch(int i, int i2) {
        return binarySearch$default(this, i, i2, 0, 4, null);
    }

    public final int binarySearch(int i, int i2, int i3) {
        if (i2 < 0 || i2 >= i3 || i3 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            double d = this.content[i5];
            double d2 = i;
            if (d < d2) {
                i2 = i5 + 1;
            } else {
                if (d <= d2) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean contains(double d) {
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (dArr[i2] == d) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(DoubleList doubleList) {
        doubleList.getClass();
        i61 M = ea0.M(0, doubleList._size);
        int i = M.a;
        int i2 = M.b;
        if (i > i2) {
            return true;
        }
        while (contains(doubleList.get(i))) {
            if (i == i2) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final int count(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) ps0Var.invoke(Double.valueOf(dArr[i3]))).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final double elementAt(int i) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i];
    }

    public final double elementAtOrElse(int i, ps0 ps0Var) {
        ps0Var.getClass();
        return (i < 0 || i >= this._size) ? ((Number) ps0Var.invoke(Integer.valueOf(i))).doubleValue() : this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) obj;
            int i = doubleList._size;
            int i2 = this._size;
            if (i == i2) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                i61 M = ea0.M(0, i2);
                int i3 = M.a;
                int i4 = M.b;
                if (i3 > i4) {
                    return true;
                }
                while (dArr[i3] == dArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[0];
    }

    public final double first(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            if (((Boolean) ps0Var.invoke(Double.valueOf(d))).booleanValue()) {
                return d;
            }
        }
        hu2.n("DoubleList contains no element matching the predicate.");
        return 0.0d;
    }

    public final <R> R fold(R r, ts0 ts0Var) {
        ts0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) ts0Var.invoke(r, Double.valueOf(dArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, us0 us0Var) {
        us0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            R r2 = r;
            r = (R) us0Var.invoke(Integer.valueOf(i2), r2, Double.valueOf(dArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, ts0 ts0Var) {
        ts0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) ts0Var.invoke(Double.valueOf(dArr[i]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, us0 us0Var) {
        us0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) us0Var.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]), r);
        }
    }

    public final void forEach(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ps0Var.invoke(Double.valueOf(dArr[i2]));
        }
    }

    public final void forEachIndexed(ts0 ts0Var) {
        ts0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ts0Var.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]));
        }
    }

    public final void forEachReversed(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                ps0Var.invoke(Double.valueOf(dArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(ts0 ts0Var) {
        ts0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                ts0Var.invoke(Integer.valueOf(i), Double.valueOf(dArr[i]));
            }
        }
    }

    public final double get(int i) {
        if (i < 0 || i >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i];
    }

    public final i61 getIndices() {
        return ea0.M(0, this._size);
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long doubleToLongBits = Double.doubleToLongBits(dArr[i3]);
            i2 += ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        }
        return i2;
    }

    public final int indexOf(double d) {
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (d == dArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) ps0Var.invoke(Double.valueOf(dArr[i2]))).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) ps0Var.invoke(Double.valueOf(dArr[i]))).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence) {
        charSequence.getClass();
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        lt.K(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        lt.K(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        StringBuilder C = lt.C(charSequence, charSequence2, charSequence3, charSequence4, charSequence2);
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                C.append(charSequence3);
                break;
            }
            double d = dArr[i3];
            if (i3 == i) {
                C.append(charSequence4);
                break;
            }
            if (i3 != 0) {
                C.append(charSequence);
            }
            C.append(d);
            i3++;
        }
        return C.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ps0 ps0Var) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(charSequence3);
                break;
            }
            double d = dArr[i3];
            if (i3 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i3 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i3++;
        }
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, ps0 ps0Var) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(charSequence3);
                break;
            }
            double d = dArr[i3];
            if (i3 == i) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i3++;
        }
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ps0 ps0Var) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append(charSequence3);
                break;
            }
            double d = dArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i2++;
        }
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, ps0 ps0Var) {
        charSequence.getClass();
        charSequence2.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "");
                break;
            }
            double d = dArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i2++;
        }
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, ps0 ps0Var) {
        charSequence.getClass();
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder("");
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "");
                break;
            }
            double d = dArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i2++;
        }
        return sb.toString();
    }

    public final String joinToString(ps0 ps0Var) {
        ps0Var.getClass();
        StringBuilder sb = new StringBuilder("");
        double[] dArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "");
                break;
            }
            double d = dArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) ps0Var.invoke(Double.valueOf(d)));
            i2++;
        }
        return sb.toString();
    }

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final double last(ps0 ps0Var) {
        double d;
        ps0Var.getClass();
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                hu2.n("DoubleList contains no element matching the predicate.");
                return 0.0d;
            }
            d = dArr[i];
        } while (!((Boolean) ps0Var.invoke(Double.valueOf(d))).booleanValue());
        return d;
    }

    public final int lastIndexOf(double d) {
        double[] dArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (dArr[i] != d);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(ps0 ps0Var) {
        ps0Var.getClass();
        double[] dArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) ps0Var.invoke(Double.valueOf(dArr[i]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }
}
