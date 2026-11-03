package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.Thread_jvmKt;
import defpackage.f31;
import defpackage.hd0;
import defpackage.hu2;
import defpackage.kw;
import defpackage.mk2;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        public static /* synthetic */ Object observe$default(Companion companion, ps0 ps0Var, ps0 ps0Var2, os0 os0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ps0Var = null;
            }
            if ((i & 2) != 0) {
                ps0Var2 = null;
            }
            return companion.observe(ps0Var, ps0Var2, os0Var);
        }

        public static Object observeInternal$runtime$default(Companion companion, ps0 ps0Var, ps0 ps0Var2, os0 os0Var, int i, Object obj) {
            Snapshot transparentObserverMutableSnapshot;
            ps0 ps0Var3 = (i & 1) != 0 ? null : ps0Var;
            ps0 ps0Var4 = (i & 2) != 0 ? null : ps0Var2;
            if (ps0Var3 == null && ps0Var4 == null) {
                return os0Var.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ps0 readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ps0 writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(ps0Var3, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(ps0Var4, writeObserver$runtime));
                        return os0Var.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, ps0Var3, ps0Var4, true, false);
            } else {
                if (ps0Var3 == null) {
                    return os0Var.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(ps0Var3);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    Object invoke = os0Var.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return invoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$1(ts0 ts0Var) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(kw.A0(SnapshotKt.access$getApplyObservers$p(), ts0Var));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$1(ps0 ps0Var) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(kw.A0(SnapshotKt.access$getGlobalWriteObservers$p(), ps0Var));
            }
            SnapshotKt.access$advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, ps0 ps0Var, ps0 ps0Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                ps0Var = null;
            }
            if ((i & 2) != 0) {
                ps0Var2 = null;
            }
            return companion.takeMutableSnapshot(ps0Var, ps0Var2);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, ps0 ps0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ps0Var = null;
            }
            return companion.takeSnapshot(ps0Var);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.access$getThreadSnapshot$p().get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        }

        public final <T> T global(os0 os0Var) {
            Snapshot removeCurrent = removeCurrent();
            try {
                return (T) os0Var.invoke();
            } finally {
                restoreCurrent(removeCurrent);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.access$getPendingApplyObserverCount$p().get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.access$getThreadSnapshot$p().get() != null;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver$runtime(null);
                    return snapshot;
                }
            }
            Snapshot createTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            createTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return createTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
        }

        public final <T> T observe(ps0 ps0Var, ps0 ps0Var2, os0 os0Var) {
            Snapshot transparentObserverMutableSnapshot;
            if (ps0Var == null && ps0Var2 == null) {
                return (T) os0Var.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ps0 readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ps0 writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(ps0Var, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(ps0Var2, writeObserver$runtime));
                        return (T) os0Var.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, ps0Var, ps0Var2, true, false);
            } else {
                if (ps0Var == null) {
                    return (T) os0Var.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(ps0Var);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t = (T) os0Var.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        public final <T> T observeInternal$runtime(ps0 ps0Var, ps0 ps0Var2, os0 os0Var) {
            Snapshot transparentObserverMutableSnapshot;
            if (ps0Var == null && ps0Var2 == null) {
                return (T) os0Var.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime() == Thread_jvmKt.currentThreadId()) {
                    ps0 readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    ps0 writeObserver$runtime = transparentObserverMutableSnapshot2.getWriteObserver$runtime();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(ps0Var, readObserver, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(SnapshotKt.mergedWriteObserver(ps0Var2, writeObserver$runtime));
                        return (T) os0Var.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver$runtime);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, ps0Var, ps0Var2, true, false);
            } else {
                if (ps0Var == null) {
                    return (T) os0Var.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(ps0Var);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t = (T) os0Var.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        public final int openSnapshotCount() {
            return kw.L0(SnapshotKt.access$getOpenSnapshots$p()).size();
        }

        public final ObserverHandle registerApplyObserver(ts0 ts0Var) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(kw.C0(SnapshotKt.access$getApplyObservers$p(), ts0Var));
            }
            return new mk2(ts0Var, 0);
        }

        public final ObserverHandle registerGlobalWriteObserver(ps0 ps0Var) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(kw.C0(SnapshotKt.access$getGlobalWriteObservers$p(), ps0Var));
            }
            SnapshotKt.access$advanceGlobalSnapshot();
            return new mk2(ps0Var, 1);
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
            }
        }

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, ps0 ps0Var) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(ps0Var);
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).setReadObserver$runtime(ps0Var);
            } else {
                f31.d(snapshot, "Non-transparent snapshot was reused: ");
            }
        }

        public final void sendApplyNotifications() {
            boolean hasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                hasPendingChanges = SnapshotKt.access$getGlobalSnapshot$p().hasPendingChanges();
            }
            if (hasPendingChanges) {
                SnapshotKt.access$advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(ps0 ps0Var, ps0 ps0Var2) {
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(ps0Var, ps0Var2)) != null) {
                return takeNestedMutableSnapshot;
            }
            hu2.h("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }

        public final Snapshot takeSnapshot(ps0 ps0Var) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(ps0Var);
        }

        public final <R> R withMutableSnapshot(os0 os0Var) {
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    R r = (R) os0Var.invoke();
                    takeMutableSnapshot$default.apply().check();
                    return r;
                } finally {
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    takeMutableSnapshot$default.dispose();
                }
            }
        }

        public final <T> T withoutReadObservation(os0 os0Var) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            ps0 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) os0Var.invoke();
            } finally {
                restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    @hd0
    private /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i), snapshotIdSet, (sb0) null);
    }

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, sb0 sb0Var) {
        this(i, snapshotIdSet);
    }

    private Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        this.pinningTrackingHandle = j != SnapshotKt.access$getINVALID_SNAPSHOT$p() ? SnapshotKt.trackPinning(j, getInvalid$runtime()) : -1;
    }

    public /* synthetic */ Snapshot(long j, SnapshotIdSet snapshotIdSet, sb0 sb0Var) {
        this(j, snapshotIdSet);
    }

    @hd0
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, ps0 ps0Var, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
            return null;
        }
        if ((i & 1) != 0) {
            ps0Var = null;
        }
        return snapshot.takeNestedSnapshot(ps0Var);
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
        }
    }

    public void closeLocked$runtime() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getSnapshotId()));
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
    }

    public final <T> T enter(os0 os0Var) {
        Snapshot makeCurrent = makeCurrent();
        try {
            return (T) os0Var.invoke();
        } finally {
            restoreCurrent(makeCurrent);
        }
    }

    public final boolean getDisposed$runtime() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public SnapshotIdSet getInvalid$runtime() {
        return this.invalid;
    }

    public abstract MutableScatterSet<StateObject> getModified$runtime();

    public abstract ps0 getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime() {
        return 0;
    }

    public abstract ps0 getWriteObserver$runtime();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime() {
        return this.pinningTrackingHandle >= 0;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime */
    public abstract void mo4773nestedActivated$runtime(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime */
    public abstract void mo4774nestedDeactivated$runtime(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime();

    /* renamed from: recordModified$runtime */
    public abstract void mo4775recordModified$runtime(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
    }

    public final void setDisposed$runtime(boolean z) {
        this.disposed = z;
    }

    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public void setWriteCount$runtime(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(ps0 ps0Var);

    public final int takeoverPinnedSnapshot$runtime() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot snapshot) {
        if (!(SnapshotKt.access$getThreadSnapshot$p().get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final void validateNotDisposed$runtime() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }
}
