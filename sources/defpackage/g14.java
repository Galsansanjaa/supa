package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class g14 implements Iterable, Serializable {
    public static final g14 m = new g14(y14.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i = x04.a;
    }

    public g14(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            lh0.f(sg3.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            lh0.f(k93.l(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        lh0.f(k93.l(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static g14 m(int i, byte[] bArr) {
        k(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new g14(bArr2);
    }

    public byte c(int i) {
        return this.b[i];
    }

    public byte d(int i) {
        return this.b[i];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g14) && f() == ((g14) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof g14)) {
                return obj.equals(this);
            }
            g14 g14Var = (g14) obj;
            int i = this.a;
            int i2 = g14Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int f = f();
                if (f > g14Var.f()) {
                    throw new IllegalArgumentException("Length too large: " + f + f());
                }
                if (f > g14Var.f()) {
                    v5.m(k93.l(f, g14Var.f(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = g14Var.b;
                int e = e() + f;
                int e2 = e();
                int e3 = g14Var.e();
                while (e2 < e) {
                    if (this.b[e2] == bArr[e3]) {
                        e2++;
                        e3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.b.length;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int f = f();
        int e = e();
        byte[] bArr = y14.a;
        int i2 = f;
        for (int i3 = e; i3 < e + f; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public void i(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ro3(this);
    }

    public final ByteArrayInputStream j() {
        return new ByteArrayInputStream(this.b, e(), f());
    }

    public final byte[] n() {
        int f = f();
        if (f == 0) {
            return y14.a;
        }
        byte[] bArr = new byte[f];
        i(f, bArr);
        return bArr;
    }

    public final String toString() {
        g14 c14Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f = f();
        if (f() <= 50) {
            concat = ej1.V(this);
        } else {
            int k = k(0, 47, f());
            if (k == 0) {
                c14Var = m;
            } else {
                c14Var = new c14(this.b, e(), k);
            }
            concat = ej1.V(c14Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(f);
        sb.append(" contents=\"");
        return wa2.v(sb, concat, "\">");
    }
}
