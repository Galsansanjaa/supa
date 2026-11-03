package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class q0 extends r0 implements RandomAccess {
    public final /* synthetic */ int a = 1;
    public int b;
    public int m;
    public final List n;

    public q0(List list) {
        this.n = list;
    }

    public q0(r0 r0Var, int i, int i2) {
        this.n = r0Var;
        this.b = i;
        n0 n0Var = r0.Companion;
        int size = r0Var.size();
        n0Var.getClass();
        n0.d(i, i2, size);
        this.m = i2 - i;
    }

    @Override // defpackage.r0, java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        List list = this.n;
        switch (i2) {
            case 0:
                n0 n0Var = r0.Companion;
                int i3 = this.m;
                n0Var.getClass();
                n0.b(i, i3);
                return ((r0) list).get(this.b + i);
            default:
                n0 n0Var2 = r0.Companion;
                int i4 = this.m;
                n0Var2.getClass();
                n0.b(i, i4);
                return list.get(this.b + i);
        }
    }

    @Override // defpackage.r0, defpackage.o
    public final int getSize() {
        switch (this.a) {
            case 0:
                return this.m;
            default:
                return this.m;
        }
    }

    @Override // defpackage.r0, java.util.List
    public List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                n0 n0Var = r0.Companion;
                int i3 = this.m;
                n0Var.getClass();
                n0.d(i, i2, i3);
                r0 r0Var = (r0) this.n;
                int i4 = this.b;
                return new q0(r0Var, i + i4, i4 + i2);
            default:
                return super.subList(i, i2);
        }
    }
}
