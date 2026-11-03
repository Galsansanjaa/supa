package androidx.window.layout.adapter;

import androidx.window.core.layout.WindowSizeClass;
import androidx.window.core.layout.WindowSizeClassSelectors;
import androidx.window.layout.WindowMetrics;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowSizeClassFactory {
    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, WindowMetrics windowMetrics) {
        set.getClass();
        windowMetrics.getClass();
        return WindowSizeClassSelectors.computeWindowSizeClass(set, windowMetrics.getWidthDp(), windowMetrics.getHeightDp());
    }
}
