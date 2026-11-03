package defpackage;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.LinkComposer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class qt0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(GapComposer.e(obj2, obj));
            case 1:
                return LazyGridIntervalContent.b(((Integer) obj).intValue(), obj2);
            case 2:
                return LazyGridIntervalContent.f(((Integer) obj).intValue(), obj2);
            case 3:
                return LazyListIntervalContent.d(((Integer) obj).intValue(), obj2);
            case 4:
                return LazyListIntervalContent.b(((Integer) obj).intValue(), obj2);
            case 5:
                return LazyStaggeredGridIntervalContent.d(((Integer) obj).intValue(), obj2);
            case 6:
                return LazyStaggeredGridIntervalContent.b(((Integer) obj).intValue(), obj2);
            default:
                return Boolean.valueOf(LinkComposer.c(obj2, obj));
        }
    }
}
