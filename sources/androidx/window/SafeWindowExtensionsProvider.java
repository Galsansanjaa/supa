package androidx.window;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import defpackage.hb2;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SafeWindowExtensionsProvider {
    private final ClassLoader loader;

    public SafeWindowExtensionsProvider(ClassLoader classLoader) {
        classLoader.getClass();
        this.loader = classLoader;
    }

    private final Class<?> getWindowExtensionsProviderClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    private final boolean isWindowExtensionsPresent() {
        return ReflectionUtils.INSTANCE.checkIsPresent$window_release(new hb2(this, 0));
    }

    public static final Class isWindowExtensionsPresent$lambda$1(SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        Class<?> loadClass = safeWindowExtensionsProvider.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_PROVIDER_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    public static final boolean isWindowExtensionsValid$lambda$0(SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        Method declaredMethod = safeWindowExtensionsProvider.getWindowExtensionsProviderClass().getDeclaredMethod("getWindowExtensions", null);
        Class<?> windowExtensionsClass$window_release = safeWindowExtensionsProvider.getWindowExtensionsClass$window_release();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        declaredMethod.getClass();
        return reflectionUtils.doesReturn$window_release(declaredMethod, windowExtensionsClass$window_release) && reflectionUtils.isPublic$window_release(declaredMethod);
    }

    public final WindowExtensions getWindowExtensions() {
        try {
            if (isWindowExtensionsPresent() && isWindowExtensionsValid$window_release()) {
                return WindowExtensionsProvider.getWindowExtensions();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Class<?> getWindowExtensionsClass$window_release() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_EXTENSIONS_CLASS);
        loadClass.getClass();
        return loadClass;
    }

    public final boolean isWindowExtensionsValid$window_release() {
        return isWindowExtensionsPresent() && ReflectionUtils.validateReflection$window_release("WindowExtensionsProvider#getWindowExtensions is not valid", new hb2(this, 1));
    }
}
