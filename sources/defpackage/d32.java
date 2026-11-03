package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class d32 implements Closeable {
    public static final Logger q = Logger.getLogger(d32.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int m;
    public a32 n;
    public a32 o;
    public final byte[] p;

    public d32(File file) {
        byte[] bArr = new byte[16];
        this.p = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    z(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    hu2.p("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int m = m(0, bArr);
        this.b = m;
        if (m <= randomAccessFile2.length()) {
            this.m = m(4, bArr);
            int m2 = m(8, bArr);
            int m3 = m(12, bArr);
            this.n = l(m2);
            this.o = l(m3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int m(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void z(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        int x;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    e(length);
                    boolean j = j();
                    if (j) {
                        x = 16;
                    } else {
                        a32 a32Var = this.o;
                        x = x(a32Var.b + 4 + a32Var.c);
                    }
                    a32 a32Var2 = new a32(x, length, 0);
                    z(0, length, this.p);
                    v(x, 4, this.p);
                    v(x + 4, length, bArr);
                    y(this.b, this.m + 1, j ? x : this.n.b, x);
                    this.o = a32Var2;
                    this.m++;
                    if (j) {
                        this.n = a32Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void d() {
        y(4096, 0, 0, 0);
        this.m = 0;
        a32 a32Var = a32.d;
        this.n = a32Var;
        this.o = a32Var;
        if (this.b > 4096) {
            RandomAccessFile randomAccessFile = this.a;
            randomAccessFile.setLength(4096L);
            randomAccessFile.getChannel().force(true);
        }
        this.b = 4096;
    }

    public final void e(int i) {
        int i2 = i + 4;
        int w = this.b - w();
        if (w >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            w += i3;
            i3 <<= 1;
        } while (w < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        a32 a32Var = this.o;
        int x = x(a32Var.b + 4 + a32Var.c);
        if (x < this.n.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = x - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                qq.e("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.o.b;
        int i5 = this.n.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            y(i3, this.m, i5, i6);
            this.o = new a32(i6, this.o.c, 0);
        } else {
            y(i3, this.m, i5, i4);
        }
        this.b = i3;
    }

    public final synchronized void g(c32 c32Var) {
        int i = this.n.b;
        for (int i2 = 0; i2 < this.m; i2++) {
            a32 l = l(i);
            c32Var.a(new b32(this, l), l.c);
            i = x(l.b + 4 + l.c);
        }
    }

    public final synchronized boolean j() {
        return this.m == 0;
    }

    public final a32 l(int i) {
        if (i == 0) {
            return a32.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new a32(i, randomAccessFile.readInt(), 0);
    }

    public final synchronized void n() {
        try {
            if (j()) {
                throw new NoSuchElementException();
            }
            if (this.m == 1) {
                d();
            } else {
                a32 a32Var = this.n;
                int x = x(a32Var.b + 4 + a32Var.c);
                q(x, this.p, 0, 4);
                int m = m(0, this.p);
                y(this.b, this.m - 1, x, this.o.b);
                this.m--;
                this.n = new a32(x, m, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void q(int i, byte[] bArr, int i2, int i3) {
        int x = x(i);
        int i4 = x + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(x);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - x;
        randomAccessFile.seek(x);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d32.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.m);
        sb.append(", first=");
        sb.append(this.n);
        sb.append(", last=");
        sb.append(this.o);
        sb.append(", element lengths=[");
        try {
            g(new gz(sb));
        } catch (IOException e) {
            q.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void v(int i, int i2, byte[] bArr) {
        int x = x(i);
        int i3 = x + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(x);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - x;
        randomAccessFile.seek(x);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int w() {
        if (this.m == 0) {
            return 16;
        }
        a32 a32Var = this.o;
        int i = a32Var.b;
        int i2 = this.n.b;
        return i >= i2 ? (i - i2) + 4 + a32Var.c + 16 : (((i + 4) + a32Var.c) + this.b) - i2;
    }

    public final int x(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void y(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.p;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                z(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }
}
