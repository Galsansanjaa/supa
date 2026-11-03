package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class db2 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ db2(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    ea0.w("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                return;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
