package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 implements ps0 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ ps0 $span;

    public LazyStaggeredGridDslKt$items$9$1(ps0 ps0Var, T[] tArr) {
        this.$span = ps0Var;
        this.$items = tArr;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items[i]);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
