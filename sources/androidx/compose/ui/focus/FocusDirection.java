package androidx.compose.ui.focus;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m4969constructorimpl(1);
    private static final int Previous = m4969constructorimpl(2);
    private static final int Left = m4969constructorimpl(3);
    private static final int Right = m4969constructorimpl(4);
    private static final int Up = m4969constructorimpl(5);
    private static final int Down = m4969constructorimpl(6);
    private static final int Enter = m4969constructorimpl(7);
    private static final int Exit = m4969constructorimpl(8);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m4975getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m4976getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m4977getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m4978getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m4979getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m4980getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m4981getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m4982getUpdhqQ8s() {
            return FocusDirection.Up;
        }
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m4968boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4969constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4970equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).m4974unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4971equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4972hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4973toStringimpl(int i) {
        return m4971equalsimpl0(i, Next) ? "Next" : m4971equalsimpl0(i, Previous) ? "Previous" : m4971equalsimpl0(i, Left) ? "Left" : m4971equalsimpl0(i, Right) ? "Right" : m4971equalsimpl0(i, Up) ? "Up" : m4971equalsimpl0(i, Down) ? "Down" : m4971equalsimpl0(i, Enter) ? "Enter" : m4971equalsimpl0(i, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m4970equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4972hashCodeimpl(this.value);
    }

    public String toString() {
        return m4973toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4974unboximpl() {
        return this.value;
    }
}
