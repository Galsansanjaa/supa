package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyLayoutCacheWindow b;

    public /* synthetic */ zb1(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i) {
        this.a = i;
        this.b = lazyLayoutCacheWindow;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        LazyLayoutCacheWindow lazyLayoutCacheWindow = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                return LazyGridState.Companion.d(lazyLayoutCacheWindow, list);
            default:
                return LazyListState.Companion.b(lazyLayoutCacheWindow, list);
        }
    }
}
