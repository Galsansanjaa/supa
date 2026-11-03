package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Integer getValue(MutableIntState mutableIntState) {
            return Integer.valueOf(mutableIntState.getIntValue());
        }

        @Deprecated
        public static void setValue(MutableIntState mutableIntState, int i) {
            mutableIntState.setIntValue(i);
        }
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    Integer getValue();

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Integer getValue();

    void setIntValue(int i);

    void setValue(int i);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Integer num);
}
