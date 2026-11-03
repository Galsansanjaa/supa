package androidx.compose.material3.internal;

import androidx.compose.animation.core.Easing;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PredictiveBack {
    public static final int $stable = 0;
    public static final PredictiveBack INSTANCE = new PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3(float f) {
        Easing easing;
        easing = BackHandlerKt.PredictiveBackEasing;
        return easing.transform(f);
    }
}
