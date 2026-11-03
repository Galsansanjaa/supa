package androidx.compose.foundation.style;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PredefinedToggleStateKey extends StyleStateKey<ToggleableState> implements PredefinedKey {
    public static final PredefinedToggleStateKey INSTANCE = new PredefinedToggleStateKey();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PredefinedToggleStateKey() {
        super(ToggleableState.Off);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.style.StyleStateKey
    public ToggleableState getValueFrom$foundation(MutableStyleState mutableStyleState) {
        int flags = mutableStyleState.getPredefinedState$foundation().getFlags() & 96;
        return flags != 0 ? flags != 32 ? ToggleableState.Indeterminate : ToggleableState.On : ToggleableState.Off;
    }

    @Override // androidx.compose.foundation.style.StyleStateKey
    public void setValueTo$foundation(ToggleableState toggleableState, MutableStyleState mutableStyleState) {
        MutableStateFlagSet predefinedState$foundation = mutableStyleState.getPredefinedState$foundation();
        int i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
        predefinedState$foundation.updateFlags(96, i != 1 ? i != 2 ? 64 : 0 : 32);
    }
}
