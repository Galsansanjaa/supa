package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Blur_androidKt {
    public static final BlurMaskFilter BlurFilter(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void setBlurFilter(Paint paint, BlurMaskFilter blurMaskFilter) {
        AndroidPaint_androidKt.getNativePaint(paint).setMaskFilter(blurMaskFilter);
    }
}
