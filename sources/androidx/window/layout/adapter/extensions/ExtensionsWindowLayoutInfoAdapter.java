package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.DisplayFoldFeature;
import androidx.window.extensions.layout.SupportedWindowFeatures;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import defpackage.f31;
import defpackage.nb0;
import defpackage.oi0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(WindowMetrics windowMetrics, Bounds bounds) {
        Rect bounds2 = windowMetrics.getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) {
            return (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) ? false : true;
        }
        return false;
    }

    public final FoldingFeature translate$window_release(WindowMetrics windowMetrics, androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        windowMetrics.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = foldingFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        if (!validBounds(windowMetrics, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WindowLayoutInfo translate$window_release(Context context, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        context.getClass();
        windowLayoutInfo.getClass();
        WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return translate$window_release(windowMetricsCalculatorCompat.computeCurrentWindowMetrics(context), windowLayoutInfo);
        }
        if (i >= 29 && (context instanceof Activity)) {
            return translate$window_release(windowMetricsCalculatorCompat.computeCurrentWindowMetrics((Activity) context), windowLayoutInfo);
        }
        f31.f("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        return null;
    }

    public final WindowLayoutInfo translate$window_release(WindowMetrics windowMetrics, androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        windowMetrics.getClass();
        windowLayoutInfo.getClass();
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature foldingFeature : displayFeatures) {
            FoldingFeature translate$window_release = foldingFeature instanceof androidx.window.extensions.layout.FoldingFeature ? INSTANCE.translate$window_release(windowMetrics, foldingFeature) : null;
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }

    public final List<SupportedPosture> translate$window_release(SupportedWindowFeatures supportedWindowFeatures) {
        supportedWindowFeatures.getClass();
        List displayFoldFeatures = supportedWindowFeatures.getDisplayFoldFeatures();
        displayFoldFeatures.getClass();
        List list = displayFoldFeatures;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((DisplayFoldFeature) it.next()).hasProperties(new int[]{1})) {
                    return nb0.C(SupportedPosture.TABLETOP);
                }
            }
        }
        return oi0.a;
    }
}
