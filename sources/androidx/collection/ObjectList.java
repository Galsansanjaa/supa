package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.ea0;
import defpackage.f31;
import defpackage.hu2;
import defpackage.i61;
import defpackage.jh2;
import defpackage.lt;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.us0;
import defpackage.wa2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    private ObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public /* synthetic */ ObjectList(int i, sb0 sb0Var) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ps0 ps0Var, int i2, Object obj) {
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
        if ((i2 & 32) != 0) {
            ps0Var = null;
        }
        CharSequence charSequence5 = charSequence4;
        ps0 ps0Var2 = ps0Var;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i, charSequence5, ps0Var2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean any(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) ps0Var.invoke(objArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> objectList) {
        objectList.getClass();
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(List<? extends E> list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(E[] eArr) {
        eArr.getClass();
        for (E e : eArr) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final int count(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) ps0Var.invoke(objArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final E elementAt(int i) {
        if (i < 0 || i >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
        }
        return (E) this.content[i];
    }

    public final E elementAtOrElse(int i, ps0 ps0Var) {
        ps0Var.getClass();
        return (i < 0 || i >= this._size) ? (E) ps0Var.invoke(Integer.valueOf(i)) : (E) this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                i61 M = ea0.M(0, i2);
                int i3 = M.a;
                int i4 = M.b;
                if (i3 > i4) {
                    return true;
                }
                while (jh2.k(objArr[i3], objArr2[i3])) {
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

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E first(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            E e = (E) objArr[i2];
            if (((Boolean) ps0Var.invoke(e)).booleanValue()) {
                return e;
            }
        }
        hu2.n("ObjectList contains no element matching the predicate.");
        return null;
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final E firstOrNull(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            E e = (E) objArr[i2];
            if (((Boolean) ps0Var.invoke(e)).booleanValue()) {
                return e;
            }
        }
        return null;
    }

    public final <R> R fold(R r, ts0 ts0Var) {
        ts0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) ts0Var.invoke(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, us0 us0Var) {
        us0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = (R) us0Var.invoke(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, ts0 ts0Var) {
        ts0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) ts0Var.invoke(objArr[i], r);
        }
    }

    public final <R> R foldRightIndexed(R r, us0 us0Var) {
        us0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = (R) us0Var.invoke(Integer.valueOf(i), objArr[i], r);
        }
    }

    public final void forEach(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ps0Var.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(ts0 ts0Var) {
        ts0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ts0Var.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                ps0Var.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(ts0 ts0Var) {
        ts0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                ts0Var.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(int i) {
        if (i < 0 || i >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
        }
        return (E) this.content[i];
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
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final int indexOf(E e) {
        Object[] objArr = this.content;
        int i = 0;
        if (e == null) {
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this._size;
        while (i < i3) {
            if (e.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) ps0Var.invoke(objArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!((Boolean) ps0Var.invoke(objArr[i])).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence charSequence) {
        charSequence.getClass();
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        lt.K(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        lt.K(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ps0 ps0Var) {
        StringBuilder C = lt.C(charSequence, charSequence2, charSequence3, charSequence4, charSequence2);
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                C.append(charSequence3);
                break;
            }
            Object obj = objArr[i3];
            if (i3 == i) {
                C.append(charSequence4);
                break;
            }
            if (i3 != 0) {
                C.append(charSequence);
            }
            if (ps0Var == null) {
                C.append(obj);
            } else {
                C.append((CharSequence) ps0Var.invoke(obj));
            }
            i3++;
        }
        return C.toString();
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final E last(ps0 ps0Var) {
        E e;
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                hu2.n("ObjectList contains no element matching the predicate.");
                return null;
            }
            e = (E) objArr[i];
        } while (!((Boolean) ps0Var.invoke(e)).booleanValue());
        return e;
    }

    public final int lastIndexOf(E e) {
        Object[] objArr = this.content;
        if (e == null) {
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (e.equals(objArr[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final E lastOrNull(ps0 ps0Var) {
        E e;
        ps0Var.getClass();
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            e = (E) objArr[i];
        } while (!((Boolean) ps0Var.invoke(e)).booleanValue());
        return e;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (((Boolean) ps0Var.invoke(objArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i) {
        StringBuilder w = wa2.w(i, "Index ", " must be in 0..");
        w.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(w.toString());
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new ObjectList$toString$1(this), 25, null);
    }
}
