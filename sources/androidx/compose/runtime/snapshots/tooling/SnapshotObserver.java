package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SnapshotObserver {
    void onApplied(Snapshot snapshot, Set<? extends Object> set);

    void onCreated(Snapshot snapshot, Snapshot snapshot2, SnapshotInstanceObservers snapshotInstanceObservers);

    SnapshotInstanceObservers onPreCreate(Snapshot snapshot, boolean z);

    void onPreDispose(Snapshot snapshot);
}
