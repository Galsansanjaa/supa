package androidx.compose.foundation.text;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.core.os.HandlerCompat;
import defpackage.os0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class PlatformPasswordVisibilitySettingImpl implements PasswordVisibilitySetting {
    private final Context context;

    public PlatformPasswordVisibilitySettingImpl(Context context) {
        this.context = context;
    }

    private final boolean getSystemShowPasswordSetting() {
        try {
            return Settings.System.getInt(this.context.getContentResolver(), "show_password") > 0;
        } catch (Exception e) {
            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerObserver$lambda$0(PlatformPasswordVisibilitySettingImpl platformPasswordVisibilitySettingImpl, PlatformPasswordVisibilitySettingImpl$registerObserver$observer$1 platformPasswordVisibilitySettingImpl$registerObserver$observer$1) {
        platformPasswordVisibilitySettingImpl.context.getContentResolver().unregisterContentObserver(platformPasswordVisibilitySettingImpl$registerObserver$observer$1);
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl$registerObserver$observer$1, android.database.ContentObserver] */
    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public Runnable registerObserver(final os0 os0Var) {
        Uri uriFor = Settings.System.getUriFor("show_password");
        final Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
        final ?? r2 = new ContentObserver(createAsync) { // from class: androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl$registerObserver$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                os0.this.invoke();
            }
        };
        this.context.getContentResolver().registerContentObserver(uriFor, false, r2);
        return new Runnable() { // from class: androidx.compose.foundation.text.j
            @Override // java.lang.Runnable
            public final void run() {
                PlatformPasswordVisibilitySettingImpl.registerObserver$lambda$0(PlatformPasswordVisibilitySettingImpl.this, r2);
            }
        };
    }

    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowPhysicalInput() {
        return getSystemShowPasswordSetting();
    }

    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowTouchInput() {
        return getSystemShowPasswordSetting();
    }
}
