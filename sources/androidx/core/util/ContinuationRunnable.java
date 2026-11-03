package androidx.core.util;

import defpackage.a10;
import defpackage.vy2;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final a10 continuation;

    public ContinuationRunnable(a10 a10Var) {
        super(false);
        this.continuation = a10Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(vy2.a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
