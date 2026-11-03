package androidx.compose.foundation.lazy;

import defpackage.ps0;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$2 implements ps0 {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ ts0 $key;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$itemsIndexed$2(ts0 ts0Var, List<? extends T> list) {
        this.$key = ts0Var;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
