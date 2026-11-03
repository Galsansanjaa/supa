package androidx.compose.runtime;

import defpackage.sa1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, sa1 sa1Var) {
        return intState.getIntValue();
    }

    public static final MutableIntState mutableIntStateOf(int i) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, sa1 sa1Var, int i) {
        mutableIntState.setIntValue(i);
    }
}
