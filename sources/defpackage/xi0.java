package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xi0 {
    public final bj0 a;
    public final byte[] b;

    public xi0(bj0 bj0Var, byte[] bArr) {
        if (bj0Var == null) {
            hu2.q("encoding is null");
            throw null;
        }
        if (bArr == null) {
            hu2.q("bytes is null");
            throw null;
        }
        this.a = bj0Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        if (this.a.equals(xi0Var.a)) {
            return Arrays.equals(this.b, xi0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
