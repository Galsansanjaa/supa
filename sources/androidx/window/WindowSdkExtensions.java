package androidx.window;

import androidx.window.core.ExtensionsUtil;
import defpackage.i61;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class WindowSdkExtensions {
    public static final Companion Companion = new Companion(null);
    private static WindowSdkExtensionsDecorator decorator = EmptyDecoratorWindowSdk.INSTANCE;
    private final int extensionVersion = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final WindowSdkExtensions getInstance() {
            return WindowSdkExtensions.decorator.decorate(new WindowSdkExtensions() { // from class: androidx.window.WindowSdkExtensions$Companion$getInstance$1
            });
        }

        public final void overrideDecorator(WindowSdkExtensionsDecorator windowSdkExtensionsDecorator) {
            windowSdkExtensionsDecorator.getClass();
            WindowSdkExtensions.decorator = windowSdkExtensionsDecorator;
        }

        public final void reset() {
            WindowSdkExtensions.decorator = EmptyDecoratorWindowSdk.INSTANCE;
        }
    }

    public static final WindowSdkExtensions getInstance() {
        return Companion.getInstance();
    }

    public int getExtensionVersion() {
        return this.extensionVersion;
    }

    public final void requireExtensionVersion$window_release(int i) {
        if (getExtensionVersion() >= i) {
            return;
        }
        StringBuilder w = wa2.w(i, "This API requires extension version ", ", but the device is on ");
        w.append(getExtensionVersion());
        throw new UnsupportedOperationException(w.toString());
    }

    public final void requireExtensionVersion$window_release(i61 i61Var) {
        i61Var.getClass();
        int i = i61Var.a;
        int i2 = i61Var.b;
        int extensionVersion = getExtensionVersion();
        if (i > extensionVersion || extensionVersion > i2) {
            StringBuilder sb = new StringBuilder("This API requires extension version ");
            sb.append(i61Var);
            int extensionVersion2 = getExtensionVersion();
            sb.append(", but the device is on ");
            sb.append(extensionVersion2);
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
