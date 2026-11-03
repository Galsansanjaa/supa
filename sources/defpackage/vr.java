package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vr extends v72 {
    public final de0 a;
    public final z32 b;
    public final String m;

    public vr(de0 de0Var, String str) {
        this.a = de0Var;
        this.m = str;
        this.b = new z32(new ur(de0Var.m[1], de0Var));
    }

    @Override // defpackage.v72
    public final long a() {
        try {
            String str = this.m;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.v72
    public final dr d() {
        return this.b;
    }
}
