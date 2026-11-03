package androidx.compose.runtime.snapshots;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    private final Snapshot snapshot;

    public SnapshotApplyConflictException(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
