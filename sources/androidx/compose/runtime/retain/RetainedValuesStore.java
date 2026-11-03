package androidx.compose.runtime.retain;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface RetainedValuesStore {
    Object consumeExitedValueOrDefault(Object obj, Object obj2);

    void onContentEnteredComposition();

    void onContentExitComposition();

    void saveExitingValue(Object obj, Object obj2);
}
