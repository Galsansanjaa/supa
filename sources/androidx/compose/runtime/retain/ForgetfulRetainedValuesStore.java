package androidx.compose.runtime.retain;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ForgetfulRetainedValuesStore implements RetainedValuesStore {
    public static final int $stable = 0;
    public static final ForgetfulRetainedValuesStore INSTANCE = new ForgetfulRetainedValuesStore();

    private ForgetfulRetainedValuesStore() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentExitComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void saveExitingValue(Object obj, Object obj2) {
        if (obj2 instanceof RetainObserver) {
            ((RetainObserver) obj2).onRetired();
        }
    }
}
