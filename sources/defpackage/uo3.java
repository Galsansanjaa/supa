package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uo3 extends to3 {
    public final byte[] m;

    public uo3(byte[] bArr) {
        bArr.getClass();
        this.m = bArr;
    }

    @Override // defpackage.vo3
    public final byte c(int i) {
        return this.m[i];
    }

    @Override // defpackage.vo3
    public final int d() {
        return this.m.length;
    }

    @Override // defpackage.vo3
    public final to3 e(int i, int i2) {
        byte[] bArr = this.m;
        int p = vo3.p(0, i2, bArr.length);
        return p == 0 ? vo3.b : new so3(bArr, 0, p);
    }

    @Override // defpackage.vo3
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.m, 0, bArr, 0, i);
    }

    @Override // defpackage.vo3
    public final void i(gp3 gp3Var) {
        byte[] bArr = this.m;
        gp3Var.c(0, bArr.length, bArr);
    }

    @Override // defpackage.vo3
    public final boolean j(vo3 vo3Var) {
        boolean z = vo3Var instanceof uo3;
        byte[] bArr = this.m;
        if (z) {
            return Arrays.equals(bArr, ((uo3) vo3Var).m);
        }
        boolean z2 = vo3Var instanceof so3;
        if (!z2) {
            return vo3Var.j(this);
        }
        so3 so3Var = (so3) vo3Var;
        int i = so3Var.o;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            return z ? vo3.q(bArr, 0, ((uo3) vo3Var).m, 0, length) : z2 ? vo3.q(bArr, 0, so3Var.m, so3Var.n, length) : vo3Var.e(0, length).equals(e(0, length));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.vo3
    public final int k(int i, int i2) {
        return zp3.a(i, this.m, 0, i2);
    }
}
