package defpackage;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rq extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rq(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    public rq(v74 v74Var, zo3 zo3Var) {
        this.a = 3;
        this.b = zo3Var;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((tq) obj).b, SieveCacheKt.NodeLinkMask);
            case 1:
                z32 z32Var = (z32) obj;
                if (!z32Var.m) {
                    return (int) Math.min(z32Var.b.b, SieveCacheKt.NodeLinkMask);
                }
                hu2.p("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((z32) this.b).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tq tqVar = (tq) obj;
                if (tqVar.b > 0) {
                    return tqVar.readByte() & 255;
                }
                return -1;
            case 1:
                z32 z32Var = (z32) obj;
                tq tqVar2 = z32Var.b;
                if (z32Var.m) {
                    hu2.p("closed");
                    return 0;
                }
                if (tqVar2.b == 0 && z32Var.a.r(tqVar2, 8192L) == -1) {
                    return -1;
                }
                return tqVar2.readByte() & 255;
            case 2:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((zo3) obj).f(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                return ((tq) obj).read(bArr, i, i2);
            case 1:
                bArr.getClass();
                z32 z32Var = (z32) obj;
                tq tqVar = z32Var.b;
                if (z32Var.m) {
                    hu2.p("closed");
                    return 0;
                }
                ta3.n(bArr.length, i, i2);
                if (tqVar.b == 0 && z32Var.a.r(tqVar, 8192L) == -1) {
                    return -1;
                }
                return tqVar.read(bArr, i, i2);
            case 2:
                Inflater inflater = ((v74) obj).a;
                try {
                    int inflate = inflater.inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((zo3) obj).f(i, i2, bArr);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 3:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) j;
                ((zo3) this.b).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tq) obj) + ".inputStream()";
            case 1:
                return ((z32) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }
}
