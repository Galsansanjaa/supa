package defpackage;

import android.util.Base64;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class mu2 {
    public final bk a(gz1 gz1Var) {
        bk bkVar = (bk) this;
        String str = bkVar.a;
        if (str == null) {
            hu2.q("Null backendName");
            return null;
        }
        if (gz1Var != null) {
            return new bk(str, bkVar.b, gz1Var);
        }
        hu2.q("Null priority");
        return null;
    }

    public final String toString() {
        bk bkVar = (bk) this;
        byte[] bArr = bkVar.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(bkVar.a);
        sb.append(", ");
        sb.append(bkVar.c);
        sb.append(", ");
        return wa2.v(sb, encodeToString, ")");
    }
}
