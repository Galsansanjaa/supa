package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m46constructorimpl(0);
        private static final int Right = m46constructorimpl(1);
        private static final int Up = m46constructorimpl(2);
        private static final int Down = m46constructorimpl(3);
        private static final int Start = m46constructorimpl(4);
        private static final int End = m46constructorimpl(5);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m52getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m53getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m54getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m55getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m56getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m57getUpDKzdypw() {
                return SlideDirection.Up;
            }
        }

        private /* synthetic */ SlideDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m45boximpl(int i) {
            return new SlideDirection(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m46constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m47equalsimpl(int i, Object obj) {
            return (obj instanceof SlideDirection) && i == ((SlideDirection) obj).m51unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m48equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m49hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m50toStringimpl(int i) {
            return m48equalsimpl0(i, Left) ? "Left" : m48equalsimpl0(i, Right) ? "Right" : m48equalsimpl0(i, Up) ? "Up" : m48equalsimpl0(i, Down) ? "Down" : m48equalsimpl0(i, Start) ? "Start" : m48equalsimpl0(i, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m47equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m49hashCodeimpl(this.value);
        }

        public String toString() {
            return m50toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m51unboximpl() {
            return this.value;
        }
    }

    Alignment getContentAlignment();

    ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion);

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo43slideIntoContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ps0 ps0Var);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo44slideOutOfContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ps0 ps0Var);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);
}
