package defpackage;

import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i2 {
    public final jz0 a;
    public final jw0 b;
    public final SocketFactory c;
    public final jw0 d;
    public final List e;
    public final List f;
    public final ProxySelector g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final tt j;

    public i2(String str, int i, jw0 jw0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, is1 is1Var, tt ttVar, jw0 jw0Var2, List list, List list2, ProxySelector proxySelector) {
        iz0 iz0Var = new iz0();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            iz0Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                v5.m("unexpected scheme: ".concat(str2));
                throw null;
            }
            iz0Var.a = "https";
        }
        if (str == null) {
            hu2.q("host == null");
            throw null;
        }
        String b = f63.b(jz0.h(str, 0, str.length(), false));
        if (b == null) {
            v5.m("unexpected host: ".concat(str));
            throw null;
        }
        iz0Var.d = b;
        if (i <= 0 || i > 65535) {
            v5.m(lt.w(i, "unexpected port: "));
            throw null;
        }
        iz0Var.e = i;
        this.a = iz0Var.a();
        if (jw0Var == null) {
            hu2.q("dns == null");
            throw null;
        }
        this.b = jw0Var;
        if (socketFactory == null) {
            hu2.q("socketFactory == null");
            throw null;
        }
        this.c = socketFactory;
        if (jw0Var2 == null) {
            hu2.q("proxyAuthenticator == null");
            throw null;
        }
        this.d = jw0Var2;
        if (list == null) {
            hu2.q("protocols == null");
            throw null;
        }
        this.e = f63.k(list);
        if (list2 == null) {
            hu2.q("connectionSpecs == null");
            throw null;
        }
        this.f = f63.k(list2);
        if (proxySelector == null) {
            hu2.q("proxySelector == null");
            throw null;
        }
        this.g = proxySelector;
        this.h = sSLSocketFactory;
        this.i = is1Var;
        this.j = ttVar;
    }

    public final boolean a(i2 i2Var) {
        return this.b.equals(i2Var.b) && this.d.equals(i2Var.d) && this.e.equals(i2Var.e) && this.f.equals(i2Var.f) && this.g.equals(i2Var.g) && f63.i(null, null) && f63.i(this.h, i2Var.h) && f63.i(this.i, i2Var.i) && f63.i(this.j, i2Var.j) && this.a.e == i2Var.a.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.a.equals(i2Var.a) && a(i2Var);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + k93.j(527, 31, this.a.i)) * 31)) * 31)) * 31)) * 31)) * 961;
        SSLSocketFactory sSLSocketFactory = this.h;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        tt ttVar = this.j;
        return hashCode3 + (ttVar != null ? ttVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        jz0 jz0Var = this.a;
        sb.append(jz0Var.d);
        sb.append(":");
        sb.append(jz0Var.e);
        sb.append(", proxySelector=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
