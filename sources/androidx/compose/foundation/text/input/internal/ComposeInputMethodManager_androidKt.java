package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import defpackage.cq;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static ps0 ComposeInputMethodManagerFactory = new cq(19);

    public static final ComposeInputMethodManager ComposeInputMethodManager(View view) {
        return (ComposeInputMethodManager) ComposeInputMethodManagerFactory.invoke(view);
    }

    public static final ComposeInputMethodManager ComposeInputMethodManagerFactory$lambda$0(View view) {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? new ComposeInputMethodManagerImplApi34(view) : i >= 24 ? new ComposeInputMethodManagerImplApi24(view) : new ComposeInputMethodManagerImplApi21(view);
    }

    public static /* synthetic */ ComposeInputMethodManager a(View view) {
        return ComposeInputMethodManagerFactory$lambda$0(view);
    }

    public static final ps0 overrideComposeInputMethodManagerFactoryForTests(ps0 ps0Var) {
        ps0 ps0Var2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = ps0Var;
        return ps0Var2;
    }
}
