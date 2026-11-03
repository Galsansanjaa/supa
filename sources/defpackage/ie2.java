package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ie2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ie2 f;
    public ie2 g;

    public ie2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public ie2(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final ie2 a() {
        ie2 ie2Var = this.f;
        if (ie2Var == this) {
            ie2Var = null;
        }
        ie2 ie2Var2 = this.g;
        ie2Var2.getClass();
        ie2Var2.f = this.f;
        ie2 ie2Var3 = this.f;
        ie2Var3.getClass();
        ie2Var3.g = this.g;
        this.f = null;
        this.g = null;
        return ie2Var;
    }

    public final void b(ie2 ie2Var) {
        ie2Var.getClass();
        ie2Var.g = this;
        ie2Var.f = this.f;
        ie2 ie2Var2 = this.f;
        ie2Var2.getClass();
        ie2Var2.g = ie2Var;
        this.f = ie2Var;
    }

    public final ie2 c() {
        this.d = true;
        return new ie2(this.a, this.b, this.c, true);
    }

    public final void d(ie2 ie2Var, int i) {
        ie2Var.getClass();
        byte[] bArr = ie2Var.a;
        if (!ie2Var.e) {
            hu2.h("only owner can write");
            return;
        }
        int i2 = ie2Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ie2Var.d) {
                z72.k();
                return;
            }
            int i4 = ie2Var.b;
            if (i3 - i4 > 8192) {
                z72.k();
                return;
            }
            wd.f0(bArr, 0, bArr, i4, i2);
            i2 = ie2Var.c - ie2Var.b;
            ie2Var.c = i2;
            ie2Var.b = 0;
        }
        int i5 = this.b;
        wd.f0(this.a, i2, bArr, i5, i5 + i);
        ie2Var.c += i;
        this.b += i;
    }
}
