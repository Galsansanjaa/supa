package androidx.compose.ui.input.nestedscroll;

import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        @hd0
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m6464getDragWNlRxjI$annotations() {
        }

        @hd0
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m6465getFlingWNlRxjI$annotations() {
        }

        @hd0
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m6466getRelocateWNlRxjI$annotations() {
        }

        @hd0
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m6467getWheelWNlRxjI$annotations() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m6468getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m6469getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m6470getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m6471getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m6472getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m6473getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }
    }

    static {
        int m6458constructorimpl = m6458constructorimpl(1);
        UserInput = m6458constructorimpl;
        int m6458constructorimpl2 = m6458constructorimpl(2);
        SideEffect = m6458constructorimpl2;
        Drag = m6458constructorimpl;
        Fling = m6458constructorimpl2;
        Relocate = m6458constructorimpl(3);
        Wheel = m6458constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m6457boximpl(int i) {
        return new NestedScrollSource(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6458constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6459equalsimpl(int i, Object obj) {
        return (obj instanceof NestedScrollSource) && i == ((NestedScrollSource) obj).m6463unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6460equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6461hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6462toStringimpl(int i) {
        return m6460equalsimpl0(i, UserInput) ? "UserInput" : m6460equalsimpl0(i, SideEffect) ? "SideEffect" : m6460equalsimpl0(i, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6459equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6461hashCodeimpl(this.value);
    }

    public String toString() {
        return m6462toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6463unboximpl() {
        return this.value;
    }
}
