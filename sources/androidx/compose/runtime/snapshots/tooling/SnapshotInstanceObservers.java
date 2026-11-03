package androidx.compose.runtime.snapshots.tooling;

import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final ps0 readObserver;
    private final ps0 writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SnapshotInstanceObservers(ps0 ps0Var, ps0 ps0Var2) {
        this.readObserver = ps0Var;
        this.writeObserver = ps0Var2;
    }

    public /* synthetic */ SnapshotInstanceObservers(ps0 ps0Var, ps0 ps0Var2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : ps0Var, (i & 2) != 0 ? null : ps0Var2);
    }

    public final ps0 getReadObserver() {
        return this.readObserver;
    }

    public final ps0 getWriteObserver() {
        return this.writeObserver;
    }
}
