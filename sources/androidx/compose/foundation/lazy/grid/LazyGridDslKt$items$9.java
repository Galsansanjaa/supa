package androidx.compose.foundation.lazy.grid;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridDslKt$items$9 implements ps0 {
    final /* synthetic */ ps0 $contentType;
    final /* synthetic */ T[] $items;

    public LazyGridDslKt$items$9(ps0 ps0Var, T[] tArr) {
        this.$contentType = ps0Var;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items[i]);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
