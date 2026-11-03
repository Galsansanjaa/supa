package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import defpackage.a10;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ScrollableState {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            return true;
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            return true;
        }

        @Deprecated
        public static boolean getLastScrolledBackward(ScrollableState scrollableState) {
            return false;
        }

        @Deprecated
        public static boolean getLastScrolledForward(ScrollableState scrollableState) {
            return false;
        }

        @Deprecated
        public static ScrollIndicatorState getScrollIndicatorState(ScrollableState scrollableState) {
            return null;
        }
    }

    float dispatchRawDelta(float f);

    boolean getCanScrollBackward();

    boolean getCanScrollForward();

    boolean getLastScrolledBackward();

    boolean getLastScrolledForward();

    ScrollIndicatorState getScrollIndicatorState();

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var);
}
