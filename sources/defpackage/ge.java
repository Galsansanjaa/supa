package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class ge extends or2 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static ge l;
    public boolean e;
    public ge f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        i = newCondition;
        j = 60000L;
        k = 60000000000L;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ge] */
    public final void h() {
        long c;
        ge geVar;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new Object();
                    de deVar = new de("Okio Watchdog");
                    deVar.setDaemon(true);
                    deVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    c = Math.min(j2, c() - nanoTime) + nanoTime;
                    this.g = c;
                } else if (j2 != 0) {
                    c = j2 + nanoTime;
                    this.g = c;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    c = c();
                    this.g = c;
                }
                long j3 = c - nanoTime;
                ge geVar2 = l;
                geVar2.getClass();
                while (true) {
                    geVar = geVar2.f;
                    if (geVar == null || j3 < geVar.g - nanoTime) {
                        break;
                    } else {
                        geVar2 = geVar;
                    }
                }
                this.f = geVar;
                geVar2.f = this;
                if (geVar2 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            ge geVar = l;
            while (geVar != null) {
                ge geVar2 = geVar.f;
                if (geVar2 == this) {
                    geVar.f = this.f;
                    this.f = null;
                    return false;
                }
                geVar = geVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
