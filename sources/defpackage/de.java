package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class de extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ de(Runnable runnable) {
        super(runnable);
    }

    public /* synthetic */ de(String str) {
        super(str);
    }

    public /* synthetic */ de(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        ge g;
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = ge.h;
                reentrantLock.lock();
                try {
                    g = t61.g();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
            if (g == ge.l) {
                ge.l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (g != null) {
                    g.j();
                }
            }
        }
    }
}
