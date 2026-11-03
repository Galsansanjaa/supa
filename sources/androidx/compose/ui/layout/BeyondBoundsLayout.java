package androidx.compose.ui.layout;

import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m6691constructorimpl(1);
        private static final int After = m6691constructorimpl(2);
        private static final int Left = m6691constructorimpl(3);
        private static final int Right = m6691constructorimpl(4);
        private static final int Above = m6691constructorimpl(5);
        private static final int Below = m6691constructorimpl(6);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m6697getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m6698getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m6699getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m6700getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m6701getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m6702getRighthoxUOeE() {
                return LayoutDirection.Right;
            }
        }

        private /* synthetic */ LayoutDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m6690boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m6691constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6692equalsimpl(int i, Object obj) {
            return (obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m6696unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6693equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6694hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6695toStringimpl(int i) {
            return m6693equalsimpl0(i, Before) ? "Before" : m6693equalsimpl0(i, After) ? "After" : m6693equalsimpl0(i, Left) ? "Left" : m6693equalsimpl0(i, Right) ? "Right" : m6693equalsimpl0(i, Above) ? "Above" : m6693equalsimpl0(i, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m6692equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6694hashCodeimpl(this.value);
        }

        public String toString() {
            return m6695toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6696unboximpl() {
            return this.value;
        }
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo1221layouto7g1Pn8(int i, ps0 ps0Var);
}
