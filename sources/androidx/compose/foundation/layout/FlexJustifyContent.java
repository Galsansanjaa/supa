package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexJustifyContent {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCenter-GomtQF4, reason: not valid java name */
        public final int m896getCenterGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(2);
        }

        /* renamed from: getEnd-GomtQF4, reason: not valid java name */
        public final int m897getEndGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(1);
        }

        /* renamed from: getSpaceAround-GomtQF4, reason: not valid java name */
        public final int m898getSpaceAroundGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(4);
        }

        /* renamed from: getSpaceBetween-GomtQF4, reason: not valid java name */
        public final int m899getSpaceBetweenGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(3);
        }

        /* renamed from: getSpaceEvenly-GomtQF4, reason: not valid java name */
        public final int m900getSpaceEvenlyGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(5);
        }

        /* renamed from: getStart-GomtQF4, reason: not valid java name */
        public final int m901getStartGomtQF4() {
            return FlexJustifyContent.m890constructorimpl(0);
        }
    }

    private /* synthetic */ FlexJustifyContent(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexJustifyContent m889boximpl(int i) {
        return new FlexJustifyContent(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m890constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m891equalsimpl(int i, Object obj) {
        return (obj instanceof FlexJustifyContent) && i == ((FlexJustifyContent) obj).m895unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m892equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m893hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m894toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "INVALID" : "SpaceEvenly" : "SpaceAround" : "SpaceBetween" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m891equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m893hashCodeimpl(this.bits);
    }

    public String toString() {
        return m894toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m895unboximpl() {
        return this.bits;
    }
}
