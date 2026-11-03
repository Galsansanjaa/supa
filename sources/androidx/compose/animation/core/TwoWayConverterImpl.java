package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final ps0 convertFromVector;
    private final ps0 convertToVector;

    public TwoWayConverterImpl(ps0 ps0Var, ps0 ps0Var2) {
        this.convertToVector = ps0Var;
        this.convertFromVector = ps0Var2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ps0 getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ps0 getConvertToVector() {
        return this.convertToVector;
    }
}
