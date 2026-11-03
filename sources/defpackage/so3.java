package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class so3 extends to3 {
    public final byte[] m;
    public final int n;
    public final int o;

    public so3(byte[] bArr, int i, int i2) {
        vo3.p(i, i + i2, bArr.length);
        this.m = bArr;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.vo3
    public final byte c(int i) {
        return this.m[this.n + i];
    }

    @Override // defpackage.vo3
    public final int d() {
        return this.o;
    }

    @Override // defpackage.vo3
    public final to3 e(int i, int i2) {
        int p = vo3.p(i, i2, this.o);
        if (p == 0) {
            return vo3.b;
        }
        return new so3(this.m, this.n + i, p);
    }

    @Override // defpackage.vo3
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.m, this.n, bArr, 0, i);
    }

    @Override // defpackage.vo3
    public final void i(gp3 gp3Var) {
        gp3Var.c(this.n, this.o, this.m);
    }

    @Override // defpackage.vo3
    public final boolean j(vo3 vo3Var) {
        boolean z = vo3Var instanceof uo3;
        if (!z && !(vo3Var instanceof so3)) {
            return vo3Var.j(this);
        }
        int d = vo3Var.d();
        int i = this.o;
        if (i > d) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= vo3Var.d()) {
            byte[] bArr = this.m;
            int i2 = this.n;
            if (z) {
                return vo3.q(bArr, i2, ((uo3) vo3Var).m, 0, i);
            }
            if (!(vo3Var instanceof so3)) {
                return vo3Var.e(0, i).equals(e(i2, i + i2));
            }
            so3 so3Var = (so3) vo3Var;
            return vo3.q(bArr, i2, so3Var.m, so3Var.n, i);
        }
        int d2 = vo3Var.d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(d2).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(d2);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.vo3
    public final int k(int i, int i2) {
        return zp3.a(i, this.m, this.n, i2);
    }
}
