package androidx.compose.runtime;

import defpackage.sa1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, sa1 sa1Var) {
        return doubleState.getDoubleValue();
    }

    public static final MutableDoubleState mutableDoubleStateOf(double d) {
        return SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, sa1 sa1Var, double d) {
        mutableDoubleState.setDoubleValue(d);
    }
}
