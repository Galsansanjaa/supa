package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TargetData {
    public static final int $stable = 0;
    private final MutableState currentMfrOffset$delegate;
    private final MutableState initialMfrOffset$delegate;
    private final MutableState size$delegate;
    private final MutableState targetStructuralOffset$delegate;

    private TargetData(long j, long j2, long j3) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m5147boximpl(j), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m5079boximpl(j2), null, 2, null);
        this.initialMfrOffset$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m5079boximpl(j3), null, 2, null);
        this.targetStructuralOffset$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m5079boximpl(j2), null, 2, null);
        this.currentMfrOffset$delegate = mutableStateOf$default4;
    }

    public /* synthetic */ TargetData(long j, long j2, long j3, sb0 sb0Var) {
        this(j, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m195getCurrentMfrOffsetF1C5BW0() {
        return ((Offset) this.currentMfrOffset$delegate.getValue()).m5100unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInitialMfrOffset-F1C5BW0, reason: not valid java name */
    public final long m196getInitialMfrOffsetF1C5BW0() {
        return ((Offset) this.initialMfrOffset$delegate.getValue()).m5100unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m197getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m5164unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTargetStructuralOffset-F1C5BW0, reason: not valid java name */
    public final long m198getTargetStructuralOffsetF1C5BW0() {
        return ((Offset) this.targetStructuralOffset$delegate.getValue()).m5100unboximpl();
    }

    /* renamed from: setCurrentMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m199setCurrentMfrOffsetk4lQ0M(long j) {
        this.currentMfrOffset$delegate.setValue(Offset.m5079boximpl(j));
    }

    /* renamed from: setInitialMfrOffset-k-4lQ0M, reason: not valid java name */
    public final void m200setInitialMfrOffsetk4lQ0M(long j) {
        this.initialMfrOffset$delegate.setValue(Offset.m5079boximpl(j));
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m201setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m5147boximpl(j));
    }

    /* renamed from: setTargetStructuralOffset-k-4lQ0M, reason: not valid java name */
    public final void m202setTargetStructuralOffsetk4lQ0M(long j) {
        this.targetStructuralOffset$delegate.setValue(Offset.m5079boximpl(j));
    }
}
