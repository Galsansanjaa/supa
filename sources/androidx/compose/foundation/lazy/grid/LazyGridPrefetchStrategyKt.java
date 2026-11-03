package androidx.compose.foundation.lazy.grid;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridPrefetchStrategyKt {
    private static final int UnsetItemCount = -1;

    public static final LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i) {
        return new DefaultLazyGridPrefetchStrategy(i);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return LazyGridPrefetchStrategy(i);
    }
}
