package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class cz0 extends ge {
    public final /* synthetic */ dz0 m;

    public cz0(dz0 dz0Var) {
        this.m = dz0Var;
    }

    @Override // defpackage.ge
    public final void j() {
        dz0 dz0Var = this.m;
        if (dz0Var.d(6)) {
            dz0Var.d.m(dz0Var.c, 6);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
