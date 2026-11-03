package androidx.collection;

import defpackage.ma1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, ma1 {
    private final MutableOrderedScatterSet<E> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(MutableOrderedScatterSet<E> mutableOrderedScatterSet) {
        super(mutableOrderedScatterSet);
        mutableOrderedScatterSet.getClass();
        this.parent = mutableOrderedScatterSet;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean add(E e) {
        return this.parent.add(e);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        return this.parent.addAll(collection);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new MutableOrderedSetWrapper$iterator$1(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.parent.removeAll(collection);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.parent.retainAll(collection);
    }
}
