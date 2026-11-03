package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uy0 extends vo1 {
    public final boolean b;
    public final int m;
    public final int n;
    public final /* synthetic */ xy0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(xy0 xy0Var, boolean z, int i, int i2) {
        super("OkHttp %s ping %08x%08x", xy0Var.n, Integer.valueOf(i), Integer.valueOf(i2));
        this.o = xy0Var;
        this.b = z;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.vo1
    public final void a() {
        boolean z;
        xy0 xy0Var = this.o;
        boolean z2 = this.b;
        int i = this.m;
        int i2 = this.n;
        if (!z2) {
            synchronized (xy0Var) {
                z = xy0Var.u;
                xy0Var.u = true;
            }
            if (z) {
                try {
                    xy0Var.a(2, 2);
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
        }
        try {
            try {
                xy0Var.B.l(i, i2, z2);
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            xy0Var.a(2, 2);
        }
    }
}
