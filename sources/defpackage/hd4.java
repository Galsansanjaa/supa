package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hd4 {
    public int a;
    public final int b;
    public hd4 c;
    public final HashMap d = new HashMap(0);

    public hd4(int i, int i2) {
        if (i > i2) {
            z72.k();
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return wa2.u(new StringBuilder(String.valueOf(identityHashCode).length() + 4), "Node", identityHashCode);
    }
}
