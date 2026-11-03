package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface LazyStaggeredGridItemProvider extends LazyLayoutItemProvider {
    LazyLayoutKeyIndexMap getKeyIndexMap();

    LazyStaggeredGridSpanProvider getSpanProvider();
}
