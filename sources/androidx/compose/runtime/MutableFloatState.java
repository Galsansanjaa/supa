package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Float getValue(MutableFloatState mutableFloatState) {
            return Float.valueOf(mutableFloatState.getFloatValue());
        }

        @Deprecated
        public static void setValue(MutableFloatState mutableFloatState, float f) {
            mutableFloatState.setFloatValue(f);
        }
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    Float getValue();

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Float getValue();

    void setFloatValue(float f);

    void setValue(float f);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Float f);
}
