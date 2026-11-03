package defpackage;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ez0 implements Closeable {
    public static final Logger q = Logger.getLogger(ky0.class.getName());
    public final cr a;
    public final boolean b;
    public final tq m;
    public int n;
    public boolean o;
    public final xx0 p;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tq] */
    public ez0(y32 y32Var, boolean z) {
        this.a = y32Var;
        this.b = z;
        ?? obj = new Object();
        this.m = obj;
        this.p = new xx0(obj);
        this.n = 16384;
    }

    public final synchronized void a(zo zoVar) {
        try {
            if (this.o) {
                throw new IOException("closed");
            }
            int i = this.n;
            int i2 = zoVar.b;
            if ((i2 & 32) != 0) {
                i = ((int[]) zoVar.c)[5];
            }
            this.n = i;
            if (((i2 & 2) != 0 ? ((int[]) zoVar.c)[1] : -1) != -1) {
                xx0 xx0Var = this.p;
                int min = Math.min((i2 & 2) != 0 ? ((int[]) zoVar.c)[1] : -1, 16384);
                int i3 = xx0Var.c;
                if (i3 != min) {
                    if (min < i3) {
                        xx0Var.b = Math.min(xx0Var.b, min);
                    }
                    xx0Var.e = true;
                    xx0Var.c = min;
                    int i4 = xx0Var.g;
                    if (min < i4) {
                        if (min == 0) {
                            Arrays.fill((zv0[]) xx0Var.i, (Object) null);
                            xx0Var.d = ((zv0[]) xx0Var.i).length - 1;
                            xx0Var.f = 0;
                            xx0Var.g = 0;
                        } else {
                            xx0Var.a(i4 - min);
                        }
                    }
                }
            }
            e(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.o = true;
        this.a.close();
    }

    public final synchronized void d(boolean z, int i, tq tqVar, int i2) {
        if (this.o) {
            throw new IOException("closed");
        }
        e(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.a.o(tqVar, i2);
        }
    }

    public final void e(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = q;
        if (logger.isLoggable(level)) {
            logger.fine(ky0.a(false, i, i2, b, b2));
        }
        int i3 = this.n;
        if (i2 > i3) {
            ky0.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            ky0.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        cr crVar = this.a;
        crVar.writeByte((i2 >>> 16) & 255);
        crVar.writeByte((i2 >>> 8) & 255);
        crVar.writeByte(i2 & 255);
        crVar.writeByte(b & 255);
        crVar.writeByte(b2 & 255);
        crVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.o) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void g(int i, int i2, byte[] bArr) {
        try {
            if (this.o) {
                throw new IOException("closed");
            }
            if (lt.o(i2) == -1) {
                ky0.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            e(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.a.writeInt(i);
            this.a.writeInt(lt.o(i2));
            if (bArr.length > 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(ArrayList arrayList, int i, boolean z) {
        int i2;
        int i3;
        if (this.o) {
            hu2.p("closed");
            return;
        }
        xx0 xx0Var = this.p;
        if (xx0Var.e) {
            int i4 = xx0Var.b;
            if (i4 < xx0Var.c) {
                xx0Var.g(i4, 31, 32);
            }
            xx0Var.e = false;
            xx0Var.b = Integer.MAX_VALUE;
            xx0Var.g(xx0Var.c, 31, 32);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zv0 zv0Var = (zv0) arrayList.get(i5);
            nr s = zv0Var.a.s();
            nr nrVar = zv0Var.b;
            Integer num = (Integer) yx0.b.get(s);
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (i3 > 1 && i3 < 8) {
                    zv0[] zv0VarArr = yx0.a;
                    if (f63.i(zv0VarArr[intValue].b, nrVar)) {
                        i2 = i3;
                    } else if (f63.i(zv0VarArr[i3].b, nrVar)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i6 = xx0Var.d + 1;
                int length = ((zv0[]) xx0Var.i).length;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    if (f63.i(((zv0[]) xx0Var.i)[i6].a, s)) {
                        if (f63.i(((zv0[]) xx0Var.i)[i6].b, nrVar)) {
                            i3 = (i6 - xx0Var.d) + yx0.a.length;
                            break;
                        } else if (i2 == -1) {
                            i2 = (i6 - xx0Var.d) + yx0.a.length;
                        }
                    }
                    i6++;
                }
            }
            if (i3 != -1) {
                xx0Var.g(i3, 127, 128);
            } else if (i2 == -1) {
                ((tq) xx0Var.h).A(64);
                xx0Var.f(s);
                xx0Var.f(nrVar);
                xx0Var.c(zv0Var);
            } else {
                nr nrVar2 = zv0.d;
                s.getClass();
                nrVar2.getClass();
                if (!s.o(0, nrVar2, nrVar2.f()) || zv0.i.equals(s)) {
                    xx0Var.g(i2, 63, 64);
                    xx0Var.f(nrVar);
                    xx0Var.c(zv0Var);
                } else {
                    xx0Var.g(i2, 15, 0);
                    xx0Var.f(nrVar);
                }
            }
        }
        tq tqVar = this.m;
        long j = tqVar.b;
        int min = (int) Math.min(this.n, j);
        long j2 = min;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        e(i, min, (byte) 1, b);
        cr crVar = this.a;
        crVar.o(tqVar, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int min2 = (int) Math.min(this.n, j3);
                long j4 = min2;
                j3 -= j4;
                e(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                crVar.o(tqVar, j4);
            }
        }
    }

    public final synchronized void l(int i, int i2, boolean z) {
        if (this.o) {
            throw new IOException("closed");
        }
        e(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public final synchronized void m(int i, int i2) {
        if (this.o) {
            throw new IOException("closed");
        }
        if (lt.o(i2) == -1) {
            throw new IllegalArgumentException();
        }
        e(i, 4, (byte) 3, (byte) 0);
        this.a.writeInt(lt.o(i2));
        this.a.flush();
    }

    public final synchronized void n(zo zoVar) {
        try {
            if (this.o) {
                throw new IOException("closed");
            }
            e(0, Integer.bitCount(zoVar.b) * 6, (byte) 4, (byte) 0);
            int i = 0;
            while (i < 10) {
                boolean z = true;
                if (((1 << i) & zoVar.b) == 0) {
                    z = false;
                }
                if (z) {
                    this.a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.a.writeInt(((int[]) zoVar.c)[i]);
                }
                i++;
            }
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q(ArrayList arrayList, int i, boolean z) {
        if (this.o) {
            throw new IOException("closed");
        }
        j(arrayList, i, z);
    }

    public final synchronized void v(int i, long j) {
        if (this.o) {
            throw new IOException("closed");
        }
        if (j == 0 || j > SieveCacheKt.NodeLinkMask) {
            ky0.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        e(i, 4, (byte) 8, (byte) 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }
}
