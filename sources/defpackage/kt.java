package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.carousel.CarouselStateKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class kt implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w42 b;
    public final /* synthetic */ LazyLayoutScrollScope m;

    public /* synthetic */ kt(w42 w42Var, LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        this.a = i;
        this.b = w42Var;
        this.m = lazyLayoutScrollScope;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        LazyLayoutScrollScope lazyLayoutScrollScope = this.m;
        w42 w42Var = this.b;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return CarouselStateKt.a(w42Var, lazyLayoutScrollScope, floatValue, floatValue2);
            default:
                return PagerStateKt.b(w42Var, lazyLayoutScrollScope, floatValue, floatValue2);
        }
    }
}
