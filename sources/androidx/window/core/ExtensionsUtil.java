package androidx.window.core;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import defpackage.a52;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ExtensionsUtil {
    public static final ExtensionsUtil INSTANCE = new ExtensionsUtil();
    private static final String TAG = a52.a(ExtensionsUtil.class).c();

    private ExtensionsUtil() {
    }

    public final int getSafeVendorApiLevel() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(TAG, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(TAG, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (BuildConfig.INSTANCE.getVerificationMode() != VerificationMode.LOG) {
                return 0;
            }
            Log.d(TAG, "Stub Extension");
            return 0;
        }
    }
}
