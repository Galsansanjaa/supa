package androidx.compose.foundation.text.input;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TrackedRange<T> {
    public static final int $stable = 8;
    private final Object creatorId;
    private long intervalHandle;

    private TrackedRange(Object obj, long j) {
        this.creatorId = obj;
        this.intervalHandle = j;
    }

    public /* synthetic */ TrackedRange(Object obj, long j, sb0 sb0Var) {
        this(obj, j);
    }

    public final Object getCreatorId$foundation() {
        return this.creatorId;
    }

    /* renamed from: getIntervalHandle-mo69AQQ$foundation, reason: not valid java name */
    public final long m1771getIntervalHandlemo69AQQ$foundation() {
        return this.intervalHandle;
    }

    /* renamed from: setIntervalHandle-NDTVn_k$foundation, reason: not valid java name */
    public final void m1772setIntervalHandleNDTVn_k$foundation(long j) {
        this.intervalHandle = j;
    }
}
