package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import defpackage.ej1;
import defpackage.jh2;
import defpackage.kw;
import defpackage.nb0;
import defpackage.oi0;
import defpackage.sb0;
import defpackage.yo0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Strategy {
    private static final Strategy Empty;
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private List<KeylineList> lastStartAndEndKeylineListSteps;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }
    }

    static {
        KeylineList emptyKeylineList = KeylineListKt.emptyKeylineList();
        oi0 oi0Var = oi0.a;
        Empty = new Strategy(emptyKeylineList, oi0Var, oi0Var, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Strategy(KeylineList keylineList, float f, float f2, float f3, float f4) {
        this(keylineList, StrategyKt.access$getStartKeylineSteps(keylineList, f, f2, f3), StrategyKt.access$getEndKeylineSteps(keylineList, f, f2, f4), f, f2, f3, f4);
    }

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f, float f2, float f3, float f4) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f;
        this.itemSpacing = f2;
        this.beforeContentPadding = f3;
        this.afterContentPadding = f4;
        float access$getStartShiftDistance = StrategyKt.access$getStartShiftDistance(list, f3);
        this.startShiftDistance = access$getStartShiftDistance;
        float access$getEndShiftDistance = StrategyKt.access$getEndShiftDistance(list2, f4);
        this.endShiftDistance = access$getEndShiftDistance;
        this.startShiftPoints = StrategyKt.access$getStepInterpolationPoints(access$getStartShiftDistance, list, true);
        this.endShiftPoints = StrategyKt.access$getStepInterpolationPoints(access$getEndShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3$default(Strategy strategy, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return strategy.getKeylineListForScrollOffset$material3(f, f2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z = this.isValid;
        if (!z && !((Strategy) obj).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && jh2.k(this.startShiftPoints, strategy.startShiftPoints) && jh2.k(this.endShiftPoints, strategy.endShiftPoints) && jh2.k(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KeylineList getKeylineListForScrollOffset$material3(float f, float f2, boolean z) {
        float max = Math.max(0.0f, f);
        float f3 = this.startShiftDistance;
        float max2 = Math.max(0.0f, f2 - this.endShiftDistance);
        if (f3 <= max && max <= max2) {
            return this.defaultKeylines;
        }
        float access$lerp = StrategyKt.access$lerp(1.0f, 0.0f, 0.0f, f3, max);
        FloatList floatList = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (max > max2) {
            access$lerp = StrategyKt.access$lerp(0.0f, 1.0f, max2, f2, max);
            floatList = this.endShiftPoints;
            list = this.endKeylineSteps;
            if (max2 < 0.01f && this.startKeylineSteps.size() == 2 && this.endKeylineSteps.size() == 2) {
                List<KeylineList> list2 = this.lastStartAndEndKeylineListSteps;
                if (list2 == null) {
                    list2 = nb0.D(kw.x0(this.startKeylineSteps), kw.x0(this.endKeylineSteps));
                    this.lastStartAndEndKeylineListSteps = list2;
                }
                list = list2;
                list.getClass();
            }
        }
        ShiftPointRange access$getShiftPointRange = StrategyKt.access$getShiftPointRange(list.size(), floatList, access$lerp);
        if (z) {
            return list.get(ej1.K(access$getShiftPointRange.getSteppedInterpolation()) == 0 ? access$getShiftPointRange.getFromStepIndex() : access$getShiftPointRange.getToStepIndex());
        }
        return KeylineListKt.lerp(list.get(access$getShiftPointRange.getFromStepIndex()), list.get(access$getShiftPointRange.getToStepIndex()), access$getShiftPointRange.getSteppedInterpolation());
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public int hashCode() {
        boolean z = this.isValid;
        if (!z) {
            return z ? 1231 : 1237;
        }
        return this.defaultKeylines.hashCode() + ((this.endShiftPoints.hashCode() + ((this.startShiftPoints.hashCode() + yo0.i(this.endShiftDistance, yo0.i(this.startShiftDistance, (Float.floatToIntBits(getItemMainAxisSize()) + yo0.i(this.afterContentPadding, yo0.i(this.beforeContentPadding, yo0.i(this.itemSpacing, yo0.i(this.availableSpace, (z ? 1231 : 1237) * 31, 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final boolean isValid() {
        return this.isValid;
    }
}
