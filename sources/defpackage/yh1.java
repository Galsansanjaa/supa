package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yh1 implements Iterator, fa1 {
    public final ai1 a;
    public int b;
    public int m = -1;
    public int n;
    public final /* synthetic */ int o;

    public yh1(ai1 ai1Var, int i) {
        this.o = i;
        this.a = ai1Var;
        this.n = ai1Var.r;
        b();
    }

    public final void a() {
        if (this.a.r == this.n) {
            return;
        }
        v5.g();
    }

    public final void b() {
        while (true) {
            int i = this.b;
            ai1 ai1Var = this.a;
            if (i >= ai1Var.p || ai1Var.m[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.o;
        ai1 ai1Var = this.a;
        switch (i) {
            case 0:
                a();
                int i2 = this.b;
                if (i2 >= ai1Var.p) {
                    f31.b();
                    return null;
                }
                this.b = i2 + 1;
                this.m = i2;
                zh1 zh1Var = new zh1(ai1Var, i2);
                b();
                return zh1Var;
            case 1:
                a();
                int i3 = this.b;
                if (i3 >= ai1Var.p) {
                    f31.b();
                    return null;
                }
                this.b = i3 + 1;
                this.m = i3;
                Object obj = ai1Var.a[i3];
                b();
                return obj;
            default:
                a();
                int i4 = this.b;
                if (i4 >= ai1Var.p) {
                    f31.b();
                    return null;
                }
                this.b = i4 + 1;
                this.m = i4;
                Object[] objArr = ai1Var.b;
                objArr.getClass();
                Object obj2 = objArr[this.m];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.m == -1) {
            hu2.h("Call next() before removing element from the iterator.");
            return;
        }
        ai1 ai1Var = this.a;
        ai1Var.c();
        ai1Var.l(this.m);
        this.m = -1;
        this.n = ai1Var.r;
    }
}
