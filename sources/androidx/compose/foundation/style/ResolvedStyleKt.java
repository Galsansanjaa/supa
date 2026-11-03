package androidx.compose.foundation.style;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ResolvedStyleKt {
    private static final SpringSpec<Float> DefaultSpringSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    public static final SpringSpec<Float> getDefaultSpringSpec() {
        return DefaultSpringSpec;
    }
}
