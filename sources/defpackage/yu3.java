package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yu3 extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch m = new CountDownLatch(1);
    public boolean n = false;

    public yu3(t3 t3Var, long j) {
        this.a = new WeakReference(t3Var);
        this.b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        t3 t3Var;
        WeakReference weakReference = this.a;
        try {
            if (this.m.await(this.b, TimeUnit.MILLISECONDS) || (t3Var = (t3) weakReference.get()) == null) {
                return;
            }
            t3Var.b();
            this.n = true;
        } catch (InterruptedException unused) {
            t3 t3Var2 = (t3) weakReference.get();
            if (t3Var2 != null) {
                t3Var2.b();
                this.n = true;
            }
        }
    }
}
