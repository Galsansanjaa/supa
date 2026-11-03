package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.WindowSdkExtensions;
import androidx.window.layout.adapter.WindowBackend;
import defpackage.bc0;
import defpackage.ea0;
import defpackage.is;
import defpackage.jh2;
import defpackage.jp0;
import defpackage.oe0;
import defpackage.wh1;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;
    private final WindowSdkExtensions windowSdkExtensions;

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend, WindowSdkExtensions windowSdkExtensions) {
        windowMetricsCalculator.getClass();
        windowBackend.getClass();
        windowSdkExtensions.getClass();
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
        this.windowSdkExtensions = windowSdkExtensions;
    }

    public static final /* synthetic */ WindowBackend access$getWindowBackend$p(WindowInfoTrackerImpl windowInfoTrackerImpl) {
        return windowInfoTrackerImpl.windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        context.getClass();
        this.windowSdkExtensions.requireExtensionVersion$window_release(9);
        return this.windowBackend.getCurrentWindowLayoutInfo(context);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public List<SupportedPosture> getSupportedPostures() {
        this.windowSdkExtensions.requireExtensionVersion$window_release(6);
        return this.windowBackend.getSupportedPostures();
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public jp0 windowLayoutInfo(Activity activity) {
        activity.getClass();
        is i = ea0.i(new WindowInfoTrackerImpl$windowLayoutInfo$2(this, activity, null));
        bc0 bc0Var = oe0.a;
        return jh2.x(i, wh1.a);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public jp0 windowLayoutInfo(Context context) {
        context.getClass();
        is i = ea0.i(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null));
        bc0 bc0Var = oe0.a;
        return jh2.x(i, wh1.a);
    }
}
