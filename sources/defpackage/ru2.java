package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ru2 extends s0 {
    public int m;
    public Object[] n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ru2(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        this.m = i3;
        Object[] objArr2 = new Object[i3];
        this.n = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.o = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.a & 31;
        Object obj = this.n[this.m - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.m - i2) * 5;
        while (i2 < this.m) {
            Object[] objArr = this.n;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[od4.o(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (od4.o(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.a, ((this.m - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            f31.b();
            return null;
        }
        Object a = a();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.o = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            f31.b();
            return null;
        }
        this.a--;
        if (this.o) {
            this.o = false;
            return a();
        }
        c(31);
        return a();
    }
}
