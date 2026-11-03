package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bk extends mu2 {
    public final String a;
    public final byte[] b;
    public final gz1 c;

    public bk(String str, byte[] bArr, gz1 gz1Var) {
        this.a = str;
        this.b = bArr;
        this.c = gz1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mu2) {
            mu2 mu2Var = (mu2) obj;
            bk bkVar = (bk) mu2Var;
            if (this.a.equals(bkVar.a)) {
                if (Arrays.equals(this.b, mu2Var instanceof bk ? ((bk) mu2Var).b : bkVar.b) && this.c.equals(bkVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
