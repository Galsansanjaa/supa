package defpackage;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.runtime.Updater;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ub1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;

    public /* synthetic */ ub1(ps0 ps0Var, int i) {
        this.a = i;
        this.b = ps0Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        GridItemSpan item$lambda$1$0;
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                item$lambda$1$0 = LazyGridIntervalContent.item$lambda$1$0(ps0Var, (LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
                return item$lambda$1$0;
            case 1:
                return Updater.b(ps0Var, obj, (vy2) obj2);
            default:
                return Updater.a(ps0Var, obj, (vy2) obj2);
        }
    }
}
