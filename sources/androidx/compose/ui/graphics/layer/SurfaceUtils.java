package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SurfaceUtils {
    private static boolean hasRetrievedMethod;
    private static Method lockHardwareCanvasMethod;
    public static final SurfaceUtils INSTANCE = new SurfaceUtils();
    public static final int $stable = 8;

    private SurfaceUtils() {
    }

    private final Canvas lockCanvasFallback(Surface surface) {
        Method resolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (resolveLockHardwareCanvasMethod == null) {
            return surface.lockCanvas(null);
        }
        Object invoke = resolveLockHardwareCanvasMethod.invoke(surface, null);
        invoke.getClass();
        return (Canvas) invoke;
    }

    private final Method resolveLockHardwareCanvasMethod() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = lockHardwareCanvasMethod;
                if (hasRetrievedMethod) {
                    method = method2;
                } else {
                    hasRetrievedMethod = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    lockHardwareCanvasMethod = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                lockHardwareCanvasMethod = null;
            }
        }
        return method;
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    public final Canvas lockCanvas(Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }
}
