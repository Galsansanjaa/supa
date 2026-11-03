package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class UnboxedLongState implements LongState {
    public static final int $stable = 0;
    private final State<Long> baseState;

    public UnboxedLongState(State<Long> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.LongState
    public long getLongValue() {
        return this.baseState.getValue().longValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public Long getValue() {
        return this.baseState.getValue();
    }

    public String toString() {
        return "UnboxedLongState(baseState=" + this.baseState + ")@" + hashCode();
    }
}
