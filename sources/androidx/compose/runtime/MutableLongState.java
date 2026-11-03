package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Long getValue(MutableLongState mutableLongState) {
            return Long.valueOf(mutableLongState.getLongValue());
        }

        @Deprecated
        public static void setValue(MutableLongState mutableLongState, long j) {
            mutableLongState.setLongValue(j);
        }
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    Long getValue();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Long getValue();

    void setLongValue(long j);

    void setValue(long j);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Long l);
}
