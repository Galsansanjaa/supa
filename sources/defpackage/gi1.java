package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gi1 extends InputStream {
    public final InputStream a;
    public long b;
    public long m;
    public long n;
    public long o = -1;
    public boolean p = true;
    public final int q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedInputStream] */
    public gi1(rq rqVar) {
        this.q = -1;
        this.a = rqVar.markSupported() ? rqVar : new BufferedInputStream(rqVar, 4096);
        this.q = 1024;
    }

    public final void a(long j) {
        if (this.b > this.n || j < this.m) {
            hu2.p("Cannot reset");
            return;
        }
        this.a.reset();
        e(this.m, j);
        this.b = j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void d(long j) {
        try {
            long j2 = this.m;
            long j3 = this.b;
            InputStream inputStream = this.a;
            if (j2 >= j3 || j3 > this.n) {
                this.m = j3;
                inputStream.mark((int) (j - j3));
            } else {
                inputStream.reset();
                inputStream.mark((int) (j - this.m));
                e(this.m, this.b);
            }
            this.n = j;
        } catch (IOException e) {
            v5.r(e, "Unable to mark: ");
        }
    }

    public final void e(long j, long j2) {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        long j = this.b + i;
        if (this.n < j) {
            d(j);
        }
        this.o = this.b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.p) {
            long j = this.b + 1;
            long j2 = this.n;
            if (j > j2) {
                d(j2 + this.q);
            }
        }
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!this.p) {
            long j = this.b;
            if (bArr.length + j > this.n) {
                d(j + bArr.length + this.q);
            }
        }
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.p) {
            long j = this.b + i2;
            if (j > this.n) {
                d(j + this.q);
            }
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        a(this.o);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (!this.p) {
            long j2 = this.b + j;
            if (j2 > this.n) {
                d(j2 + this.q);
            }
        }
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }
}
