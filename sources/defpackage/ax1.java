package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ax1 extends s0 {
    public final Object[] m;
    public final ru2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        objArr.getClass();
        objArr2.getClass();
        this.m = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.n = new ru2(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            f31.b();
            return null;
        }
        ru2 ru2Var = this.n;
        if (ru2Var.hasNext()) {
            this.a++;
            return ru2Var.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.m[i - ru2Var.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            f31.b();
            return null;
        }
        int i = this.a;
        ru2 ru2Var = this.n;
        int i2 = ru2Var.b;
        if (i <= i2) {
            this.a = i - 1;
            return ru2Var.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.m[i3 - i2];
    }
}
