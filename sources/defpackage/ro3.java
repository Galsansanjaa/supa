package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ro3 implements Iterator {
    public final /* synthetic */ int a = 1;
    public int b = 0;
    public final int m;
    public final /* synthetic */ Object n;

    public ro3(g14 g14Var) {
        this.n = g14Var;
        this.m = g14Var.f();
    }

    public ro3(vo3 vo3Var) {
        this.n = vo3Var;
        this.m = vo3Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.m;
            default:
                return this.b < this.m;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.n;
        int i2 = this.m;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 < i2) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((vo3) obj).c(i3));
                }
                f31.b();
                return null;
            default:
                int i4 = this.b;
                if (i4 < i2) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((g14) obj).d(i4));
                }
                f31.b();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
