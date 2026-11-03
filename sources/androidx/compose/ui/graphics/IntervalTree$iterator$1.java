package androidx.compose.ui.graphics;

import defpackage.fa1;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntervalTree$iterator$1<T> implements Iterator<Interval<T>>, fa1 {
    private IntervalTree<T>.Node next;
    final /* synthetic */ IntervalTree<T> this$0;

    public IntervalTree$iterator$1(IntervalTree<T> intervalTree) {
        this.this$0 = intervalTree;
        this.next = intervalTree.root.lowestNode();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != this.this$0.terminator;
    }

    @Override // java.util.Iterator
    public Interval<T> next() {
        IntervalTree<T>.Node node = this.next;
        this.next = node.next();
        return node;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
