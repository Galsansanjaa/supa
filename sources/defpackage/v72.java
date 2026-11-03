package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class v72 implements Closeable {
    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f63.c(d());
    }

    public abstract dr d();
}
