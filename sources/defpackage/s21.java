package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s21 implements Iterator, fa1 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Iterator m;

    public s21(Iterator it) {
        it.getClass();
        this.m = it;
    }

    public s21(so2 so2Var) {
        this.b = so2Var.b;
        this.m = so2Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.m.hasNext();
            default:
                return this.b > 0 && this.m.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return new r21(i, this.m.next());
                }
                nb0.O();
                throw null;
            default:
                int i2 = this.b;
                if (i2 != 0) {
                    this.b = i2 - 1;
                    return this.m.next();
                }
                f31.b();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
