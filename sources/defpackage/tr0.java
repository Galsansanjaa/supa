package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tr0 extends ar0 {
    public final se1 s;

    public tr0(se1 se1Var) {
        this.s = se1Var;
    }

    @Override // defpackage.k0, defpackage.se1
    public final void addListener(Runnable runnable, Executor executor) {
        this.s.addListener(runnable, executor);
    }

    @Override // defpackage.k0, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.s.cancel(z);
    }

    @Override // defpackage.k0, java.util.concurrent.Future
    public final Object get() {
        return this.s.get();
    }

    @Override // defpackage.k0, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.s.get(j, timeUnit);
    }

    @Override // defpackage.k0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.s.isCancelled();
    }

    @Override // defpackage.k0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.s.isDone();
    }

    @Override // defpackage.k0
    public final String toString() {
        return this.s.toString();
    }
}
