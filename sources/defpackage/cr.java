package defpackage;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface cr extends nj2, WritableByteChannel {
    cr f(String str);

    @Override // defpackage.nj2, java.io.Flushable
    void flush();

    cr p(long j);

    OutputStream s();

    cr write(byte[] bArr);

    cr writeByte(int i);

    cr writeInt(int i);

    cr writeShort(int i);
}
