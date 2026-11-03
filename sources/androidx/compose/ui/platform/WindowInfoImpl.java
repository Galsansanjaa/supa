package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers;
    private final MutableState<DpSize> _containerDpSize;
    private final MutableState<IntSize> _containerSize;
    private final MutableState isWindowFocused$delegate;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }
    }

    static {
        MutableState<PointerKeyboardModifiers> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m6641boximpl(PointerKeyboardModifiers.m6643constructorimpl$default(0, 1, null)), null, 2, null);
        GlobalKeyboardModifiers = mutableStateOf$default;
    }

    public WindowInfoImpl() {
        MutableState<IntSize> mutableStateOf$default;
        MutableState<DpSize> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m8208boximpl(IntSize.Companion.m8221getZeroYbymL2g()), null, 2, null);
        this._containerSize = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DpSize.m8135boximpl(DpSize.Companion.m8157getZeroMYxV2XQ()), null, 2, null);
        this._containerDpSize = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isWindowFocused$delegate = mutableStateOf$default3;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ */
    public long mo7197getContainerDpSizeMYxV2XQ() {
        return this._containerDpSize.getValue().m8155unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo7198getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m8220unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo7199getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m6648unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerDpSize-EaSLcWc, reason: not valid java name */
    public void m7231setContainerDpSizeEaSLcWc(long j) {
        this._containerDpSize.setValue(DpSize.m8135boximpl(j));
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m7232setContainerSizeozmzZPI(long j) {
        this._containerSize.setValue(IntSize.m8208boximpl(j));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m7233setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m6641boximpl(i));
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }
}
