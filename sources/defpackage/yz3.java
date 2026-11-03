package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yz3 extends kx implements Serializable {
    public final MessageDigest C;
    public final int D;
    public final boolean E;
    public final String F;

    public yz3() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.C = messageDigest;
            this.D = messageDigest.getDigestLength();
            this.F = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.E = z;
        } catch (NoSuchAlgorithmException e) {
            qq.e(e);
            throw null;
        }
    }

    public final String toString() {
        return this.F;
    }
}
