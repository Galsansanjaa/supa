package androidx.compose.runtime.snapshots;

import defpackage.fa1;
import defpackage.rx;
import defpackage.x42;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, fa1 {
    final /* synthetic */ x42 $current;
    final /* synthetic */ SubList<T> this$0;

    public SubList$listIterator$1(x42 x42Var, SubList<T> subList) {
        this.$current = x42Var;
        this.this$0 = subList;
    }

    @Override // java.util.ListIterator
    public Void add(T t) {
        SnapshotStateListKt.modificationError();
        throw new rx(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$current.a < this.this$0.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$current.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i = this.$current.a + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.a = i;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.a + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i = this.$current.a;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.a = i - 1;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new rx(4);
    }

    @Override // java.util.ListIterator
    public Void set(T t) {
        SnapshotStateListKt.modificationError();
        throw new rx(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }
}
