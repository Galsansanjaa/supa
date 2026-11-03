package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.Spliterators;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E>, Set {
    public static final int $stable = 8;

    public ImmutableSetAdapter(java.util.Set<? extends E> set) {
        super(set);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ Spliterator spliterator() {
        Spliterator spliterator;
        spliterator = Spliterators.spliterator(this, 1);
        return spliterator;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }
}
