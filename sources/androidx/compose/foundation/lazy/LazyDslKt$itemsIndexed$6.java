package androidx.compose.foundation.lazy;

import defpackage.ps0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$6 implements ps0 {
    final /* synthetic */ T[] $items;
    final /* synthetic */ ts0 $key;

    public LazyDslKt$itemsIndexed$6(ts0 ts0Var, T[] tArr) {
        this.$key = ts0Var;
        this.$items = tArr;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
