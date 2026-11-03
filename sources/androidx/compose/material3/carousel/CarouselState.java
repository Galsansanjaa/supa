package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.a10;
import defpackage.cq;
import defpackage.e50;
import defpackage.ea0;
import defpackage.ht;
import defpackage.nb0;
import defpackage.os0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.v4;
import defpackage.vy2;
import defpackage.wa2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CarouselState implements ScrollableState {
    private CarouselPagerState pagerState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<CarouselState, ?> Saver = ListSaverKt.listSaver(new v4(22), new cq(9));

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<CarouselState, ?> getSaver() {
            return CarouselState.Saver;
        }
    }

    public CarouselState(int i, float f, os0 os0Var) {
        this.pagerState = new CarouselPagerState(i, f, os0Var);
    }

    public /* synthetic */ CarouselState(int i, float f, os0 os0Var, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, os0Var);
    }

    public static final List Saver$lambda$1(SaverScope saverScope, CarouselState carouselState) {
        return nb0.D(Integer.valueOf(carouselState.pagerState.getCurrentPage()), Float.valueOf(carouselState.pagerState.getCurrentPageOffsetFraction()), Integer.valueOf(carouselState.pagerState.getPageCount()));
    }

    public static final CarouselState Saver$lambda$3(List list) {
        Object obj = list.get(0);
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new CarouselState(intValue, ((Float) obj2).floatValue(), new ht(list, 1));
    }

    public static final int Saver$lambda$3$lambda$2(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToItem$default(CarouselState carouselState, int i, AnimationSpec animationSpec, a10 a10Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return carouselState.animateScrollToItem(i, animationSpec, a10Var);
    }

    public final Object animateScrollToItem(int i, AnimationSpec<Float> animationSpec, a10 a10Var) {
        CarouselPagerState carouselPagerState = this.pagerState;
        int currentPage = carouselPagerState.getCurrentPage();
        vy2 vy2Var = vy2.a;
        if ((i == currentPage && carouselPagerState.getCurrentPageOffsetFraction() == 0.0f) || carouselPagerState.getPageCount() == 0) {
            return vy2Var;
        }
        Object z = wa2.z(carouselPagerState, null, new CarouselState$animateScrollToItem$2$1(carouselPagerState, carouselPagerState.getPageCount() > 0 ? ea0.o(i, 0, carouselPagerState.getPageCount() - 1) : 0, animationSpec, null), a10Var, 1, null);
        return z == e50.a ? z : vy2Var;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.pagerState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return true;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return true;
    }

    public final int getCurrentItem() {
        return this.pagerState.getCurrentPage();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return false;
    }

    public final CarouselPagerState getPagerState$material3() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final ScrollIndicatorState getScrollIndicatorState() {
        return null;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        Object scroll = this.pagerState.scroll(mutatePriority, ts0Var, a10Var);
        return scroll == e50.a ? scroll : vy2.a;
    }

    public final Object scrollToItem(int i, a10 a10Var) {
        Object scrollToPage = this.pagerState.scrollToPage(i, 0.0f, a10Var);
        return scrollToPage == e50.a ? scrollToPage : vy2.a;
    }

    public final void setPagerState$material3(CarouselPagerState carouselPagerState) {
        this.pagerState = carouselPagerState;
    }
}
