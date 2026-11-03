package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import defpackage.jh2;
import defpackage.lh0;
import defpackage.lt;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotStateListKt {
    private static final Object sync = new Object();

    public static final <T> SnapshotStateList<T> SnapshotStateList(int i, ps0 ps0Var) {
        if (i == 0) {
            return new SnapshotStateList<>();
        }
        PersistentList.Builder builder = ExtensionsKt.persistentListOf().builder();
        for (int i2 = 0; i2 < i; i2++) {
            builder.add(ps0Var.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList<>(builder.build());
    }

    public static final /* synthetic */ Object access$getSync$p() {
        return sync;
    }

    public static final <T> boolean attemptUpdate(StateListStateRecord<T> stateListStateRecord, int i, PersistentList<? extends T> persistentList, boolean z) {
        boolean z2;
        synchronized (sync) {
            try {
                if (stateListStateRecord.getModification$runtime() == i) {
                    stateListStateRecord.setList$runtime(persistentList);
                    z2 = true;
                    if (z) {
                        stateListStateRecord.setStructuralChange$runtime(stateListStateRecord.getStructuralChange$runtime() + 1);
                    }
                    stateListStateRecord.setModification$runtime(stateListStateRecord.getModification$runtime() + 1);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final <T> void clearImpl(SnapshotStateList<T> snapshotStateList) {
        Snapshot current;
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, snapshotStateList, current);
            synchronized (sync) {
                stateListStateRecord2.setList$runtime(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime(stateListStateRecord2.getModification$runtime() + 1);
                stateListStateRecord2.setStructuralChange$runtime(stateListStateRecord2.getStructuralChange$runtime() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, snapshotStateList);
    }

    public static final <T> boolean conditionalUpdate(SnapshotStateList<T> snapshotStateList, boolean z, ps0 ps0Var) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) ps0Var.invoke(list$runtime);
            if (jh2.k(persistentList, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return true;
    }

    public static boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z, ps0 ps0Var, int i, Object obj) {
        int modification$runtime;
        PersistentList list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) ps0Var.invoke(list$runtime);
            if (jh2.k(persistentList, list$runtime)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return true;
    }

    public static final <T> StateListStateRecord<T> getReadable(SnapshotStateList<T> snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, snapshotStateList);
    }

    public static /* synthetic */ void getReadable$annotations(SnapshotStateList snapshotStateList) {
    }

    public static final <T> int getStructure(SnapshotStateList<T> snapshotStateList) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime();
    }

    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <R, T> R mutate(SnapshotStateList<T> snapshotStateList, ps0 ps0Var) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        R r;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            r = (R) ps0Var.invoke(builder);
            PersistentList<T> build = builder.build();
            if (jh2.k(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return r;
    }

    public static final <T> boolean mutateBoolean(SnapshotStateList<T> snapshotStateList, ps0 ps0Var) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Object invoke;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList.Builder<T> builder = list$runtime.builder();
            invoke = ps0Var.invoke(builder);
            PersistentList<T> build = builder.build();
            if (jh2.k(build, list$runtime)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, build, true);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public static final <T> StateRecord stateRecordWith(SnapshotStateList<T> snapshotStateList, PersistentList<? extends T> persistentList) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(currentSnapshot.getSnapshotId(), persistentList);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentList));
        }
        return stateListStateRecord;
    }

    public static final <T> void update(SnapshotStateList<T> snapshotStateList, boolean z, ps0 ps0Var) {
        int modification$runtime;
        PersistentList<T> list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) ps0Var.invoke(list$runtime);
            if (jh2.k(persistentList, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
    }

    public static void update$default(SnapshotStateList snapshotStateList, boolean z, ps0 ps0Var, int i, Object obj) {
        int modification$runtime;
        PersistentList list$runtime;
        Snapshot current;
        boolean attemptUpdate;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (sync) {
                StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                firstStateRecord.getClass();
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime = stateListStateRecord.getModification$runtime();
                list$runtime = stateListStateRecord.getList$runtime();
            }
            list$runtime.getClass();
            PersistentList persistentList = (PersistentList) ps0Var.invoke(list$runtime);
            if (jh2.k(persistentList, list$runtime)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            firstStateRecord2.getClass();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime, persistentList, z);
            }
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!attemptUpdate);
    }

    public static final void validateRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            lh0.f(lt.x("index (", i, ") is out of bound of [0, ", i2, ")"));
        }
    }

    public static final <R, T> R withCurrent(SnapshotStateList<T> snapshotStateList, ps0 ps0Var) {
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        return (R) ps0Var.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    public static final <R, T> R writable(SnapshotStateList<T> snapshotStateList, ps0 ps0Var) {
        Snapshot current;
        R r;
        StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
        firstStateRecord.getClass();
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            r = (R) ps0Var.invoke(SnapshotKt.writableRecord(stateListStateRecord, snapshotStateList, current));
        }
        SnapshotKt.notifyWrite(current, snapshotStateList);
        return r;
    }
}
