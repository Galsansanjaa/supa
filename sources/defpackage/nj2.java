package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface nj2 extends Closeable, Flushable {
    or2 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void o(tq tqVar, long j);
}
