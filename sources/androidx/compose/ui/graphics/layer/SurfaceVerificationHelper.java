package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class SurfaceVerificationHelper {
    public static final SurfaceVerificationHelper INSTANCE = new SurfaceVerificationHelper();

    private SurfaceVerificationHelper() {
    }

    public final Canvas lockHardwareCanvas(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
