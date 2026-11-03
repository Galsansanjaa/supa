package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class dk0 extends InputStream implements DataInput {
    public static final ByteOrder o = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder p = ByteOrder.BIG_ENDIAN;
    public final DataInputStream a;
    public ByteOrder b;
    public final int m;
    public int n;

    public dk0(InputStream inputStream) {
        this.b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        int available = dataInputStream.available();
        this.m = available;
        this.n = 0;
        dataInputStream.mark(available);
    }

    public dk0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public final void a(long j) {
        int i = this.n;
        if (i > j) {
            this.n = 0;
            DataInputStream dataInputStream = this.a;
            dataInputStream.reset();
            dataInputStream.mark(this.m);
        } else {
            j -= i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
            return;
        }
        hu2.p("Couldn't seek up to the byteCount");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.n++;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.n += read;
        return read;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.n++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int i = this.n + 1;
        this.n = i;
        if (i > this.m) {
            v5.p();
            return (byte) 0;
        }
        int read = this.a.read();
        if (read >= 0) {
            return (byte) read;
        }
        v5.p();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.n += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int length = this.n + bArr.length;
        this.n = length;
        if (length > this.m) {
            v5.p();
            return;
        }
        if (this.a.read(bArr, 0, bArr.length) == bArr.length) {
            return;
        }
        hu2.p("Couldn't read up to the length of buffer");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.n + i2;
        this.n = i3;
        if (i3 > this.m) {
            v5.p();
        } else {
            if (this.a.read(bArr, i, i2) == i2) {
                return;
            }
            hu2.p("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i = this.n + 4;
        this.n = i;
        if (i > this.m) {
            v5.p();
            return 0;
        }
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            v5.p();
            return 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == o) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == p) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        v5.k(this.b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        int i = this.n + 8;
        this.n = i;
        if (i > this.m) {
            v5.p();
            return 0L;
        }
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            v5.p();
            return 0L;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == o) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == p) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        v5.k(this.b, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i = this.n + 2;
        this.n = i;
        if (i > this.m) {
            v5.p();
            return (short) 0;
        }
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            v5.p();
            return (short) 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == o) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == p) {
            return (short) ((read << 8) + read2);
        }
        v5.k(this.b, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.n += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.n++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int i = this.n + 2;
        this.n = i;
        if (i > this.m) {
            v5.p();
            return 0;
        }
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            v5.p();
            return 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == o) {
            return (read2 << 8) + read;
        }
        if (byteOrder == p) {
            return (read << 8) + read2;
        }
        v5.k(this.b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int min = Math.min(i, this.m - this.n);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.a.skipBytes(min - i2);
        }
        this.n += i2;
        return i2;
    }
}
