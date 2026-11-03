package androidx.compose.foundation.style;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableStateFlagSet implements StateObject {
    public static final int $stable = 8;
    private FlagStateStateRecord next;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class FlagStateStateRecord extends StateRecord {
        private int value;

        public FlagStateStateRecord(long j, int i) {
            super(j);
            this.value = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            this.value = ((FlagStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(Snapshot.Companion.getCurrent().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j) {
            return new FlagStateStateRecord(j, this.value);
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }
    }

    public MutableStateFlagSet(int i) {
        this.next = new FlagStateStateRecord(Snapshot.Companion.getCurrent().getSnapshotId(), i);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    public final boolean getFlag(int i) {
        return (getFlags() & i) != 0;
    }

    public final int getFlags() {
        return ((FlagStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.next = (FlagStateStateRecord) stateRecord;
    }

    public final void updateFlag(int i, boolean z) {
        updateFlags(i, z ? i : 0);
    }

    public final void updateFlags(int i, int i2) {
        Snapshot current;
        int value = ((FlagStateStateRecord) SnapshotKt.current(this.next)).getValue();
        int i3 = ((~i) & value) | i2;
        if (value != i3) {
            FlagStateStateRecord flagStateStateRecord = this.next;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((FlagStateStateRecord) SnapshotKt.writableRecord(flagStateStateRecord, this, current)).setValue(i3);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }
}
