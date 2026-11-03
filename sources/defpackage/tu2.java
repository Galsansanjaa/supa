package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class tu2 implements Iterator, fa1 {
    public Object[] a = su2.e.d;
    public int b;
    public int m;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
