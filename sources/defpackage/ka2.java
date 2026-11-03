package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ka2 {
    public final i2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ka2(i2 i2Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            hu2.q("inetSocketAddress == null");
            throw null;
        }
        this.a = i2Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ka2)) {
            return false;
        }
        ka2 ka2Var = (ka2) obj;
        return ka2Var.a.equals(this.a) && ka2Var.b.equals(this.b) && ka2Var.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
