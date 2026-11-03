package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class k extends i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new i(this.c);
    }

    @Override // j$.util.i, java.util.List
    public final java.util.List subList(int i, int i2) {
        i iVar;
        synchronized (this.b) {
            iVar = new i(this.c.subList(i, i2), this.b);
        }
        return iVar;
    }
}
