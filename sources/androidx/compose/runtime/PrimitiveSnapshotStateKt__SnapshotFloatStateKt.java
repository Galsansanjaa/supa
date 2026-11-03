package androidx.compose.runtime;

import defpackage.sa1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, sa1 sa1Var) {
        return floatState.getFloatValue();
    }

    public static final MutableFloatState mutableFloatStateOf(float f) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, sa1 sa1Var, float f) {
        mutableFloatState.setFloatValue(f);
    }
}
