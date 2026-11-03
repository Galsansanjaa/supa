package defpackage;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.work.WorkRequest;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tq implements dr, cr, Cloneable, ByteChannel {
    public ie2 a;
    public long b;

    public final void A(int i) {
        ie2 x = x(1);
        byte[] bArr = x.a;
        int i2 = x.c;
        x.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void B(long j) {
        boolean z;
        if (j == 0) {
            A(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                G("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= WorkRequest.MIN_BACKOFF_MILLIS) {
            i = j < AnimationKt.MillisToNanos ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        ie2 x = x(i);
        byte[] bArr = x.a;
        int i2 = x.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = StylePropertiesKt.FontSynthesisId;
        }
        x.c += i;
        this.b += i;
    }

    public final void C(long j) {
        if (j == 0) {
            A(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        ie2 x = x(i);
        byte[] bArr = x.a;
        int i2 = x.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        x.c += i;
        this.b += i;
    }

    public final void D(int i) {
        ie2 x = x(4);
        byte[] bArr = x.a;
        int i2 = x.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        x.c = i2 + 4;
        this.b += 4;
    }

    public final void E(int i) {
        ie2 x = x(2);
        byte[] bArr = x.a;
        int i2 = x.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        x.c = i2 + 2;
        this.b += 2;
    }

    public final void F(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            qq.j(lt.w(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            qq.j(k93.l(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder w = wa2.w(i2, "endIndex > string.length: ", " > ");
            w.append(str.length());
            throw new IllegalArgumentException(w.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                ie2 x = x(1);
                byte[] bArr = x.a;
                int i3 = x.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = x.c;
                int i6 = (i3 + i) - i5;
                x.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    ie2 x2 = x(2);
                    byte[] bArr2 = x2.a;
                    int i7 = x2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    x2.c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    ie2 x3 = x(3);
                    byte[] bArr3 = x3.a;
                    int i8 = x3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    x3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        A(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        ie2 x4 = x(4);
                        byte[] bArr4 = x4.a;
                        int i11 = x4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        x4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void G(String str) {
        str.getClass();
        F(0, str.length(), str);
    }

    public final void H(int i) {
        String str;
        if (i < 128) {
            A(i);
            return;
        }
        if (i < 2048) {
            ie2 x = x(2);
            byte[] bArr = x.a;
            int i2 = x.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            x.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            A(63);
            return;
        }
        if (i < 65536) {
            ie2 x2 = x(3);
            byte[] bArr2 = x2.a;
            int i3 = x2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            x2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            ie2 x3 = x(4);
            byte[] bArr3 = x3.a;
            int i4 = x3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            x3.c = i4 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = kx.b;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            r0.Companion.getClass();
            n0.a(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(tq tqVar, long j, long j2) {
        tqVar.getClass();
        long j3 = j;
        ta3.n(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        tqVar.b += j2;
        ie2 ie2Var = this.a;
        while (true) {
            ie2Var.getClass();
            long j4 = ie2Var.c - ie2Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            ie2Var = ie2Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            ie2Var.getClass();
            ie2 c = ie2Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            ie2 ie2Var2 = tqVar.a;
            if (ie2Var2 == null) {
                c.g = c;
                c.f = c;
                tqVar.a = c;
            } else {
                ie2 ie2Var3 = ie2Var2.g;
                ie2Var3.getClass();
                ie2Var3.b(c);
            }
            j5 -= c.c - c.b;
            ie2Var = ie2Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.uk2
    public final or2 b() {
        return or2.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tq] */
    @Override // defpackage.dr
    public final String c(long j) {
        if (j < 0) {
            qq.j(vg1.A(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long g = g((byte) 10, 0L, j2);
        if (g != -1) {
            return b.a(this, g);
        }
        if (j2 < this.b && e(j2 - 1) == 13 && e(j2) == 10) {
            return b.a(this, j2);
        }
        ?? obj = new Object();
        a(obj, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + obj.k(obj.b).g() + (char) 8230);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tq] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.b == 0) {
            return obj;
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        ie2 c = ie2Var.c();
        obj.a = c;
        c.g = c;
        c.f = c;
        for (ie2 ie2Var2 = ie2Var.f; ie2Var2 != ie2Var; ie2Var2 = ie2Var2.f) {
            ie2 ie2Var3 = c.g;
            ie2Var3.getClass();
            ie2Var2.getClass();
            ie2Var3.b(ie2Var2.c());
        }
        obj.b = this.b;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.nj2
    public final void close() {
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final byte e(long j) {
        ta3.n(this.b, j, 1L);
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ie2Var = ie2Var.g;
                ie2Var.getClass();
                j2 -= ie2Var.c - ie2Var.b;
            }
            return ie2Var.a[(int) ((ie2Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ie2Var.c;
            int i2 = ie2Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return ie2Var.a[(int) ((i2 + j) - j3)];
            }
            ie2Var = ie2Var.f;
            ie2Var.getClass();
            j3 = j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        long j = this.b;
        tq tqVar = (tq) obj;
        if (j != tqVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        ie2 ie2Var2 = tqVar.a;
        ie2Var2.getClass();
        int i = ie2Var.b;
        int i2 = ie2Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(ie2Var.c - i, ie2Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ie2Var.a[i] != ie2Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ie2Var.c) {
                ie2Var = ie2Var.f;
                ie2Var.getClass();
                i = ie2Var.b;
            }
            if (i2 == ie2Var2.c) {
                ie2Var2 = ie2Var2.f;
                ie2Var2.getClass();
                i2 = ie2Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.cr
    public final /* bridge */ /* synthetic */ cr f(String str) {
        G(str);
        return this;
    }

    @Override // defpackage.cr, defpackage.nj2, java.io.Flushable
    public final void flush() {
    }

    public final long g(byte b, long j, long j2) {
        ie2 ie2Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (ie2Var = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                ie2Var = ie2Var.g;
                ie2Var.getClass();
                j4 -= ie2Var.c - ie2Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = ie2Var.a;
                int min = (int) Math.min(ie2Var.c, (ie2Var.b + j2) - j4);
                for (int i = (int) ((ie2Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - ie2Var.b) + j4;
                    }
                }
                j4 += ie2Var.c - ie2Var.b;
                ie2Var = ie2Var.f;
                ie2Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (ie2Var.c - ie2Var.b) + j3;
            if (j5 > j) {
                break;
            }
            ie2Var = ie2Var.f;
            ie2Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = ie2Var.a;
            int min2 = (int) Math.min(ie2Var.c, (ie2Var.b + j2) - j3);
            for (int i2 = (int) ((ie2Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - ie2Var.b) + j3;
                }
            }
            j3 += ie2Var.c - ie2Var.b;
            ie2Var = ie2Var.f;
            ie2Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // defpackage.dr
    public final String h() {
        return c(Long.MAX_VALUE);
    }

    public final int hashCode() {
        ie2 ie2Var = this.a;
        if (ie2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ie2Var.c;
            for (int i3 = ie2Var.b; i3 < i2; i3++) {
                i = (i * 31) + ie2Var.a[i3];
            }
            ie2Var = ie2Var.f;
            ie2Var.getClass();
        } while (ie2Var != this.a);
        return i;
    }

    @Override // defpackage.dr
    public final void i(long j) {
        if (this.b >= j) {
            return;
        }
        v5.p();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(nr nrVar) {
        int i;
        int i2;
        nrVar.getClass();
        ie2 ie2Var = this.a;
        if (ie2Var == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                ie2Var = ie2Var.g;
                ie2Var.getClass();
                j -= ie2Var.c - ie2Var.b;
            }
            if (nrVar.f() == 2) {
                byte k = nrVar.k(0);
                byte k2 = nrVar.k(1);
                while (j < this.b) {
                    byte[] bArr = ie2Var.a;
                    i = (int) ((ie2Var.b + j2) - j);
                    int i3 = ie2Var.c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b != k && b != k2) {
                            i++;
                        }
                        i2 = ie2Var.b;
                    }
                    j2 = (ie2Var.c - ie2Var.b) + j;
                    ie2Var = ie2Var.f;
                    ie2Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] j3 = nrVar.j();
            while (j < this.b) {
                byte[] bArr2 = ie2Var.a;
                i = (int) ((ie2Var.b + j2) - j);
                int i4 = ie2Var.c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : j3) {
                        if (b2 == b3) {
                            i2 = ie2Var.b;
                        }
                    }
                    i++;
                }
                j2 = (ie2Var.c - ie2Var.b) + j;
                ie2Var = ie2Var.f;
                ie2Var.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j4 = (ie2Var.c - ie2Var.b) + j;
            if (j4 > 0) {
                break;
            }
            ie2Var = ie2Var.f;
            ie2Var.getClass();
            j = j4;
        }
        if (nrVar.f() == 2) {
            byte k3 = nrVar.k(0);
            byte k4 = nrVar.k(1);
            while (j < this.b) {
                byte[] bArr3 = ie2Var.a;
                i = (int) ((ie2Var.b + j2) - j);
                int i5 = ie2Var.c;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 != k3 && b4 != k4) {
                        i++;
                    }
                    i2 = ie2Var.b;
                }
                j2 = (ie2Var.c - ie2Var.b) + j;
                ie2Var = ie2Var.f;
                ie2Var.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] j5 = nrVar.j();
        while (j < this.b) {
            byte[] bArr4 = ie2Var.a;
            i = (int) ((ie2Var.b + j2) - j);
            int i6 = ie2Var.c;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : j5) {
                    if (b5 == b6) {
                        i2 = ie2Var.b;
                    }
                }
                i++;
            }
            j2 = (ie2Var.c - ie2Var.b) + j;
            ie2Var = ie2Var.f;
            ie2Var.getClass();
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    @Override // defpackage.dr
    public final nr k(long j) {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            qq.j(vg1.A(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            v5.p();
            return null;
        }
        if (j < 4096) {
            return new nr(m(j));
        }
        nr w = w((int) j);
        skip(j);
        return w;
    }

    public final boolean l(long j, nr nrVar) {
        nrVar.getClass();
        int f = nrVar.f();
        if (j >= 0 && f >= 0 && this.b - j >= f && nrVar.f() >= f) {
            for (int i = 0; i < f; i++) {
                if (e(i + j) == nrVar.k(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final byte[] m(long j) {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            qq.j(vg1.A(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            v5.p();
            return null;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                v5.p();
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        r3 = r20.b - r2;
        r20.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (r9 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r2 >= r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        if (r3 == r18) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (r9 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        r2 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        r2 = defpackage.sg3.v(r2, " but was 0x");
        r0 = e(r18);
        r4 = defpackage.kx.b;
        r5 = r4[(r0 >> 4) & 15];
        r0 = r4[r0 & androidx.compose.foundation.style.StylePropertiesKt.RightId];
        r1 = new char[2];
        r1[r16] = r5;
        r1[r17] = r0;
        r2.append(new java.lang.String(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r2 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        defpackage.v5.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        return -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, tq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.n():long");
    }

    @Override // defpackage.nj2
    public final void o(tq tqVar, long j) {
        ie2 b;
        tqVar.getClass();
        if (tqVar == this) {
            v5.m("source == this");
            return;
        }
        ta3.n(tqVar.b, 0L, j);
        while (j > 0) {
            ie2 ie2Var = tqVar.a;
            ie2Var.getClass();
            int i = ie2Var.c;
            ie2 ie2Var2 = tqVar.a;
            ie2Var2.getClass();
            long j2 = i - ie2Var2.b;
            int i2 = 0;
            if (j < j2) {
                ie2 ie2Var3 = this.a;
                ie2 ie2Var4 = ie2Var3 != null ? ie2Var3.g : null;
                if (ie2Var4 != null && ie2Var4.e) {
                    if ((ie2Var4.c + j) - (ie2Var4.d ? 0 : ie2Var4.b) <= 8192) {
                        ie2 ie2Var5 = tqVar.a;
                        ie2Var5.getClass();
                        ie2Var5.d(ie2Var4, (int) j);
                        tqVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                ie2 ie2Var6 = tqVar.a;
                ie2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > ie2Var6.c - ie2Var6.b) {
                    v5.m("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = ie2Var6.c();
                } else {
                    b = ke2.b();
                    byte[] bArr = ie2Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = ie2Var6.b;
                    wd.f0(bArr, 0, bArr2, i4, i4 + i3);
                }
                b.c = b.b + i3;
                ie2Var6.b += i3;
                ie2 ie2Var7 = ie2Var6.g;
                ie2Var7.getClass();
                ie2Var7.b(b);
                tqVar.a = b;
            }
            ie2 ie2Var8 = tqVar.a;
            ie2Var8.getClass();
            long j3 = ie2Var8.c - ie2Var8.b;
            tqVar.a = ie2Var8.a();
            ie2 ie2Var9 = this.a;
            if (ie2Var9 == null) {
                this.a = ie2Var8;
                ie2Var8.g = ie2Var8;
                ie2Var8.f = ie2Var8;
            } else {
                ie2 ie2Var10 = ie2Var9.g;
                ie2Var10.getClass();
                ie2Var10.b(ie2Var8);
                ie2 ie2Var11 = ie2Var8.g;
                if (ie2Var11 == ie2Var8) {
                    hu2.h("cannot compact");
                    return;
                }
                ie2Var11.getClass();
                if (ie2Var11.e) {
                    int i5 = ie2Var8.c - ie2Var8.b;
                    ie2 ie2Var12 = ie2Var8.g;
                    ie2Var12.getClass();
                    int i6 = 8192 - ie2Var12.c;
                    ie2 ie2Var13 = ie2Var8.g;
                    ie2Var13.getClass();
                    if (!ie2Var13.d) {
                        ie2 ie2Var14 = ie2Var8.g;
                        ie2Var14.getClass();
                        i2 = ie2Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        ie2 ie2Var15 = ie2Var8.g;
                        ie2Var15.getClass();
                        ie2Var8.d(ie2Var15, i5);
                        ie2Var8.a();
                        ke2.a(ie2Var8);
                    }
                }
            }
            tqVar.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.cr
    public final /* bridge */ /* synthetic */ cr p(long j) {
        C(j);
        return this;
    }

    public final short q() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.uk2
    public final long r(tq tqVar, long j) {
        tqVar.getClass();
        if (j < 0) {
            qq.j(vg1.A(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        tqVar.o(this, j);
        return j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ie2 ie2Var = this.a;
        if (ie2Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ie2Var.c - ie2Var.b);
        byteBuffer.put(ie2Var.a, ie2Var.b, min);
        int i = ie2Var.b + min;
        ie2Var.b = i;
        this.b -= min;
        if (i == ie2Var.c) {
            this.a = ie2Var.a();
            ke2.a(ie2Var);
        }
        return min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        ta3.n(bArr.length, i, i2);
        ie2 ie2Var = this.a;
        if (ie2Var == null) {
            return -1;
        }
        int min = Math.min(i2, ie2Var.c - ie2Var.b);
        byte[] bArr2 = ie2Var.a;
        int i3 = ie2Var.b;
        wd.f0(bArr2, i, bArr, i3, i3 + min);
        int i4 = ie2Var.b + min;
        ie2Var.b = i4;
        this.b -= min;
        if (i4 == ie2Var.c) {
            this.a = ie2Var.a();
            ke2.a(ie2Var);
        }
        return min;
    }

    @Override // defpackage.dr
    public final byte readByte() {
        if (this.b == 0) {
            v5.p();
            return (byte) 0;
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        int i = ie2Var.b;
        int i2 = ie2Var.c;
        int i3 = i + 1;
        byte b = ie2Var.a[i];
        this.b--;
        if (i3 != i2) {
            ie2Var.b = i3;
            return b;
        }
        this.a = ie2Var.a();
        ke2.a(ie2Var);
        return b;
    }

    @Override // defpackage.dr
    public final int readInt() {
        if (this.b < 4) {
            v5.p();
            return 0;
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        int i = ie2Var.b;
        int i2 = ie2Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = ie2Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            ie2Var.b = i5;
            return i6;
        }
        this.a = ie2Var.a();
        ke2.a(ie2Var);
        return i6;
    }

    @Override // defpackage.dr
    public final short readShort() {
        if (this.b < 2) {
            v5.p();
            return (short) 0;
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        int i = ie2Var.b;
        int i2 = ie2Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = ie2Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = ie2Var.a();
            ke2.a(ie2Var);
        } else {
            ie2Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.cr
    public final OutputStream s() {
        return new sq(this, 0);
    }

    @Override // defpackage.dr
    public final void skip(long j) {
        while (j > 0) {
            ie2 ie2Var = this.a;
            if (ie2Var == null) {
                v5.p();
                return;
            }
            int min = (int) Math.min(j, ie2Var.c - ie2Var.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = ie2Var.b + min;
            ie2Var.b = i;
            if (i == ie2Var.c) {
                this.a = ie2Var.a();
                ke2.a(ie2Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, tq] */
    @Override // defpackage.dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t() {
        /*
            r15 = this;
            long r0 = r15.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            ie2 r7 = r15.a
            r7.getClass()
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L17:
            if (r9 >= r10) goto L92
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L6a
            r12 = 70
            if (r11 > r12) goto L6a
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            tq r15 = new tq
            r15.<init>()
            r15.C(r4)
            r15.A(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            long r1 = r15.b
            java.nio.charset.Charset r3 = defpackage.ru.a
            java.lang.String r15 = r15.v(r1, r3)
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L6a:
            r6 = 1
            if (r1 == 0) goto L6e
            goto L92
        L6e:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = defpackage.kx.b
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L92:
            if (r9 != r10) goto L9e
            ie2 r8 = r7.a()
            r15.a = r8
            defpackage.ke2.a(r7)
            goto La0
        L9e:
            r7.b = r9
        La0:
            if (r6 != 0) goto La6
            ie2 r7 = r15.a
            if (r7 != 0) goto Lc
        La6:
            long r2 = r15.b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.b = r2
            return r4
        Lad:
            defpackage.v5.p()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq.t():long");
    }

    public final String toString() {
        long j = this.b;
        if (j <= SieveCacheKt.NodeLinkMask) {
            return w((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.dr
    public final InputStream u() {
        return new rq(this, 0);
    }

    public final String v(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            qq.j(vg1.A(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            v5.p();
            return null;
        }
        if (j == 0) {
            return "";
        }
        ie2 ie2Var = this.a;
        ie2Var.getClass();
        int i = ie2Var.b;
        if (i + j > ie2Var.c) {
            return new String(m(j), charset);
        }
        int i2 = (int) j;
        String str = new String(ie2Var.a, i, i2, charset);
        int i3 = ie2Var.b + i2;
        ie2Var.b = i3;
        this.b -= j;
        if (i3 == ie2Var.c) {
            this.a = ie2Var.a();
            ke2.a(ie2Var);
        }
        return str;
    }

    public final nr w(int i) {
        if (i == 0) {
            return nr.n;
        }
        ta3.n(this.b, 0L, i);
        ie2 ie2Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ie2Var.getClass();
            int i5 = ie2Var.c;
            int i6 = ie2Var.b;
            if (i5 == i6) {
                qq.e("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            ie2Var = ie2Var.f;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        ie2 ie2Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            ie2Var2.getClass();
            bArr[i7] = ie2Var2.a;
            i2 += ie2Var2.c - ie2Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ie2Var2.b;
            ie2Var2.d = true;
            i7++;
            ie2Var2 = ie2Var2.f;
        }
        return new oe2(bArr, iArr);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ie2 x = x(1);
            int min = Math.min(i, 8192 - x.c);
            byteBuffer.get(x.a, x.c, min);
            i -= min;
            x.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.cr
    public final cr write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ta3.n(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ie2 x = x(1);
            int min = Math.min(i3 - i, 8192 - x.c);
            int i4 = i + min;
            wd.f0(bArr, x.c, x.a, i, i4);
            x.c += min;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.cr
    public final /* bridge */ /* synthetic */ cr writeByte(int i) {
        A(i);
        return this;
    }

    @Override // defpackage.cr
    public final /* bridge */ /* synthetic */ cr writeInt(int i) {
        D(i);
        return this;
    }

    @Override // defpackage.cr
    public final /* bridge */ /* synthetic */ cr writeShort(int i) {
        E(i);
        return this;
    }

    public final ie2 x(int i) {
        if (i < 1 || i > 8192) {
            v5.m("unexpected capacity");
            return null;
        }
        ie2 ie2Var = this.a;
        if (ie2Var == null) {
            ie2 b = ke2.b();
            this.a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        ie2 ie2Var2 = ie2Var.g;
        ie2Var2.getClass();
        if (ie2Var2.c + i <= 8192 && ie2Var2.e) {
            return ie2Var2;
        }
        ie2 b2 = ke2.b();
        ie2Var2.b(b2);
        return b2;
    }

    public final void y(nr nrVar) {
        nrVar.getClass();
        nrVar.u(this, nrVar.f());
    }

    public final void z(uk2 uk2Var) {
        uk2Var.getClass();
        do {
        } while (uk2Var.r(this, 8192L) != -1);
    }
}
