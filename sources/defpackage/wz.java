package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wz {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public wz(xz xzVar) {
        this.a = xzVar.a;
        this.b = xzVar.c;
        this.c = xzVar.d;
        this.d = xzVar.b;
    }

    public wz(boolean z) {
        this.a = z;
    }

    public final void a(String... strArr) {
        if (!this.a) {
            hu2.h("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.b = (String[]) strArr.clone();
        } else {
            v5.m("At least one cipher suite is required");
        }
    }

    public final void b(String... strArr) {
        if (!this.a) {
            hu2.h("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            v5.m("At least one TLS version is required");
        }
    }
}
