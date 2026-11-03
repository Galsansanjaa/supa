package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xz {
    public static final xz e;
    public static final xz f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        jv[] jvVarArr = {jv.k, jv.m, jv.l, jv.n, jv.p, jv.o, jv.i, jv.j, jv.g, jv.h, jv.e, jv.f, jv.d};
        wz wzVar = new wz(true);
        String[] strArr = new String[13];
        for (int i = 0; i < 13; i++) {
            strArr[i] = jvVarArr[i].a;
        }
        wzVar.a(strArr);
        tr2 tr2Var = tr2.TLS_1_0;
        tr2[] tr2VarArr = {tr2.TLS_1_3, tr2.TLS_1_2, tr2.TLS_1_1, tr2Var};
        boolean z = wzVar.a;
        if (z) {
            String[] strArr2 = new String[tr2VarArr.length];
            for (int i2 = 0; i2 < tr2VarArr.length; i2++) {
                strArr2[i2] = tr2VarArr[i2].a;
            }
            wzVar.b(strArr2);
        } else {
            hu2.h("no TLS versions for cleartext connections");
        }
        if (!z) {
            hu2.h("no TLS extensions for cleartext connections");
            return;
        }
        wzVar.d = true;
        xz xzVar = new xz(wzVar);
        e = xzVar;
        tr2[] tr2VarArr2 = {tr2Var};
        boolean z2 = xzVar.a;
        if (!z2) {
            hu2.h("no TLS versions for cleartext connections");
            return;
        }
        String[] strArr3 = new String[tr2VarArr2.length];
        for (int i3 = 0; i3 < tr2VarArr2.length; i3++) {
            strArr3[i3] = tr2VarArr2[i3].a;
        }
        if (!z2) {
            hu2.h("no TLS versions for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            v5.m("At least one TLS version is required");
        } else if (z2) {
            f = new xz(new wz(false));
        } else {
            hu2.h("no TLS extensions for cleartext connections");
        }
    }

    public xz(wz wzVar) {
        this.a = wzVar.a;
        this.c = wzVar.b;
        this.d = wzVar.c;
        this.b = wzVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !f63.o(f63.f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || f63.o(jv.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xz)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        xz xzVar = (xz) obj;
        boolean z = xzVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, xzVar.c) && Arrays.equals(this.d, xzVar.d) && this.b == xzVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(jv.a(str3));
            }
            str = DesugarCollections.unmodifiableList(arrayList).toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str4 : strArr2) {
                arrayList2.add(tr2.a(str4));
            }
            str2 = DesugarCollections.unmodifiableList(arrayList2).toString();
        }
        return sg3.u(lt.D("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions="), this.b, ")");
    }
}
