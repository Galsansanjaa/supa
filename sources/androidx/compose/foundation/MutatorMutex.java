package androidx.compose.foundation;

import defpackage.a10;
import defpackage.ea0;
import defpackage.nm1;
import defpackage.os0;
import defpackage.ps0;
import defpackage.r71;
import defpackage.sm1;
import defpackage.ts0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final nm1 mutex = new sm1();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Mutator {
        private final r71 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, r71 r71Var) {
            this.priority = mutatePriority;
            this.job = r71Var;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel(new MutationInterruptedException());
        }

        public final r71 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, ps0 ps0Var, a10 a10Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, ps0Var, a10Var);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, ts0Var, a10Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        while (true) {
            Mutator mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference<Mutator> atomicReference = this.currentMutator;
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.cancel();
                return;
            }
            return;
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, ps0 ps0Var, a10 a10Var) {
        return ea0.u(new MutatorMutex$mutate$2(mutatePriority, this, ps0Var, null), a10Var);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        return ea0.u(new MutatorMutex$mutateWith$2(mutatePriority, this, ts0Var, t, null), a10Var);
    }

    public final boolean tryLock() {
        return this.mutex.tryLock(null);
    }

    public final boolean tryMutate(os0 os0Var) {
        boolean tryLock = tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            os0Var.invoke();
            return tryLock;
        } finally {
            unlock();
        }
    }

    public final void unlock() {
        this.mutex.unlock(null);
    }
}
