package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import defpackage.f31;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TextToolbar {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5) {
            textToolbar.showMenu(rect, os0Var, os0Var2, os0Var3, os0Var4);
        }

        public static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: showMenu");
                return;
            }
            if ((i & 2) != 0) {
                os0Var = null;
            }
            if ((i & 4) != 0) {
                os0Var2 = null;
            }
            if ((i & 8) != 0) {
                os0Var3 = null;
            }
            if ((i & 16) != 0) {
                os0Var4 = null;
            }
            textToolbar.showMenu(rect, os0Var, os0Var2, os0Var3, os0Var4);
        }
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4);

    void showMenu(Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5);
}
