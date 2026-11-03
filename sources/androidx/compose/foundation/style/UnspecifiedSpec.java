package androidx.compose.foundation.style;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class UnspecifiedSpec implements FiniteAnimationSpec<Float> {
    public static final int $stable = 0;
    public static final UnspecifiedSpec INSTANCE = new UnspecifiedSpec();

    private UnspecifiedSpec() {
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter) {
        throw new IllegalStateException("UnspecifiedSpec should never be used as a spec");
    }
}
