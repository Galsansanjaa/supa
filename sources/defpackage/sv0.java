package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sv0 extends w20 implements pc0 {
    public final Handler a;
    public final String b;
    public final boolean m;
    public final sv0 n;

    public sv0(Handler handler) {
        this(handler, null, false);
    }

    public sv0(Handler handler, String str, boolean z) {
        this.a = handler;
        this.b = str;
        this.m = z;
        this.n = z ? this : new sv0(handler, str, true);
    }

    @Override // defpackage.w20
    public final void dispatch(j20 j20Var, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        v(j20Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        return sv0Var.a == this.a && sv0Var.m == this.m;
    }

    @Override // defpackage.pc0
    public final void g(long j, qs qsVar) {
        zr0 zr0Var = new zr0(1, qsVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(zr0Var, j)) {
            qsVar.n(new qk0(3, this, zr0Var));
        } else {
            v(qsVar.o, zr0Var);
        }
    }

    public final int hashCode() {
        return (this.m ? 1231 : 1237) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.w20
    public final boolean isDispatchNeeded(j20 j20Var) {
        return (this.m && jh2.k(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    @Override // defpackage.w20
    public final w20 limitedParallelism(int i, String str) {
        np3.j(i);
        return str != null ? new uo1(this, str) : this;
    }

    @Override // defpackage.pc0
    public final re0 n(long j, Runnable runnable, j20 j20Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new rv0(0, this, runnable);
        }
        v(j20Var, runnable);
        return tq1.a;
    }

    @Override // defpackage.w20
    public final String toString() {
        sv0 sv0Var;
        String str;
        bc0 bc0Var = oe0.a;
        sv0 sv0Var2 = wh1.a;
        if (this == sv0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                sv0Var = sv0Var2.n;
            } catch (UnsupportedOperationException unused) {
                sv0Var = null;
            }
            str = this == sv0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.b;
        if (str2 == null) {
            str2 = this.a.toString();
        }
        return this.m ? wa2.q(str2, ".immediate") : str2;
    }

    public final void v(j20 j20Var, Runnable runnable) {
        nb0.l(j20Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        bc0 bc0Var = oe0.a;
        zb0.a.dispatch(j20Var, runnable);
    }
}
