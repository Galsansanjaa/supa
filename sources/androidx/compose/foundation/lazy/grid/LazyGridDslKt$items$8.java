package androidx.compose.foundation.lazy.grid;

import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$8 implements ts0 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ ts0 $span;

    public LazyGridDslKt$items$8(ts0 ts0Var, T[] tArr) {
        this.$span = ts0Var;
        this.$items = tArr;
    }

    @Override // defpackage.ts0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m1190boximpl(m1200invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m1200invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i])).m1197unboximpl();
    }
}
