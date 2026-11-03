package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(mutableDoubleState.getDoubleValue());
        }

        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d) {
            mutableDoubleState.setDoubleValue(d);
        }
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    Double getValue();

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Double getValue();

    void setDoubleValue(double d);

    void setValue(double d);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Double d);
}
