package androidx.compose.foundation.text;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PasswordVisibilitySetting {
    Runnable registerObserver(os0 os0Var);

    boolean shouldShowPhysicalInput();

    boolean shouldShowTouchInput();
}
