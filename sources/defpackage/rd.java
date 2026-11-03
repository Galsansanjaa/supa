package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class rd extends w0 {
    public static final Object[] n = new Object[0];
    public int a;
    public Object[] b;
    public int m;

    public rd() {
        this.b = n;
    }

    public rd(int i) {
        this.b = new Object[16];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        e(size() + 1);
        int n2 = n(this.a + i);
        if (i < ((size() + 1) >> 1)) {
            int length = n2 == 0 ? this.b.length - 1 : n2 - 1;
            int i2 = this.a;
            int length2 = i2 == 0 ? this.b.length - 1 : i2 - 1;
            Object[] objArr = this.b;
            if (length >= i2) {
                objArr[length2] = objArr[i2];
                wd.k0(objArr, objArr, i2, i2 + 1, length + 1);
            } else {
                wd.k0(objArr, objArr, i2 - 1, i2, objArr.length);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                wd.k0(objArr2, objArr2, 0, 1, length + 1);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int n3 = n(size() + this.a);
            Object[] objArr3 = this.b;
            if (n2 < n3) {
                wd.k0(objArr3, objArr3, n2 + 1, n2, n3);
            } else {
                wd.k0(objArr3, objArr3, 1, 0, n3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                wd.k0(objArr4, objArr4, n2 + 1, n2, objArr4.length - 1);
            }
            this.b[n2] = obj;
        }
        this.m = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.c(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        o();
        e(collection.size() + size());
        int n2 = n(size() + this.a);
        int n3 = n(this.a + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = n3 + size2;
            Object[] objArr = this.b;
            if (n3 < n2) {
                int i3 = size2 + n2;
                if (i3 <= objArr.length) {
                    wd.k0(objArr, objArr, i2, n3, n2);
                } else if (i2 >= objArr.length) {
                    wd.k0(objArr, objArr, i2 - objArr.length, n3, n2);
                } else {
                    int length = n2 - (i3 - objArr.length);
                    wd.k0(objArr, objArr, 0, length, n2);
                    Object[] objArr2 = this.b;
                    wd.k0(objArr2, objArr2, i2, n3, length);
                }
            } else {
                wd.k0(objArr, objArr, size2, 0, n2);
                Object[] objArr3 = this.b;
                if (i2 >= objArr3.length) {
                    wd.k0(objArr3, objArr3, i2 - objArr3.length, n3, objArr3.length);
                } else {
                    wd.k0(objArr3, objArr3, 0, objArr3.length - size2, objArr3.length);
                    Object[] objArr4 = this.b;
                    wd.k0(objArr4, objArr4, i2, n3, objArr4.length - size2);
                }
            }
            c(n3, collection);
            return true;
        }
        int i4 = this.a;
        int i5 = i4 - size2;
        Object[] objArr5 = this.b;
        if (n3 < i4) {
            wd.k0(objArr5, objArr5, i5, i4, objArr5.length);
            Object[] objArr6 = this.b;
            if (size2 >= n3) {
                wd.k0(objArr6, objArr6, objArr6.length - size2, 0, n3);
            } else {
                wd.k0(objArr6, objArr6, objArr6.length - size2, 0, size2);
                Object[] objArr7 = this.b;
                wd.k0(objArr7, objArr7, 0, size2, n3);
            }
        } else if (i5 >= 0) {
            wd.k0(objArr5, objArr5, i5, i4, n3);
        } else {
            i5 += objArr5.length;
            int i6 = n3 - i4;
            int length2 = objArr5.length - i5;
            if (length2 >= i6) {
                wd.k0(objArr5, objArr5, i5, i4, n3);
            } else {
                wd.k0(objArr5, objArr5, i5, i4, i4 + length2);
                Object[] objArr8 = this.b;
                wd.k0(objArr8, objArr8, 0, this.a + length2, n3);
            }
        }
        this.a = i5;
        c(k(n3 - size2), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        o();
        e(collection.size() + size());
        c(n(size() + this.a), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        e(size() + 1);
        int i = this.a;
        if (i == 0) {
            i = this.b.length;
        }
        int i2 = i - 1;
        this.a = i2;
        this.b[i2] = obj;
        this.m = size() + 1;
    }

    public final void addLast(Object obj) {
        o();
        e(size() + 1);
        this.b[n(size() + this.a)] = obj;
        this.m = size() + 1;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.m = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.a, n(size() + this.a));
        }
        this.a = 0;
        this.m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            hu2.h("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == n) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        n0 n0Var = r0.Companion;
        int length = objArr.length;
        n0Var.getClass();
        Object[] objArr2 = new Object[n0.e(length, i)];
        Object[] objArr3 = this.b;
        wd.k0(objArr3, objArr2, 0, this.a, objArr3.length);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        wd.k0(objArr4, objArr2, length2 - i2, 0, i2);
        this.a = 0;
        this.b = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        hu2.n("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.b(i, size);
        return this.b[n(this.a + i)];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.m;
    }

    public final int i(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int n2 = n(size() + this.a);
        int i2 = this.a;
        if (i2 < n2) {
            while (i2 < n2) {
                if (jh2.k(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < n2) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < n2; i3++) {
                    if (jh2.k(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (jh2.k(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.b[n((size() - 1) + this.a)];
    }

    public final int k(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            hu2.n("ArrayDeque is empty.");
            return null;
        }
        return this.b[n((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int n2 = n(size() + this.a);
        int i2 = this.a;
        if (i2 < n2) {
            length = n2 - 1;
            if (i2 <= length) {
                while (!jh2.k(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > n2) {
            while (true) {
                n2--;
                Object[] objArr = this.b;
                if (-1 >= n2) {
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!jh2.k(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else if (jh2.k(obj, objArr[n2])) {
                    length = n2 + this.b.length;
                    i = this.a;
                    break;
                }
            }
        }
        return -1;
    }

    public final void m(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.b, 0, i2, (Object) null);
        }
    }

    public final int n(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int n2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int n3 = n(size() + this.a);
            int i = this.a;
            if (i < n3) {
                n2 = i;
                while (true) {
                    objArr = this.b;
                    if (i >= n3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[n2] = obj;
                        n2++;
                    }
                    i++;
                }
                Arrays.fill(objArr, n2, n3, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                n2 = n(i2);
                for (int i3 = 0; i3 < n3; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[n2] = obj3;
                        n2 = i(n2);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.m = k(n2 - this.a);
            }
        }
        return z;
    }

    @Override // defpackage.w0
    public final Object removeAt(int i) {
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.b(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int n2 = n(this.a + i);
        Object obj = this.b[n2];
        int size2 = size() >> 1;
        int i2 = this.a;
        if (i < size2) {
            Object[] objArr = this.b;
            if (n2 >= i2) {
                wd.k0(objArr, objArr, i2 + 1, i2, n2);
            } else {
                wd.k0(objArr, objArr, 1, 0, n2);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.a;
                wd.k0(objArr2, objArr2, i3 + 1, i3, objArr2.length - 1);
            }
            Object[] objArr3 = this.b;
            int i4 = this.a;
            objArr3[i4] = null;
            this.a = i(i4);
        } else {
            int n3 = n((size() - 1) + i2);
            Object[] objArr4 = this.b;
            if (n2 <= n3) {
                wd.k0(objArr4, objArr4, n2, n2 + 1, n3 + 1);
            } else {
                wd.k0(objArr4, objArr4, n2, n2 + 1, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                wd.k0(objArr5, objArr5, 0, 1, n3 + 1);
            }
            this.b[n3] = null;
        }
        this.m = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            hu2.n("ArrayDeque is empty.");
            return null;
        }
        o();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = i(i);
        this.m = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            hu2.n("ArrayDeque is empty.");
            return null;
        }
        o();
        int n2 = n((size() - 1) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[n2];
        objArr[n2] = null;
        this.m = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        o();
        int size2 = size() - i2;
        int i4 = this.a;
        int i5 = this.a;
        if (i < size2) {
            int n2 = n((i - 1) + i4);
            int n3 = n((i2 - 1) + i5);
            while (i > 0) {
                int i6 = n2 + 1;
                int min = Math.min(i, Math.min(i6, n3 + 1));
                Object[] objArr = this.b;
                int i7 = n3 - min;
                int i8 = n2 - min;
                wd.k0(objArr, objArr, i7 + 1, i8 + 1, i6);
                n2 = k(i8);
                n3 = k(i7);
                i -= min;
            }
            int n4 = n(this.a + i3);
            m(this.a, n4);
            this.a = n4;
        } else {
            int n5 = n(i4 + i2);
            int n6 = n(i5 + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(size3, Math.min(objArr2.length - n5, objArr2.length - n6));
                Object[] objArr3 = this.b;
                int i9 = n5 + i2;
                wd.k0(objArr3, objArr3, n6, n5, i9);
                n5 = n(i9);
                n6 = n(n6 + i2);
            }
            int n7 = n(size() + this.a);
            m(k(n7 - i3), n7);
        }
        this.m = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int n2;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int n3 = n(size() + this.a);
            int i = this.a;
            if (i < n3) {
                n2 = i;
                while (true) {
                    objArr = this.b;
                    if (i >= n3) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[n2] = obj;
                        n2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, n2, n3, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                n2 = n(i2);
                for (int i3 = 0; i3 < n3; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[n2] = obj3;
                        n2 = i(n2);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.m = k(n2 - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        n0 n0Var = r0.Companion;
        int size = size();
        n0Var.getClass();
        n0.b(i, size);
        int n2 = n(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[n2];
        objArr[n2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        Object[] objArr2 = objArr;
        int n2 = n(size() + this.a);
        int i = this.a;
        if (i < n2) {
            wd.o0(this.b, objArr2, 0, i, n2, 2);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.b;
            wd.k0(objArr3, objArr2, 0, this.a, objArr3.length);
            Object[] objArr4 = this.b;
            wd.k0(objArr4, objArr2, objArr4.length - this.a, 0, n2);
        }
        int size = size();
        if (size < objArr2.length) {
            objArr2[size] = null;
        }
        return objArr2;
    }
}
