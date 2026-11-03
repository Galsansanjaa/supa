package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bj extends ik0 {
    public final byte[] a;
    public final byte[] b;

    public bj(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ik0) {
            ik0 ik0Var = (ik0) obj;
            boolean z = ik0Var instanceof bj;
            bj bjVar = (bj) ik0Var;
            if (Arrays.equals(this.a, z ? bjVar.a : bjVar.a)) {
                bj bjVar2 = (bj) ik0Var;
                if (Arrays.equals(this.b, z ? bjVar2.b : bjVar2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
