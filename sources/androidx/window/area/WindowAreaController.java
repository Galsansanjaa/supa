package androidx.window.area;

import android.app.Activity;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import androidx.window.core.BuildConfig;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import defpackage.a52;
import defpackage.co2;
import defpackage.jp0;
import defpackage.m73;
import defpackage.nb1;
import defpackage.sb0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class WindowAreaController {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = a52.a(WindowAreaController.class).c();
    private static WindowAreaControllerDecorator decorator = EmptyDecorator.INSTANCE;
    private static final nb1 windowAreaController$delegate = new co2(new m73(5));

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        private final WindowAreaController getWindowAreaController() {
            return (WindowAreaController) WindowAreaController.windowAreaController$delegate.getValue();
        }

        public final WindowAreaController getOrCreate() {
            return WindowAreaController.decorator.decorate(getWindowAreaController());
        }

        public final void overrideDecorator(WindowAreaControllerDecorator windowAreaControllerDecorator) {
            windowAreaControllerDecorator.getClass();
            WindowAreaController.decorator = windowAreaControllerDecorator;
        }

        public final void reset() {
            WindowAreaController.decorator = EmptyDecorator.INSTANCE;
        }
    }

    public static final WindowAreaController getOrCreate() {
        return Companion.getOrCreate();
    }

    public static final void overrideDecorator(WindowAreaControllerDecorator windowAreaControllerDecorator) {
        Companion.overrideDecorator(windowAreaControllerDecorator);
    }

    public static final void reset() {
        Companion.reset();
    }

    public static final WindowAreaController windowAreaController_delegate$lambda$1() {
        WindowAreaComponent windowAreaComponent = null;
        try {
            ClassLoader classLoader = Companion.getClass().getClassLoader();
            if (classLoader != null) {
                windowAreaComponent = new SafeWindowAreaComponentProvider(classLoader).getWindowAreaComponent();
            }
        } catch (Throwable unused) {
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                Log.d(TAG, "Failed to load WindowExtensions");
            }
        }
        if (Build.VERSION.SDK_INT <= 29 || windowAreaComponent == null || ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() < 3) {
            return new EmptyWindowAreaControllerImpl();
        }
        windowAreaComponent.getClass();
        return new WindowAreaControllerImpl(windowAreaComponent);
    }

    public abstract jp0 getWindowAreaInfos();

    public abstract void presentContentOnWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback);

    public abstract void transferActivityToWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback);
}
