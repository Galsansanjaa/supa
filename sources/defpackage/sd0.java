package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sd0 {
    public final long a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public sd0(long j, long j2, int i, boolean z, boolean z2, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        sd0 sd0Var = (sd0) obj;
        return this.a == sd0Var.a && this.b == sd0Var.b && this.c == sd0Var.c && this.d == sd0Var.d && this.e == sd0Var.e && this.f == sd0Var.f;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f;
    }

    public final String toString() {
        return "DeviceStatus(id=" + this.a + ", timestamp=" + this.b + ", batteryLevel=" + this.c + ", isCharging=" + this.d + ", isWifiConnected=" + this.e + ", uploadSpeedKbps=" + this.f + ")";
    }
}
