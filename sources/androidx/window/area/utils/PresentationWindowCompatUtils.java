package androidx.window.area.utils;

import android.view.Window;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import defpackage.jh2;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class PresentationWindowCompatUtils {
    public static final PresentationWindowCompatUtils INSTANCE = new PresentationWindowCompatUtils();

    private PresentationWindowCompatUtils() {
    }

    private final Method getWindowMethod(ExtensionWindowAreaPresentation extensionWindowAreaPresentation) {
        Method[] methods = extensionWindowAreaPresentation.getClass().getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return null;
            }
            Method method = methods[i];
            if (jh2.k(method != null ? method.getName() : null, "getWindow") && jh2.k(method.getReturnType(), Window.class)) {
                return method;
            }
            i++;
        }
    }

    public final Window getWindowBeforeVendorApiLevel4(ExtensionWindowAreaPresentation extensionWindowAreaPresentation) {
        extensionWindowAreaPresentation.getClass();
        Method windowMethod = getWindowMethod(extensionWindowAreaPresentation);
        if (windowMethod == null) {
            return null;
        }
        return (Window) windowMethod.invoke(extensionWindowAreaPresentation, null);
    }
}
