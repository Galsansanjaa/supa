package defpackage;

import android.content.Context;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ s2(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj, int i2) {
        this.a = 1;
        this.n = pagerLazyLayoutItemProvider;
        this.b = i;
        this.o = obj;
        this.m = i2;
    }

    public /* synthetic */ s2(Object obj, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.n = obj;
        this.o = obj2;
        this.b = i;
        this.m = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r3.l((Context) obj4, (ts0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1), this.m);
                return vy2.a;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                return PagerLazyLayoutItemProvider.b((PagerLazyLayoutItemProvider) obj4, this.b, this.o, this.m, (Composer) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return VectorPainterKt.c((VectorGroup) obj4, (Map) obj3, this.b, this.m, (Composer) obj, intValue2);
        }
    }
}
