package androidx.compose.runtime.snapshots;

import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @hd0
    public StateRecord(int i) {
        this(SnapshotId_jvmKt.toSnapshotId(i));
    }

    public StateRecord(long j) {
        this.snapshotId = j;
    }

    public abstract void assign(StateRecord stateRecord);

    public abstract StateRecord create();

    @hd0
    public /* synthetic */ StateRecord create(int i) {
        StateRecord create = create();
        create.snapshotId = SnapshotId_jvmKt.toSnapshotId(i);
        return create;
    }

    public StateRecord create(long j) {
        StateRecord create = create();
        create.snapshotId = j;
        return create;
    }

    public final StateRecord getNext$runtime() {
        return this.next;
    }

    public final long getSnapshotId$runtime() {
        return this.snapshotId;
    }

    public final void setNext$runtime(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }
}
