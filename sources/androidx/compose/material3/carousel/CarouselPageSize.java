package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import defpackage.ej1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;
    private final ts0 keylineList;
    private final MutableState strategyState$delegate;

    public CarouselPageSize(ts0 ts0Var, float f, float f2) {
        MutableState mutableStateOf$default;
        this.keylineList = ts0Var;
        this.beforeContentPadding = f;
        this.afterContentPadding = f2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);
        this.strategyState$delegate = mutableStateOf$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState$delegate.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState$delegate.setValue(strategy);
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(Density density, int i, int i2) {
        float f = i;
        float f2 = i2;
        setStrategyState(new Strategy((KeylineList) this.keylineList.invoke(Float.valueOf(f), Float.valueOf(f2)), f, f2, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().isValid() ? ej1.K(getStrategy().getItemMainAxisSize()) : i;
    }

    public final Strategy getStrategy() {
        return getStrategyState();
    }
}
