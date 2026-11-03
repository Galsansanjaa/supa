package androidx.compose.foundation.text;

import android.content.Context;
import android.text.ShowSecretsSetting;
import defpackage.os0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PlatformPasswordVisibilitySettingApi37 extends PlatformPasswordVisibilitySettingImpl {
    public PlatformPasswordVisibilitySettingApi37(Context context) {
        super(context);
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public Runnable registerObserver(final os0 os0Var) {
        return ShowSecretsSetting.registerCallback(getContext(), new Runnable() { // from class: androidx.compose.foundation.text.i
            @Override // java.lang.Runnable
            public final void run() {
                os0.this.invoke();
            }
        });
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowPhysicalInput() {
        return ShowSecretsSetting.shouldShowPhysicalInput(getContext());
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowTouchInput() {
        return ShowSecretsSetting.shouldShowTouchInput(getContext());
    }
}
