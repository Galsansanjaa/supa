package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class vo3 implements Iterable, Serializable {
    public static final uo3 b = new uo3(zp3.a);
    public int a = 0;

    static {
        int i = oo3.a;
    }

    public static uo3 m(int i, int i2, byte[] bArr) {
        try {
            return n(i, i2, bArr);
        } catch (dq3 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static uo3 n(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        p(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new uo3(bArr2);
    }

    public static int p(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean q(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        p(i, i4, bArr.length);
        p(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte c(int i);

    public abstract int d();

    public abstract to3 e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo3)) {
            return false;
        }
        vo3 vo3Var = (vo3) obj;
        int d = d();
        if (d != vo3Var.d()) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        int i = this.a;
        int i2 = vo3Var.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return j(vo3Var);
        }
        return false;
    }

    public abstract void f(int i, byte[] bArr);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int d = d();
            i = k(d, d);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract void i(gp3 gp3Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ro3(this);
    }

    public abstract boolean j(vo3 vo3Var);

    public abstract int k(int i, int i2);

    public final byte[] o() {
        int d = d();
        if (d == 0) {
            return zp3.a;
        }
        byte[] bArr = new byte[d];
        f(d, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        String P = d() <= 50 ? kx.P(o()) : kx.P(e(0, 47).o()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d);
        sb.append(" contents=\"");
        return wa2.v(sb, P, "\">");
    }
}
