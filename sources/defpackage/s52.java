package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s52 extends f21 {
    public static final s52 o = new s52(new Object[0], 0);
    public final transient Object[] m;
    public final transient int n;

    public s52(Object[] objArr, int i) {
        this.m = objArr;
        this.n = i;
    }

    @Override // defpackage.f21, defpackage.y11
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.m;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.y11
    public final Object[] e() {
        return this.m;
    }

    @Override // defpackage.y11
    public final int f() {
        return this.n;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ux2.r(i, this.n);
        Object obj = this.m[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.y11
    public final int i() {
        return 0;
    }

    @Override // defpackage.y11
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
