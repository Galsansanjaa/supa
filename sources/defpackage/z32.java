package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z32 implements dr {
    public final uk2 a;
    public final tq b;
    public boolean m;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tq] */
    public z32(uk2 uk2Var) {
        uk2Var.getClass();
        this.a = uk2Var;
        this.b = new Object();
    }

    public final boolean a() {
        if (this.m) {
            hu2.h("closed");
            return false;
        }
        tq tqVar = this.b;
        return tqVar.d() && this.a.r(tqVar, 8192L) == -1;
    }

    @Override // defpackage.uk2
    public final or2 b() {
        return this.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, tq] */
    @Override // defpackage.dr
    public final String c(long j) {
        if (j < 0) {
            qq.j(vg1.A(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long d = d((byte) 10, 0L, j2);
        tq tqVar = this.b;
        if (d != -1) {
            return b.a(tqVar, d);
        }
        if (j2 < Long.MAX_VALUE && q(j2) && tqVar.e(j2 - 1) == 13 && q(j2 + 1) && tqVar.e(j2) == 10) {
            return b.a(tqVar, j2);
        }
        ?? obj = new Object();
        tqVar.a(obj, 0L, Math.min(32L, tqVar.b));
        throw new EOFException("\\n not found: limit=" + Math.min(tqVar.b, j) + " content=" + obj.k(obj.b).g() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.a.close();
        tq tqVar = this.b;
        tqVar.skip(tqVar.b);
    }

    public final long d(byte b, long j, long j2) {
        if (this.m) {
            hu2.h("closed");
            return 0L;
        }
        if (0 > j2) {
            qq.j(vg1.A(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            tq tqVar = this.b;
            byte b2 = b;
            long j4 = j2;
            long g = tqVar.g(b2, j3, j4);
            if (g == -1) {
                long j5 = tqVar.b;
                if (j5 >= j4 || this.a.r(tqVar, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return g;
            }
        }
        return -1L;
    }

    public final boolean e(long j, nr nrVar) {
        int i;
        nrVar.getClass();
        int f = nrVar.f();
        if (this.m) {
            hu2.h("closed");
            return false;
        }
        if (j >= 0 && f >= 0 && nrVar.f() >= f) {
            for (0; i < f; i + 1) {
                long j2 = i + j;
                i = (q(1 + j2) && this.b.e(j2) == nrVar.k(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public final void g(byte[] bArr) {
        tq tqVar = this.b;
        int i = 0;
        try {
            i(bArr.length);
            while (i < bArr.length) {
                int read = tqVar.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    v5.p();
                    return;
                }
                i += read;
            }
        } catch (EOFException e) {
            while (true) {
                long j = tqVar.b;
                if (j <= 0) {
                    throw e;
                }
                int read2 = tqVar.read(bArr, i, (int) j);
                if (read2 == -1) {
                    throw new AssertionError();
                }
                i += read2;
            }
        }
    }

    @Override // defpackage.dr
    public final String h() {
        return c(Long.MAX_VALUE);
    }

    @Override // defpackage.dr
    public final void i(long j) {
        if (q(j)) {
            return;
        }
        v5.p();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.m;
    }

    public final int j() {
        i(4L);
        int readInt = this.b.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.dr
    public final nr k(long j) {
        i(j);
        return this.b.k(j);
    }

    public final long l() {
        char c;
        char c2;
        long j;
        i(8L);
        tq tqVar = this.b;
        if (tqVar.b < 8) {
            v5.p();
            return 0L;
        }
        ie2 ie2Var = tqVar.a;
        ie2Var.getClass();
        int i = ie2Var.b;
        int i2 = ie2Var.c;
        if (i2 - i < 8) {
            j = ((tqVar.readInt() & 4294967295L) << 32) | (4294967295L & tqVar.readInt());
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = ie2Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            j = j2 | (bArr[i3] & 255);
            tqVar.b -= 8;
            if (i4 == i2) {
                tqVar.a = ie2Var.a();
                ke2.a(ie2Var);
            } else {
                ie2Var.b = i4;
            }
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    public final short m() {
        i(2L);
        return this.b.q();
    }

    public final String n(long j) {
        i(j);
        return this.b.v(j, ru.a);
    }

    public final boolean q(long j) {
        tq tqVar;
        if (j < 0) {
            qq.j(vg1.A(j, "byteCount < 0: "));
            return false;
        }
        if (this.m) {
            hu2.h("closed");
            return false;
        }
        do {
            tqVar = this.b;
            if (tqVar.b >= j) {
                return true;
            }
        } while (this.a.r(tqVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.uk2
    public final long r(tq tqVar, long j) {
        tqVar.getClass();
        if (j < 0) {
            qq.j(vg1.A(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.m) {
            hu2.h("closed");
            return 0L;
        }
        tq tqVar2 = this.b;
        if (tqVar2.b == 0 && this.a.r(tqVar2, 8192L) == -1) {
            return -1L;
        }
        return tqVar2.r(tqVar, Math.min(j, tqVar2.b));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        tq tqVar = this.b;
        if (tqVar.b == 0 && this.a.r(tqVar, 8192L) == -1) {
            return -1;
        }
        return tqVar.read(byteBuffer);
    }

    @Override // defpackage.dr
    public final byte readByte() {
        i(1L);
        return this.b.readByte();
    }

    @Override // defpackage.dr
    public final int readInt() {
        i(4L);
        return this.b.readInt();
    }

    @Override // defpackage.dr
    public final short readShort() {
        i(2L);
        return this.b.readShort();
    }

    @Override // defpackage.dr
    public final void skip(long j) {
        if (this.m) {
            hu2.h("closed");
            return;
        }
        while (j > 0) {
            tq tqVar = this.b;
            if (tqVar.b == 0 && this.a.r(tqVar, 8192L) == -1) {
                v5.p();
                return;
            } else {
                long min = Math.min(j, tqVar.b);
                tqVar.skip(min);
                j -= min;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.xu3.g(16);
        defpackage.xu3.g(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t() {
        /*
            r6 = this;
            r0 = 1
            r6.i(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.q(r2)
            tq r3 = r6.b
            if (r2 == 0) goto L4f
            long r4 = (long) r0
            byte r2 = r3.e(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4f
        L34:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.xu3.g(r0)
            defpackage.xu3.g(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L4f:
            long r0 = r3.t()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z32.t():long");
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.dr
    public final InputStream u() {
        return new rq(this, 1);
    }
}
