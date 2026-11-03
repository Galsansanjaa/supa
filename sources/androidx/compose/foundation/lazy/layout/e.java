package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.TraversableNode;
import defpackage.ps0;
import defpackage.z42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        TraversableNode.Companion.TraverseDescendantsAction resolveNestedPrefetchStates$lambda$1;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return LazyLayoutItemContentFactory.CachedItemContent.b((LazyLayoutItemContentFactory.CachedItemContent) obj2, (DisposableEffectScope) obj);
            case 1:
                return LazyLayoutPinnableItemKt.a((LazyLayoutPinnableItem) obj2, (DisposableEffectScope) obj);
            case 2:
                return Boolean.valueOf(LazySaveableStateHolder.a((SaveableStateRegistry) obj2, obj));
            default:
                resolveNestedPrefetchStates$lambda$1 = PrefetchHandleProvider.HandleAndRequestImpl.resolveNestedPrefetchStates$lambda$1((z42) obj2, (TraversableNode) obj);
                return resolveNestedPrefetchStates$lambda$1;
        }
    }
}
