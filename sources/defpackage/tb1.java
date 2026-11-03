package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tb1 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs0 b;
    public final /* synthetic */ int m;

    public /* synthetic */ tb1(vs0 vs0Var, int i, int i2) {
        this.a = i2;
        this.b = vs0Var;
        this.m = i;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vy2 stickyHeader$lambda$2;
        vy2 stickyHeader$lambda$1;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                stickyHeader$lambda$2 = LazyGridIntervalContent.stickyHeader$lambda$2(this.b, this.m, (LazyGridItemScope) obj, (Composer) obj2, intValue);
                return stickyHeader$lambda$2;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                stickyHeader$lambda$1 = LazyListIntervalContent.stickyHeader$lambda$1(this.b, this.m, (LazyItemScope) obj, (Composer) obj2, intValue2);
                return stickyHeader$lambda$1;
        }
    }
}
