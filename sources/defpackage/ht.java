package defpackage;

import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ht implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ht(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int f;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                f = CarouselPagerState.f(list);
                break;
            default:
                f = CarouselState.b(list);
                break;
        }
        return Integer.valueOf(f);
    }
}
