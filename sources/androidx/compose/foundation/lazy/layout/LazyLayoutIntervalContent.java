package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import defpackage.ps0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface Interval {
        ps0 getKey();

        ps0 getType();
    }

    public final Object getContentType(int i) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        return interval.getValue().getType().invoke(Integer.valueOf(i - interval.getStartIndex()));
    }

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final Object getKey(int i) {
        Object invoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        int startIndex = i - interval.getStartIndex();
        ps0 key = interval.getValue().getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(i) : invoke;
    }

    public final <T> T withInterval(int i, ts0 ts0Var) {
        IntervalList.Interval<Interval> interval = getIntervals().get(i);
        return (T) ts0Var.invoke(Integer.valueOf(i - interval.getStartIndex()), interval.getValue());
    }
}
