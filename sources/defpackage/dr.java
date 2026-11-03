package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface dr extends uk2, ReadableByteChannel {
    String c(long j);

    String h();

    void i(long j);

    nr k(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    long t();

    InputStream u();
}
