package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    private static final Modifier excludeFromSystemGestureQ(ps0 ps0Var) {
        return new ExcludeFromSystemGestureElement(ps0Var);
    }

    public static final Modifier systemGestureExclusion(Modifier modifier) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    public static final Modifier systemGestureExclusion(Modifier modifier, ps0 ps0Var) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(ps0Var));
    }
}
