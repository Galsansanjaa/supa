package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import defpackage.hd0;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i);
            this.keys = new int[idealIntArraySize];
            this.values = new Object[idealIntArraySize];
        }
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public void append(int i, E e) {
        int i2 = this.size;
        if (i2 != 0 && i <= this.keys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.garbage && i2 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
            this.keys = Arrays.copyOf(this.keys, idealIntArraySize);
            this.values = Arrays.copyOf(this.values, idealIntArraySize);
        }
        this.keys[i3] = i;
        this.values[i3] = e;
        this.size = i3 + 1;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m36clone() {
        Object clone = super.clone();
        clone.getClass();
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (this.values[i2] == e) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @hd0
    public void delete(int i) {
        remove(i);
    }

    public E get(int i) {
        return (E) SparseArrayCompatKt.commonGet(this, i);
    }

    public E get(int i, E e) {
        return (E) SparseArrayCompatKt.commonGet(this, i, e);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i];
    }

    public void put(int i, E e) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 < this.size && this.values[i2] == SparseArrayCompatKt.DELETED) {
            this.keys[i2] = i;
            this.values[i2] = e;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
            this.keys = Arrays.copyOf(this.keys, idealIntArraySize);
            this.values = Arrays.copyOf(this.values, idealIntArraySize);
        }
        int i4 = this.size;
        if (i4 - i2 != 0) {
            int[] iArr = this.keys;
            int i5 = i2 + 1;
            wd.e0(i5, i2, i4, iArr, iArr);
            Object[] objArr = this.values;
            wd.k0(objArr, objArr, i5, i2, this.size);
        }
        this.keys[i2] = i;
        this.values[i2] = e;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> sparseArrayCompat) {
        sparseArrayCompat.getClass();
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArrayCompat.keyAt(i);
            E valueAt = sparseArrayCompat.valueAt(i);
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i2 = ~binarySearch;
                if (i2 >= this.size || this.values[i2] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i3 = this.size;
                    if (i3 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        this.keys = Arrays.copyOf(this.keys, idealIntArraySize);
                        this.values = Arrays.copyOf(this.values, idealIntArraySize);
                    }
                    int i4 = this.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.keys;
                        int i5 = i2 + 1;
                        wd.e0(i5, i2, i4, iArr, iArr);
                        Object[] objArr = this.values;
                        wd.k0(objArr, objArr, i5, i2, this.size);
                    }
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                    this.size++;
                } else {
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                }
            }
        }
    }

    public E putIfAbsent(int i, E e) {
        E e2 = (E) SparseArrayCompatKt.commonGet(this, i);
        if (e2 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            if (binarySearch >= 0) {
                this.values[binarySearch] = e;
                return e2;
            }
            int i2 = ~binarySearch;
            if (i2 < this.size && this.values[i2] == SparseArrayCompatKt.DELETED) {
                this.keys[i2] = i;
                this.values[i2] = e;
                return e2;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.gc(this);
                i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            }
            int i3 = this.size;
            if (i3 >= this.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                this.keys = Arrays.copyOf(this.keys, idealIntArraySize);
                this.values = Arrays.copyOf(this.values, idealIntArraySize);
            }
            int i4 = this.size;
            if (i4 - i2 != 0) {
                int[] iArr = this.keys;
                int i5 = i2 + 1;
                wd.e0(i5, i2, i4, iArr, iArr);
                Object[] objArr = this.values;
                wd.k0(objArr, objArr, i5, i2, this.size);
            }
            this.keys[i2] = i;
            this.values[i2] = e;
            this.size++;
        }
        return e2;
    }

    public void remove(int i) {
        SparseArrayCompatKt.commonRemove(this, i);
    }

    public boolean remove(int i, Object obj) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0 || !jh2.k(obj, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAt(int i) {
        if (this.values[i] != SparseArrayCompatKt.DELETED) {
            this.values[i] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int min = Math.min(i2, i + i2);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    public E replace(int i, E e) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public boolean replace(int i, E e, E e2) {
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0 || !jh2.k(this.values[indexOfKey], e)) {
            return false;
        }
        this.values[indexOfKey] = e2;
        return true;
    }

    public void setValueAt(int i, E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i] = e;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        Object[] objArr = this.values;
        if (i < objArr.length) {
            return (E) objArr[i];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }
}
