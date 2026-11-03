package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntervalTreeKt {
    private static final Interval<Object> EmptyInterval = new Interval<>(Float.MAX_VALUE, Float.MIN_VALUE, null);
    private static final int TreeColorBlack = 1;
    private static final int TreeColorRed = 0;

    public static final Interval<Object> getEmptyInterval() {
        return EmptyInterval;
    }
}
