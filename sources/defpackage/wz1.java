package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wz1 extends Exception {
    public static final /* synthetic */ int m = 0;
    public final int a;
    public final String b;

    public wz1(int i, String str) {
        super(str);
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz1)) {
            return false;
        }
        wz1 wz1Var = (wz1) obj;
        return this.a == wz1Var.a && this.b.equals(wz1Var.b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ProgramException(statusCode=" + this.a + ", message=" + this.b + ")";
    }
}
