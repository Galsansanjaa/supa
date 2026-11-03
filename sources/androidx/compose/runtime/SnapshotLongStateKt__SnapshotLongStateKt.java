package androidx.compose.runtime;

import defpackage.sa1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, sa1 sa1Var) {
        return longState.getLongValue();
    }

    public static final MutableLongState mutableLongStateOf(long j) {
        return SnapshotLongState_androidKt.createSnapshotMutableLongState(j);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, sa1 sa1Var, long j) {
        mutableLongState.setLongValue(j);
    }
}
