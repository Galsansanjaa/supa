package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class nw1 extends lw1 {
    public final mw1 n;
    public Object o;
    public boolean p;
    public int q;

    public nw1(mw1 mw1Var, tu2[] tu2VarArr) {
        super(mw1Var.m, tu2VarArr);
        this.n = mw1Var;
        this.q = mw1Var.o;
    }

    public final void c(int i, su2 su2Var, Object obj, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2 * 5;
        tu2[] tu2VarArr = this.a;
        if (i5 <= 30) {
            int n = 1 << od4.n(i, i5);
            if (!su2Var.i(n)) {
                int t = su2Var.t(n);
                su2 s = su2Var.s(t);
                tu2 tu2Var = tu2VarArr[i2];
                Object[] objArr = su2Var.d;
                int bitCount = Integer.bitCount(su2Var.a) * 2;
                tu2Var.getClass();
                objArr.getClass();
                tu2Var.a = objArr;
                tu2Var.b = bitCount;
                tu2Var.m = t;
                c(i, s, obj, i2 + 1, i3, z);
                return;
            }
            int f = su2Var.f(n);
            if (n == (z ? 1 << od4.n(i3, i5) : 0) && i2 < (i4 = this.b)) {
                tu2 tu2Var2 = tu2VarArr[i4];
                Object[] objArr2 = su2Var.d;
                Object[] objArr3 = {objArr2[f], objArr2[f + 1]};
                tu2Var2.getClass();
                tu2Var2.a = objArr3;
                tu2Var2.b = 2;
                tu2Var2.m = 0;
                return;
            }
            tu2 tu2Var3 = tu2VarArr[i2];
            Object[] objArr4 = su2Var.d;
            int bitCount2 = Integer.bitCount(su2Var.a) * 2;
            tu2Var3.getClass();
            objArr4.getClass();
            tu2Var3.a = objArr4;
            tu2Var3.b = bitCount2;
            tu2Var3.m = f;
            this.b = i2;
            return;
        }
        tu2 tu2Var4 = tu2VarArr[i2];
        Object[] objArr5 = su2Var.d;
        int length = objArr5.length;
        tu2Var4.getClass();
        tu2Var4.a = objArr5;
        tu2Var4.b = length;
        tu2Var4.m = 0;
        while (true) {
            tu2 tu2Var5 = tu2VarArr[i2];
            if (jh2.k(tu2Var5.a[tu2Var5.m], obj)) {
                this.b = i2;
                return;
            } else {
                tu2VarArr[i2].m += 2;
            }
        }
    }

    @Override // defpackage.lw1, java.util.Iterator
    public final Object next() {
        if (this.n.o != this.q) {
            v5.g();
            return null;
        }
        if (!this.m) {
            f31.b();
            return null;
        }
        tu2 tu2Var = this.a[this.b];
        this.o = tu2Var.a[tu2Var.m];
        this.p = true;
        return super.next();
    }

    @Override // defpackage.lw1, java.util.Iterator
    public final void remove() {
        nw1 nw1Var;
        if (!this.p) {
            ak1.i();
            return;
        }
        boolean z = this.m;
        mw1 mw1Var = this.n;
        if (!z) {
            nw1Var = this;
            ux2.g(mw1Var).remove(nw1Var.o);
        } else {
            if (!z) {
                f31.b();
                return;
            }
            tu2 tu2Var = this.a[this.b];
            Object obj = tu2Var.a[tu2Var.m];
            ux2.g(mw1Var).remove(this.o);
            int hashCode = obj != null ? obj.hashCode() : 0;
            su2 su2Var = mw1Var.m;
            Object obj2 = this.o;
            nw1Var = this;
            nw1Var.c(hashCode, su2Var, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        nw1Var.o = null;
        nw1Var.p = false;
        nw1Var.q = mw1Var.o;
    }
}
