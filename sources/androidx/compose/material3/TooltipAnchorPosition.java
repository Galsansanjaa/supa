package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TooltipAnchorPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Above = m3390constructorimpl(1);
    private static final int Below = m3390constructorimpl(2);
    private static final int Left = m3390constructorimpl(3);
    private static final int Right = m3390constructorimpl(4);
    private static final int Start = m3390constructorimpl(5);
    private static final int End = m3390constructorimpl(6);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAbove-lOKsHw4, reason: not valid java name */
        public final int m3396getAbovelOKsHw4() {
            return TooltipAnchorPosition.Above;
        }

        /* renamed from: getBelow-lOKsHw4, reason: not valid java name */
        public final int m3397getBelowlOKsHw4() {
            return TooltipAnchorPosition.Below;
        }

        /* renamed from: getEnd-lOKsHw4, reason: not valid java name */
        public final int m3398getEndlOKsHw4() {
            return TooltipAnchorPosition.End;
        }

        /* renamed from: getLeft-lOKsHw4, reason: not valid java name */
        public final int m3399getLeftlOKsHw4() {
            return TooltipAnchorPosition.Left;
        }

        /* renamed from: getRight-lOKsHw4, reason: not valid java name */
        public final int m3400getRightlOKsHw4() {
            return TooltipAnchorPosition.Right;
        }

        /* renamed from: getStart-lOKsHw4, reason: not valid java name */
        public final int m3401getStartlOKsHw4() {
            return TooltipAnchorPosition.Start;
        }
    }

    private /* synthetic */ TooltipAnchorPosition(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TooltipAnchorPosition m3389boximpl(int i) {
        return new TooltipAnchorPosition(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3390constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3391equalsimpl(int i, Object obj) {
        return (obj instanceof TooltipAnchorPosition) && i == ((TooltipAnchorPosition) obj).m3395unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3392equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3393hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3394toStringimpl(int i) {
        return m3392equalsimpl0(i, Above) ? "Above" : m3392equalsimpl0(i, Below) ? "Below" : m3392equalsimpl0(i, Left) ? "Left" : m3392equalsimpl0(i, Right) ? "Right" : m3392equalsimpl0(i, Start) ? "Start" : m3392equalsimpl0(i, End) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3391equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3393hashCodeimpl(this.value);
    }

    public String toString() {
        return m3394toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3395unboximpl() {
        return this.value;
    }
}
