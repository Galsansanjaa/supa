package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class do3 implements Closeable {
    public static final to b = new to(4);
    public int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            qq.e("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
