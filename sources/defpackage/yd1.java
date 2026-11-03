package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yd1 implements Iterator {
    public ae1 a;
    public ae1 b = null;
    public int m;
    public final /* synthetic */ be1 n;
    public final /* synthetic */ int o;

    public yd1(be1 be1Var, int i) {
        this.o = i;
        this.n = be1Var;
        this.a = be1Var.p.n;
        this.m = be1Var.o;
    }

    public final Object a() {
        return b();
    }

    public final ae1 b() {
        ae1 ae1Var = this.a;
        be1 be1Var = this.n;
        if (ae1Var == be1Var.p) {
            f31.b();
            return null;
        }
        if (be1Var.o != this.m) {
            v5.g();
            return null;
        }
        this.a = ae1Var.n;
        this.b = ae1Var;
        return ae1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.n.p;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.o) {
            case 1:
                return b().p;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ae1 ae1Var = this.b;
        if (ae1Var == null) {
            ak1.i();
            return;
        }
        be1 be1Var = this.n;
        be1Var.c(ae1Var, true);
        this.b = null;
        this.m = be1Var.o;
    }
}
