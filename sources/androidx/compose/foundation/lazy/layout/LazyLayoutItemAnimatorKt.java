package androidx.compose.foundation.lazy.layout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimatorKt {
    private static final LazyLayoutItemAnimation[] EmptyArray = new LazyLayoutItemAnimation[0];

    public static final /* synthetic */ LazyLayoutItemAnimation[] access$getEmptyArray$p() {
        return EmptyArray;
    }

    public static final /* synthetic */ LazyLayoutAnimationSpecsNode access$getSpecs(Object obj) {
        return getSpecs(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyLayoutAnimationSpecsNode getSpecs(Object obj) {
        if (obj instanceof LazyLayoutAnimationSpecsNode) {
            return (LazyLayoutAnimationSpecsNode) obj;
        }
        return null;
    }
}
