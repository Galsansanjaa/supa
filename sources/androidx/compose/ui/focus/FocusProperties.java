package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import defpackage.hd0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FocusProperties {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final Rect getUnsetFocusRect() {
            return UnsetFocusRect;
        }
    }

    boolean getCanFocus();

    FocusRequester getDown();

    FocusRequester getEnd();

    ps0 getEnter();

    ps0 getExit();

    Rect getFocusRect();

    FocusRequester getLeft();

    FocusRequester getNext();

    ps0 getOnEnter();

    ps0 getOnExit();

    FocusRequester getPrevious();

    FocusRequester getRight();

    FocusRequester getStart();

    FocusRequester getUp();

    void setCanFocus(boolean z);

    void setDown(FocusRequester focusRequester);

    void setEnd(FocusRequester focusRequester);

    @hd0
    void setEnter(ps0 ps0Var);

    @hd0
    void setExit(ps0 ps0Var);

    void setFocusRect(Rect rect);

    void setLeft(FocusRequester focusRequester);

    void setNext(FocusRequester focusRequester);

    void setOnEnter(ps0 ps0Var);

    void setOnExit(ps0 ps0Var);

    void setPrevious(FocusRequester focusRequester);

    void setRight(FocusRequester focusRequester);

    void setStart(FocusRequester focusRequester);

    void setUp(FocusRequester focusRequester);
}
