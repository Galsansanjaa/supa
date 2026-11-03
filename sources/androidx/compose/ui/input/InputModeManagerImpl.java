package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 8;
    private final MutableState inputMode$delegate;
    private final InputModeChangeRequester onRequestInputModeChange;

    private InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester) {
        MutableState mutableStateOf$default;
        this.onRequestInputModeChange = inputModeChangeRequester;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m6074boximpl(i), null, 2, null);
        this.inputMode$delegate = mutableStateOf$default;
    }

    public /* synthetic */ InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester, sb0 sb0Var) {
        this(i, inputModeChangeRequester);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo6084getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m6080unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo6085requestInputModeiuPiT84(int i) {
        return this.onRequestInputModeChange.mo6083requestiuPiT84(i);
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m6086setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m6074boximpl(i));
    }
}
