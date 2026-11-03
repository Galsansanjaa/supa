package androidx.core.view;

import defpackage.fa1;
import defpackage.kw;
import defpackage.ps0;
import defpackage.pw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TreeIterator<T> implements Iterator<T>, fa1 {
    private final ps0 getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    public TreeIterator(Iterator<? extends T> it, ps0 ps0Var) {
        this.getChildIterator = ps0Var;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t) {
        Iterator<? extends T> it = (Iterator) this.getChildIterator.invoke(t);
        if (it != null && it.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = it;
        } else {
            while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
                this.iterator = (Iterator) kw.x0(this.stack);
                pw.j0(this.stack);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
