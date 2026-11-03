package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c21 extends r0 implements e21 {
    public final a1 a;
    public final int b;
    public final int m;

    public c21(a1 a1Var, int i, int i2) {
        this.a = a1Var;
        this.b = i;
        kx.n(i, i2, a1Var.size());
        this.m = i2 - i;
    }

    @Override // defpackage.r0, java.util.List
    public final Object get(int i) {
        kx.k(i, this.m);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.r0, defpackage.o
    public final int getSize() {
        return this.m;
    }

    @Override // defpackage.r0, java.util.List
    public final List subList(int i, int i2) {
        kx.n(i, i2, this.m);
        int i3 = this.b;
        return new c21(this.a, i + i3, i3 + i2);
    }
}
