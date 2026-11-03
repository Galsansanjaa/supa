package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kj extends wf1 {
    public final long a;
    public final Integer b;
    public final tx c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final bq1 h;
    public final ik0 i;

    public kj(long j, Integer num, tx txVar, long j2, byte[] bArr, String str, long j3, bq1 bq1Var, ik0 ik0Var) {
        this.a = j;
        this.b = num;
        this.c = txVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = bq1Var;
        this.i = ik0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wf1) {
            wf1 wf1Var = (wf1) obj;
            kj kjVar = (kj) wf1Var;
            if (this.a == kjVar.a) {
                Integer num = kjVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    tx txVar = kjVar.c;
                    tx txVar2 = this.c;
                    if (txVar2 != null ? txVar2.equals(txVar) : txVar == null) {
                        if (this.d == kjVar.d) {
                            if (Arrays.equals(this.e, wf1Var instanceof kj ? ((kj) wf1Var).e : kjVar.e)) {
                                String str = kjVar.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == kjVar.g) {
                                        bq1 bq1Var = kjVar.h;
                                        bq1 bq1Var2 = this.h;
                                        if (bq1Var2 != null ? bq1Var2.equals(bq1Var) : bq1Var == null) {
                                            ik0 ik0Var = kjVar.i;
                                            ik0 ik0Var2 = this.i;
                                            if (ik0Var2 != null ? ik0Var2.equals(ik0Var) : ik0Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        tx txVar = this.c;
        int hashCode2 = (hashCode ^ (txVar == null ? 0 : txVar.hashCode())) * 1000003;
        long j2 = this.d;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        bq1 bq1Var = this.h;
        int hashCode5 = (i2 ^ (bq1Var == null ? 0 : bq1Var.hashCode())) * 1000003;
        ik0 ik0Var = this.i;
        return hashCode5 ^ (ik0Var != null ? ik0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
