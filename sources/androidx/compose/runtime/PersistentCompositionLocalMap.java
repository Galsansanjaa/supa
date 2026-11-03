package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* renamed from: build */
        PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build2();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2();

    @Override // androidx.compose.runtime.CompositionLocalAccessorScope
    <T> T getCurrentValue(CompositionLocal<T> compositionLocal);

    PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, ValueHolder<Object> valueHolder);
}
