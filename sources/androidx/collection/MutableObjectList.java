package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.ea0;
import defpackage.fa1;
import defpackage.ga1;
import defpackage.i61;
import defpackage.jh2;
import defpackage.kw;
import defpackage.nb0;
import defpackage.nf2;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.vg1;
import defpackage.wa2;
import defpackage.wd;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, fa1 {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i) {
            list.getClass();
            this.list = list;
            this.prevIndex = i - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            list.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.list.set(this.prevIndex, t);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class ObjectListMutableList<T> implements List<T>, ga1 {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> mutableObjectList) {
            mutableObjectList.getClass();
            this.objectList = mutableObjectList;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.objectList.add(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.objectList.add(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            return this.objectList.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            return this.objectList.addAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            return this.objectList.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.get(i);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            return this.objectList.removeAll(collection);
        }

        public T removeAt(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            return this.objectList.retainAll((Collection<? extends T>) collection);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            ObjectListKt.checkIndex(this, i);
            return this.objectList.set(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            ObjectListKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return nb0.Q(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) nb0.R(this, tArr);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SubList<T> implements List<T>, ga1 {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i, int i2) {
            list.getClass();
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.list.add(i + this.start, t);
            this.end++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            this.list.addAll(i + this.start, collection);
            this.end = collection.size() + this.end;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            this.list.addAll(this.end, collection);
            this.end = collection.size() + this.end;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (jh2.k(this.list.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            ObjectListKt.checkIndex(this, i);
            return this.list.get(i + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (jh2.k(this.list.get(i2), obj)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!jh2.k(this.list.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (jh2.k(this.list.get(i2), obj)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public T removeAt(int i) {
            ObjectListKt.checkIndex(this, i);
            this.end--;
            return this.list.remove(i + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            ObjectListKt.checkIndex(this, i);
            return this.list.set(i + this.start, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            ObjectListKt.checkSubIndex(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return nb0.Q(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) nb0.R(this, tArr);
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public MutableObjectList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableObjectList(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    private final void throwIndexOutOfBoundsInclusiveException(int i) {
        StringBuilder w = wa2.w(i, "Index ", " must be in 0..");
        w.append(this._size);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(w.toString());
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableObjectList._size;
        }
        mutableObjectList.trim(i);
    }

    public final void add(int i, E e) {
        if (i < 0 || i > this._size) {
            throwIndexOutOfBoundsInclusiveException(i);
        }
        int i2 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        if (i != i3) {
            wd.k0(objArr2, objArr2, i + 1, i, i3);
        }
        objArr2[i] = e;
        this._size++;
    }

    public final boolean add(E e) {
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        Object[] objArr2 = this.content;
        int i2 = this._size;
        objArr2[i2] = e;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(int i, ObjectList<E> objectList) {
        objectList.getClass();
        if (i < 0 || i > this._size) {
            throwIndexOutOfBoundsInclusiveException(i);
        }
        if (objectList.isEmpty()) {
            return false;
        }
        int i2 = this._size + objectList._size;
        Object[] objArr = this.content;
        if (objArr.length < i2) {
            resizeStorage(i2, objArr);
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        if (i != i3) {
            wd.k0(objArr2, objArr2, objectList._size + i, i, i3);
        }
        wd.k0(objectList.content, objArr2, i, 0, objectList._size);
        this._size += objectList._size;
        return true;
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        if (i < 0 || i > this._size) {
            throwIndexOutOfBoundsInclusiveException(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + this._size;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (i != this._size) {
            wd.k0(objArr2, objArr2, collection.size() + i, i, this._size);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                nb0.O();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        this._size = collection.size() + this._size;
        return true;
    }

    public final boolean addAll(int i, E[] eArr) {
        eArr.getClass();
        if (i < 0 || i > this._size) {
            throwIndexOutOfBoundsInclusiveException(i);
        }
        if (eArr.length == 0) {
            return false;
        }
        int length = this._size + eArr.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        Object[] objArr2 = this.content;
        int i2 = this._size;
        if (i != i2) {
            wd.k0(objArr2, objArr2, eArr.length + i, i, i2);
        }
        wd.o0(eArr, objArr2, i, 0, 0, 12);
        this._size += eArr.length;
        return true;
    }

    public final boolean addAll(ObjectList<E> objectList) {
        objectList.getClass();
        int i = this._size;
        plusAssign((ObjectList) objectList);
        return i != this._size;
    }

    public final boolean addAll(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        int i = this._size;
        plusAssign((ScatterSet) scatterSet);
        return i != this._size;
    }

    public final boolean addAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        int i = this._size;
        plusAssign((Iterable) iterable);
        return i != this._size;
    }

    public final boolean addAll(List<? extends E> list) {
        list.getClass();
        int i = this._size;
        plusAssign((List) list);
        return i != this._size;
    }

    public final boolean addAll(nf2 nf2Var) {
        nf2Var.getClass();
        int i = this._size;
        plusAssign(nf2Var);
        return i != this._size;
    }

    public final boolean addAll(E[] eArr) {
        eArr.getClass();
        int i = this._size;
        plusAssign((Object[]) eArr);
        return i != this._size;
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        wd.r0(null, this.content, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i) {
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> objectList) {
        objectList.getClass();
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void minusAssign(Iterable<? extends E> iterable) {
        iterable.getClass();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(E e) {
        remove(e);
    }

    public final void minusAssign(List<? extends E> list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            remove(list.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(nf2 nf2Var) {
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(E[] eArr) {
        eArr.getClass();
        for (E e : eArr) {
            remove(e);
        }
    }

    public final void plusAssign(ObjectList<E> objectList) {
        objectList.getClass();
        if (objectList.isEmpty()) {
            return;
        }
        int i = this._size + objectList._size;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        wd.k0(objectList.content, this.content, this._size, 0, objectList._size);
        this._size += objectList._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        if (scatterSet.isEmpty()) {
            return;
        }
        int size = scatterSet.getSize() + this._size;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        add(objArr2[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void plusAssign(Iterable<? extends E> iterable) {
        iterable.getClass();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(E e) {
        add(e);
    }

    public final void plusAssign(List<? extends E> list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this._size;
        int size = list.size() + i;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this._size = list.size() + this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(nf2 nf2Var) {
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(E[] eArr) {
        eArr.getClass();
        if (eArr.length == 0) {
            return;
        }
        int length = this._size + eArr.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        wd.o0(eArr, this.content, this._size, 0, 0, 12);
        this._size += eArr.length;
    }

    public final boolean remove(E e) {
        int indexOf = indexOf(e);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(ObjectList<E> objectList) {
        objectList.getClass();
        int i = this._size;
        minusAssign((ObjectList) objectList);
        return i != this._size;
    }

    public final boolean removeAll(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        int i = this._size;
        minusAssign((ScatterSet) scatterSet);
        return i != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        int i = this._size;
        minusAssign((Iterable) iterable);
        return i != this._size;
    }

    public final boolean removeAll(List<? extends E> list) {
        list.getClass();
        int i = this._size;
        minusAssign((List) list);
        return i != this._size;
    }

    public final boolean removeAll(nf2 nf2Var) {
        nf2Var.getClass();
        int i = this._size;
        minusAssign(nf2Var);
        return i != this._size;
    }

    public final boolean removeAll(E[] eArr) {
        eArr.getClass();
        int i = this._size;
        for (E e : eArr) {
            remove(e);
        }
        return i != this._size;
    }

    public final E removeAt(int i) {
        if (i < 0 || i >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
        }
        Object[] objArr = this.content;
        E e = (E) objArr[i];
        int i2 = this._size;
        if (i != i2 - 1) {
            wd.k0(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this._size - 1;
        this._size = i3;
        objArr[i3] = null;
        return e;
    }

    public final void removeIf(ps0 ps0Var) {
        ps0Var.getClass();
        int i = this._size;
        Object[] objArr = this.content;
        int i2 = 0;
        i61 M = ea0.M(0, i);
        int i3 = M.a;
        int i4 = M.b;
        if (i3 <= i4) {
            while (true) {
                objArr[i3 - i2] = objArr[i3];
                if (((Boolean) ps0Var.invoke(objArr[i3])).booleanValue()) {
                    i2++;
                }
                if (i3 == i4) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        wd.r0(null, objArr, i - i2, i);
        this._size -= i2;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            StringBuilder E = vg1.E("Start (", i, ") and end (", i2, ") must be in 0..");
            E.append(this._size);
            RuntimeHelpersKt.throwIndexOutOfBoundsException(E.toString());
        }
        if (i2 < i) {
            RuntimeHelpersKt.throwIllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            int i4 = this._size;
            if (i2 < i4) {
                Object[] objArr = this.content;
                wd.k0(objArr, objArr, i, i2, i4);
            }
            int i5 = this._size;
            int i6 = i5 - (i2 - i);
            wd.r0(null, this.content, i6, i5);
            this._size = i6;
        }
    }

    public final void resizeStorage(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        wd.k0(objArr, objArr2, 0, 0, length);
        this.content = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> objectList) {
        objectList.getClass();
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!objectList.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!kw.l0(iterable, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Collection<? extends E> collection) {
        collection.getClass();
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(defpackage.nf2 r9) {
        /*
            r8 = this;
            r9.getClass()
            int r0 = r8._size
            java.lang.Object[] r1 = r8.content
            int r2 = r0 + (-1)
        L9:
            r3 = 0
            r4 = -1
            if (r4 >= r2) goto L38
            r5 = r1[r2]
            java.util.Iterator r6 = r9.iterator()
        L13:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.next()
            if (r3 < 0) goto L2a
            boolean r7 = defpackage.jh2.k(r5, r7)
            if (r7 == 0) goto L27
            r4 = r3
            goto L2f
        L27:
            int r3 = r3 + 1
            goto L13
        L2a:
            defpackage.nb0.O()
            r8 = 0
            throw r8
        L2f:
            if (r4 < 0) goto L32
            goto L35
        L32:
            r8.removeAt(r2)
        L35:
            int r2 = r2 + (-1)
            goto L9
        L38:
            int r8 = r8._size
            if (r0 == r8) goto L3e
            r8 = 1
            return r8
        L3e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableObjectList.retainAll(nf2):boolean");
    }

    public final boolean retainAll(E[] eArr) {
        eArr.getClass();
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (wd.F0(objArr[i2], eArr) < 0) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final E set(int i, E e) {
        if (i < 0 || i >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i);
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        return e2;
    }

    public final void trim(int i) {
        int max = Math.max(i, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            this.content = Arrays.copyOf(objArr, max);
        }
    }
}
