package androidx.compose.ui.input.pointer;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m6529constructorimpl(0);
    private static final int Press = m6529constructorimpl(1);
    private static final int Release = m6529constructorimpl(2);
    private static final int Move = m6529constructorimpl(3);
    private static final int Enter = m6529constructorimpl(4);
    private static final int Exit = m6529constructorimpl(5);
    private static final int Scroll = m6529constructorimpl(6);
    private static final int ScaleStart = m6529constructorimpl(7);
    private static final int ScaleChange = m6529constructorimpl(8);
    private static final int ScaleEnd = m6529constructorimpl(9);
    private static final int PanStart = m6529constructorimpl(10);
    private static final int PanMove = m6529constructorimpl(11);
    private static final int PanEnd = m6529constructorimpl(12);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m6535getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m6536getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m6537getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPanEnd-7fucELk, reason: not valid java name */
        public final int m6538getPanEnd7fucELk() {
            return PointerEventType.PanEnd;
        }

        /* renamed from: getPanMove-7fucELk, reason: not valid java name */
        public final int m6539getPanMove7fucELk() {
            return PointerEventType.PanMove;
        }

        /* renamed from: getPanStart-7fucELk, reason: not valid java name */
        public final int m6540getPanStart7fucELk() {
            return PointerEventType.PanStart;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m6541getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m6542getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScaleChange-7fucELk, reason: not valid java name */
        public final int m6543getScaleChange7fucELk() {
            return PointerEventType.ScaleChange;
        }

        /* renamed from: getScaleEnd-7fucELk, reason: not valid java name */
        public final int m6544getScaleEnd7fucELk() {
            return PointerEventType.ScaleEnd;
        }

        /* renamed from: getScaleStart-7fucELk, reason: not valid java name */
        public final int m6545getScaleStart7fucELk() {
            return PointerEventType.ScaleStart;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m6546getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m6547getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }
    }

    private /* synthetic */ PointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m6528boximpl(int i) {
        return new PointerEventType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6529constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6530equalsimpl(int i, Object obj) {
        return (obj instanceof PointerEventType) && i == ((PointerEventType) obj).m6534unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6531equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6532hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6533toStringimpl(int i) {
        return m6531equalsimpl0(i, Press) ? "Press" : m6531equalsimpl0(i, Release) ? "Release" : m6531equalsimpl0(i, Move) ? "Move" : m6531equalsimpl0(i, Enter) ? "Enter" : m6531equalsimpl0(i, Exit) ? "Exit" : m6531equalsimpl0(i, Scroll) ? "Scroll" : m6531equalsimpl0(i, ScaleStart) ? "ScaleStart" : m6531equalsimpl0(i, ScaleChange) ? "ScaleChange" : m6531equalsimpl0(i, ScaleEnd) ? "ScaleFinish" : m6531equalsimpl0(i, PanStart) ? "PanStart" : m6531equalsimpl0(i, PanMove) ? "Pan" : m6531equalsimpl0(i, PanEnd) ? "PanEnd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6530equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6532hashCodeimpl(this.value);
    }

    public String toString() {
        return m6533toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6534unboximpl() {
        return this.value;
    }
}
