package defpackage;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qm2 extends Writer {
    public final StringBuilder a;
    public final pm2 b = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [pm2, java.lang.Object] */
    public qm2(StringBuilder sb) {
        this.a = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CharSequence charSequence = this.a;
        if (charSequence instanceof Closeable) {
            ((Closeable) charSequence).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        CharSequence charSequence = this.a;
        if (charSequence instanceof Flushable) {
            ((Flushable) charSequence).flush();
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.a.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        Objects.requireNonNull(str);
        this.a.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        pm2 pm2Var = this.b;
        pm2Var.a = cArr;
        pm2Var.b = null;
        this.a.append((CharSequence) pm2Var, i, i2 + i);
    }
}
