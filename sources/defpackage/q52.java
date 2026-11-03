package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class q52 extends r52 {
    public final int a;
    public final Integer b;
    public final String c;
    public final boolean d;

    public q52(int i, Integer num, String str, boolean z) {
        this.a = i;
        this.b = num;
        this.c = str;
        this.d = z;
    }

    public final String toString() {
        return "Rejected(httpStatus=" + this.a + ", errorCode=" + this.b + ", message=" + this.c + ", willRetry=" + this.d + ')';
    }
}
