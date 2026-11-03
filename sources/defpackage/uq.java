package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uq extends s0 {
    public final /* synthetic */ int m = 1;
    public final Object n;

    public uq(Object obj, int i) {
        super(i, 1);
        this.n = obj;
    }

    public uq(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.n = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    f31.b();
                    return null;
                }
                int i2 = this.a;
                this.a = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.a++;
                    return obj;
                }
                f31.b();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    f31.b();
                    return null;
                }
                int i2 = this.a - 1;
                this.a = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.a--;
                    return obj;
                }
                f31.b();
                return null;
        }
    }
}
