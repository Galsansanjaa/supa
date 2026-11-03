package androidx.compose.foundation.lazy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyListPrefetchStrategyKt {
    private static final int UnsetItemCount = -1;

    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int i) {
        return new DefaultLazyListPrefetchStrategy(i);
    }

    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return LazyListPrefetchStrategy(i);
    }
}
