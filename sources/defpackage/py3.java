package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class py3 implements Runnable {
    public final long a;
    public final long b;
    public final boolean m;
    public final /* synthetic */ ty3 n;

    public py3(ty3 ty3Var, boolean z) {
        Objects.requireNonNull(ty3Var);
        this.n = ty3Var;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.m = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty3 ty3Var = this.n;
        if (ty3Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            ty3Var.b(e, false, this.m);
            b();
        }
    }
}
