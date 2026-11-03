package androidx.window.area;

import android.os.Build;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.area.reflectionguard.WindowAreaComponentValidator;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import defpackage.tj1;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SafeWindowAreaComponentProvider {
    private final ClassLoader loader;
    private final WindowExtensions windowExtensions;

    public SafeWindowAreaComponentProvider(ClassLoader classLoader) {
        classLoader.getClass();
        this.loader = classLoader;
        this.windowExtensions = new SafeWindowExtensionsProvider(classLoader).getWindowExtensions();
    }

    public static /* synthetic */ boolean a(Object obj, SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) {
        return isWindowAreaProviderValid$lambda$0(obj, safeWindowAreaComponentProvider);
    }

    private final Class<?> getExtensionWindowAreaPresentationClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_PRESENTATION_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    private final Class<?> getExtensionWindowAreaStatusClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.EXTENSION_WINDOW_AREA_STATUS_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    private final Class<?> getWindowAreaComponentClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_AREA_COMPONENT_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    private final boolean isWindowAreaProviderValid(Object obj) {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowAreaComponent is not valid", new tj1(12, obj, this));
    }

    public static final boolean isWindowAreaProviderValid$lambda$0(Object obj, SafeWindowAreaComponentProvider safeWindowAreaComponentProvider) {
        Method method = obj.getClass().getMethod("getWindowAreaComponent", null);
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        method.getClass();
        return reflectionUtils.isPublic$window_release(method) && reflectionUtils.doesReturn$window_release(method, safeWindowAreaComponentProvider.getWindowAreaComponentClass());
    }

    public final WindowAreaComponent getWindowAreaComponent() {
        try {
            WindowExtensions windowExtensions = this.windowExtensions;
            if (windowExtensions != null && isWindowAreaProviderValid(windowExtensions) && Build.VERSION.SDK_INT >= 29) {
                WindowAreaComponentValidator windowAreaComponentValidator = WindowAreaComponentValidator.INSTANCE;
                Class<?> windowAreaComponentClass = getWindowAreaComponentClass();
                ExtensionsUtil extensionsUtil = ExtensionsUtil.INSTANCE;
                if (windowAreaComponentValidator.isWindowAreaComponentValid$window_release(windowAreaComponentClass, extensionsUtil.getSafeVendorApiLevel()) && windowAreaComponentValidator.isExtensionWindowAreaStatusValid$window_release(getExtensionWindowAreaStatusClass(), extensionsUtil.getSafeVendorApiLevel()) && windowAreaComponentValidator.isExtensionWindowAreaPresentationValid$window_release(getExtensionWindowAreaPresentationClass(), extensionsUtil.getSafeVendorApiLevel())) {
                    return this.windowExtensions.getWindowAreaComponent();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
