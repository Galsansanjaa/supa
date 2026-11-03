package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ps0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$3 implements ps0 {
    final /* synthetic */ ps0 $contentType;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$items$3(ps0 ps0Var, List<? extends T> list) {
        this.$contentType = ps0Var;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items.get(i));
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
