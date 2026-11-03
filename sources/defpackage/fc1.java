package defpackage;

import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerState;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class fc1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagerState b;

    public /* synthetic */ fc1(PagerState pagerState, int i) {
        this.a = i;
        this.b = pagerState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int b;
        int i = this.a;
        PagerState pagerState = this.b;
        switch (i) {
            case 0:
                b = LazyLayoutPagerKt.b(pagerState);
                break;
            case 1:
                b = LazyLayoutPagerKt.a(pagerState);
                break;
            case 2:
                b = PagerState.e(pagerState);
                break;
            case 3:
                b = PagerState.c(pagerState);
                break;
            default:
                b = PagerState.a(pagerState);
                break;
        }
        return Integer.valueOf(b);
    }
}
