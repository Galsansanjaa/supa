package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.hd0;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OnFirstVisibleModifierKt {
    @hd0
    public static final Modifier onFirstVisible(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, os0 os0Var) {
        return modifier.then(new OnFirstVisibleElement(j, f, layoutBoundsHolder, os0Var));
    }

    public static /* synthetic */ Modifier onFirstVisible$default(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, os0 os0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onFirstVisible(modifier, j2, f2, layoutBoundsHolder, os0Var);
    }
}
