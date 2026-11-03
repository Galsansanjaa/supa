package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sq extends OutputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;

    public /* synthetic */ sq(cr crVar, int i) {
        this.a = i;
        this.b = crVar;
    }

    private final void a() {
    }

    private final void d() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((y32) this.b).close();
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                return;
            default:
                y32 y32Var = (y32) this.b;
                if (y32Var.m) {
                    return;
                }
                y32Var.flush();
                return;
        }
    }

    public final String toString() {
        int i = this.a;
        cr crVar = this.b;
        switch (i) {
            case 0:
                return ((tq) crVar) + ".outputStream()";
            default:
                return ((y32) crVar) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
        cr crVar = this.b;
        switch (i2) {
            case 0:
                ((tq) crVar).A(i);
                return;
            default:
                y32 y32Var = (y32) crVar;
                if (y32Var.m) {
                    hu2.p("closed");
                    return;
                } else {
                    y32Var.b.A((byte) i);
                    y32Var.a();
                    return;
                }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        cr crVar = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((tq) crVar).write(bArr, i, i2);
                return;
            default:
                y32 y32Var = (y32) crVar;
                if (y32Var.m) {
                    hu2.p("closed");
                    return;
                } else {
                    y32Var.b.write(bArr, i, i2);
                    y32Var.a();
                    return;
                }
        }
    }
}
