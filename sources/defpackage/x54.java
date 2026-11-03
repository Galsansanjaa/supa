package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class x54 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b54 b;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ m64 o;

    public /* synthetic */ x54(m64 m64Var, b54 b54Var, long j, boolean z, int i) {
        this.a = i;
        this.b = b54Var;
        this.m = j;
        this.n = z;
        this.o = m64Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.m;
        boolean z = this.n;
        b54 b54Var = this.b;
        m64 m64Var = this.o;
        switch (i) {
            case 0:
                m64Var.S(b54Var);
                m64Var.I(b54Var, j, z);
                return;
            default:
                m64Var.S(b54Var);
                m64Var.I(b54Var, j, z);
                return;
        }
    }
}
