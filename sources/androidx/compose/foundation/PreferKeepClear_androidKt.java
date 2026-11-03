package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    public static final Modifier preferKeepClear(Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    public static final Modifier preferKeepClear(Modifier modifier, ps0 ps0Var) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(ps0Var));
    }

    private static final Modifier preferKeepClearT(ps0 ps0Var) {
        return new PreferKeepClearElement(ps0Var);
    }
}
