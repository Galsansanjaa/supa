package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.ui.geometry.Offset;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationData _get_convertFromVector_$lambda$0(AnimationVector4D animationVector4D) {
        float v1 = animationVector4D.getV1();
        float v2 = animationVector4D.getV2();
        float v3 = animationVector4D.getV3();
        return new AnimationData(v1, Offset.m5082constructorimpl((Float.floatToRawIntBits(v3) & 4294967295L) | (Float.floatToRawIntBits(v2) << 32)), animationVector4D.getV4(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector4D _get_convertToVector_$lambda$0(AnimationData animationData) {
        return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m498getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m498getOffsetF1C5BW0() & 4294967295L)), animationData.getDegrees());
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ps0 getConvertFromVector() {
        return new d(1);
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public ps0 getConvertToVector() {
        return new d(0);
    }
}
