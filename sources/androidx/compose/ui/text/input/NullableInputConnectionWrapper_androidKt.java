package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, ps0 ps0Var) {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, ps0Var) : i >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, ps0Var) : i >= 24 ? new NullableInputConnectionWrapperApi24(inputConnection, ps0Var) : new NullableInputConnectionWrapperApi21(inputConnection, ps0Var);
    }
}
