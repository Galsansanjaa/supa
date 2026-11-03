package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class lw1 implements Iterator, fa1 {
    public final tu2[] a;
    public int b;
    public boolean m;

    public lw1(su2 su2Var, tu2[] tu2VarArr) {
        su2Var.getClass();
        this.a = tu2VarArr;
        this.m = true;
        tu2 tu2Var = tu2VarArr[0];
        Object[] objArr = su2Var.d;
        int bitCount = Integer.bitCount(su2Var.a) * 2;
        tu2Var.getClass();
        objArr.getClass();
        tu2Var.a = objArr;
        tu2Var.b = bitCount;
        tu2Var.m = 0;
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        tu2[] tu2VarArr = this.a;
        tu2 tu2Var = tu2VarArr[i];
        if (tu2Var.m < tu2Var.b) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                tu2 tu2Var2 = tu2VarArr[i];
                int i2 = tu2Var2.m;
                Object[] objArr = tu2Var2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    tu2Var2.m = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                tu2 tu2Var3 = tu2VarArr[i - 1];
                int i3 = tu2Var3.m;
                int length2 = tu2Var3.a.length;
                tu2Var3.m = i3 + 1;
            }
            tu2 tu2Var4 = tu2VarArr[i];
            Object[] objArr2 = su2.e.d;
            tu2Var4.getClass();
            objArr2.getClass();
            tu2Var4.a = objArr2;
            tu2Var4.b = 0;
            tu2Var4.m = 0;
            i--;
        }
        this.m = false;
    }

    public final int b(int i) {
        tu2[] tu2VarArr = this.a;
        tu2 tu2Var = tu2VarArr[i];
        int i2 = tu2Var.m;
        if (i2 < tu2Var.b) {
            return i;
        }
        Object[] objArr = tu2Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        su2 su2Var = (su2) obj;
        if (i == 6) {
            tu2 tu2Var2 = tu2VarArr[i + 1];
            Object[] objArr2 = su2Var.d;
            int length2 = objArr2.length;
            tu2Var2.getClass();
            tu2Var2.a = objArr2;
            tu2Var2.b = length2;
            tu2Var2.m = 0;
        } else {
            tu2 tu2Var3 = tu2VarArr[i + 1];
            Object[] objArr3 = su2Var.d;
            int bitCount = Integer.bitCount(su2Var.a) * 2;
            tu2Var3.getClass();
            objArr3.getClass();
            tu2Var3.a = objArr3;
            tu2Var3.b = bitCount;
            tu2Var3.m = 0;
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.m) {
            f31.b();
            return null;
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
