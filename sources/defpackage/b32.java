package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b32 extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ d32 m;

    public b32(d32 d32Var, a32 a32Var) {
        this.m = d32Var;
        this.a = d32Var.x(a32Var.b + 4);
        this.b = a32Var.c;
    }

    @Override // java.io.InputStream
    public final int read() {
        d32 d32Var = this.m;
        RandomAccessFile randomAccessFile = d32Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = d32Var.x(this.a + 1);
        this.b--;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            hu2.q("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        d32 d32Var = this.m;
        d32Var.q(i4, bArr, i, i2);
        this.a = d32Var.x(this.a + i2);
        this.b -= i2;
        return i2;
    }
}
