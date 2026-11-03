package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vu2 extends tu2 {
    public final pw1 n;

    public vu2(pw1 pw1Var) {
        this.n = pw1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        this.m = i + 2;
        Object[] objArr = this.a;
        return new fm1(this.n, objArr[i], objArr[i + 1]);
    }
}
