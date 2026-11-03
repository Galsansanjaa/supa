package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import defpackage.dl1;
import defpackage.lr2;
import defpackage.nb0;
import defpackage.os0;
import defpackage.ph0;
import defpackage.sh0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SharedMutableTransformState {
    public static final int $stable = 8;
    private final MutableState<Boolean> _isMutating;
    private final MutableState isHandoffActive$delegate;
    private float lastAlpha;
    private float lastManualScale;
    private long lastManualSlide;
    private MutableTransform lastMutableData;
    private float lastScale;
    private long lastSlide;
    private long lastTransformOrigin;
    private long lastVeil;
    private MutableTransform mutableData;
    private VelocityTracker offsetVelocityTracker;
    private LayoutCoordinates parentLayoutCoordinates;
    private VelocityTracker1D scaleVelocityTracker;
    private final long startTime;
    private final lr2 timeSource;
    private final TransformScopeImpl transformScope;

    public SharedMutableTransformState() {
        MutableState<Boolean> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isMutating = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isHandoffActive$delegate = mutableStateOf$default2;
        this.transformScope = new TransformScopeImpl();
        this.timeSource = lr2.a;
        this.startTime = dl1.a();
        this.lastVeil = Color.Companion.m5367getTransparent0d7_KjU();
        this.lastAlpha = 1.0f;
        this.lastScale = 1.0f;
        this.lastTransformOrigin = TransformOrigin.Companion.m5744getCenterSzJe1aQ();
        IntOffset.Companion companion = IntOffset.Companion;
        this.lastSlide = companion.m8184getZeronOccac();
        this.lastManualScale = 1.0f;
        this.lastManualSlide = companion.m8184getZeronOccac();
    }

    private final long getCurrentMillis() {
        os0 testTimeSource = DeferredEnterExitTransitionKt.getTestTimeSource();
        if (testTimeSource != null) {
            return ((Number) testTimeSource.invoke()).longValue();
        }
        long j = this.startTime;
        long h = (1 | (j - 1)) == Long.MAX_VALUE ? ph0.h(nb0.y(j)) : nb0.J(dl1.a(), j);
        return ((((int) h) & 1) != 1 || ph0.e(h)) ? ph0.g(h, sh0.MILLISECONDS) : h >> 1;
    }

    private final void setHandoffActive(boolean z) {
        this.isHandoffActive$delegate.setValue(Boolean.valueOf(z));
    }

    private final void trackScaleVelocity(float f) {
        VelocityTracker1D velocityTracker1D = this.scaleVelocityTracker;
        if (velocityTracker1D == null) {
            velocityTracker1D = new VelocityTracker1D(false);
            this.scaleVelocityTracker = velocityTracker1D;
        }
        if (velocityTracker1D != null) {
            velocityTracker1D.addDataPoint(getCurrentMillis(), f);
        }
    }

    /* renamed from: trackSlideVelocity--gyyYBs, reason: not valid java name */
    private final void m155trackSlideVelocitygyyYBs(long j) {
        VelocityTracker velocityTracker = this.offsetVelocityTracker;
        if (velocityTracker == null) {
            velocityTracker = new VelocityTracker();
            this.offsetVelocityTracker = velocityTracker;
        }
        if (velocityTracker != null) {
            long currentMillis = getCurrentMillis();
            float m8173getXimpl = IntOffset.m8173getXimpl(j);
            float m8174getYimpl = IntOffset.m8174getYimpl(j);
            velocityTracker.m6683addPositionUv8p0NA(currentMillis, Offset.m5082constructorimpl((Float.floatToRawIntBits(m8174getYimpl) & 4294967295L) | (Float.floatToRawIntBits(m8173getXimpl) << 32)));
        }
    }

    public final void clear() {
        setHandoffActive(false);
        setMutating(false);
        this.transformScope.reset();
        this.lastVeil = Color.Companion.m5367getTransparent0d7_KjU();
        this.lastAlpha = 1.0f;
        this.lastScale = 1.0f;
        VelocityTracker1D velocityTracker1D = this.scaleVelocityTracker;
        if (velocityTracker1D != null) {
            velocityTracker1D.resetTracking();
        }
        this.lastTransformOrigin = TransformOrigin.Companion.m5744getCenterSzJe1aQ();
        IntOffset.Companion companion = IntOffset.Companion;
        this.lastSlide = companion.m8184getZeronOccac();
        this.lastManualScale = 1.0f;
        this.lastManualSlide = companion.m8184getZeronOccac();
        VelocityTracker velocityTracker = this.offsetVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.resetTracking();
        }
        this.lastMutableData = null;
        setMutableData(null);
    }

    public final float combinedAlpha(float f) {
        float alpha = f * ((isMutating() && this.transformScope.isAlphaMutated()) ? this.transformScope.getAlpha() : 1.0f);
        if (isMutating()) {
            this.lastAlpha = alpha;
        }
        return alpha;
    }

    public final float combinedScale(float f) {
        boolean z = isMutating() && this.transformScope.isScaleMutated();
        float scale = f * (z ? this.transformScope.getScale() : 1.0f);
        if (isMutating()) {
            this.lastScale = scale;
            this.lastManualScale = z ? this.transformScope.getScale() : 1.0f;
            if (z) {
                trackScaleVelocity(scale);
            }
        }
        return scale;
    }

    /* renamed from: combinedSlide-zPqKDFQ, reason: not valid java name */
    public final long m156combinedSlidezPqKDFQ(long j, long j2) {
        m159evaluateTransformBlockozmzZPI(j2);
        boolean z = isMutating() && this.transformScope.isOffsetMutated();
        long m8177plusqkQi6aY = IntOffset.m8177plusqkQi6aY(j, z ? this.transformScope.mo203getOffsetnOccac() : IntOffset.Companion.m8184getZeronOccac());
        if (isMutating()) {
            this.lastSlide = m8177plusqkQi6aY;
            this.lastManualSlide = z ? this.transformScope.mo203getOffsetnOccac() : IntOffset.Companion.m8184getZeronOccac();
            if (z) {
                m155trackSlideVelocitygyyYBs(m8177plusqkQi6aY);
            }
        }
        return m8177plusqkQi6aY;
    }

    /* renamed from: combinedTransformOrigin-488XkdY, reason: not valid java name */
    public final long m157combinedTransformOrigin488XkdY(long j) {
        if (isMutating() && this.transformScope.isTransformOriginMutated()) {
            j = this.transformScope.mo204getTransformOriginSzJe1aQ();
        }
        if (isMutating()) {
            this.lastTransformOrigin = j;
        }
        return j;
    }

    /* renamed from: combinedVeil-l2rxGTc, reason: not valid java name */
    public final long m158combinedVeill2rxGTc(long j) {
        if (isMutating() && this.transformScope.isVeilMutated()) {
            j = this.transformScope.mo205getVeil0d7_KjU();
        }
        if (isMutating()) {
            this.lastVeil = j;
        }
        return j;
    }

    /* renamed from: evaluateTransformBlock-ozmzZPI, reason: not valid java name */
    public final void m159evaluateTransformBlockozmzZPI(long j) {
        MutableTransform mutableTransform;
        ts0 block$animation;
        if (!isMutating() || (mutableTransform = this.mutableData) == null || (block$animation = mutableTransform.getBlock$animation()) == null) {
            return;
        }
        block$animation.invoke(this.transformScope, IntSize.m8208boximpl(j));
    }

    /* renamed from: getActiveOffset-nOcc-ac$animation, reason: not valid java name */
    public final long m160getActiveOffsetnOccac$animation() {
        return this.transformScope.isOffsetMutated() ? this.transformScope.mo203getOffsetnOccac() : IntOffset.Companion.m8184getZeronOccac();
    }

    public final float getActiveScale$animation() {
        if (this.transformScope.isScaleMutated()) {
            return this.transformScope.getScale();
        }
        return 1.0f;
    }

    /* renamed from: getActiveTransformOrigin-SzJe1aQ$animation, reason: not valid java name */
    public final long m161getActiveTransformOriginSzJe1aQ$animation() {
        return this.transformScope.isTransformOriginMutated() ? this.transformScope.mo204getTransformOriginSzJe1aQ() : TransformOrigin.Companion.m5744getCenterSzJe1aQ();
    }

    public final Float getAlphaHandoffValue() {
        if (isHandoffActive()) {
            return Float.valueOf(this.lastAlpha);
        }
        return null;
    }

    public final boolean getAlphaRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isAlphaMutated()) || this.lastAlpha != 1.0f;
    }

    public final float getLastAlpha() {
        return this.lastAlpha;
    }

    public final float getLastManualScale() {
        return this.lastManualScale;
    }

    /* renamed from: getLastManualSlide-nOcc-ac, reason: not valid java name */
    public final long m162getLastManualSlidenOccac() {
        return this.lastManualSlide;
    }

    public final float getLastScale() {
        return this.lastScale;
    }

    /* renamed from: getLastSlide-nOcc-ac, reason: not valid java name */
    public final long m163getLastSlidenOccac() {
        return this.lastSlide;
    }

    /* renamed from: getLastTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m164getLastTransformOriginSzJe1aQ() {
        return this.lastTransformOrigin;
    }

    /* renamed from: getLastVeil-0d7_KjU, reason: not valid java name */
    public final long m165getLastVeil0d7_KjU() {
        return this.lastVeil;
    }

    public final MutableTransform getMutableData() {
        return this.mutableData;
    }

    public final LayoutCoordinates getParentLayoutCoordinates() {
        return this.parentLayoutCoordinates;
    }

    public final Float getScaleHandoffValue() {
        if (isHandoffActive()) {
            return Float.valueOf(this.lastScale);
        }
        return null;
    }

    public final AnimationVector1D getScaleHandoffVelocity() {
        float f;
        if (!isHandoffActive()) {
            return null;
        }
        VelocityTracker1D velocityTracker1D = this.scaleVelocityTracker;
        if (velocityTracker1D != null) {
            Float valueOf = Float.valueOf(velocityTracker1D.calculateVelocity());
            Float f2 = Float.isNaN(valueOf.floatValue()) ? null : valueOf;
            if (f2 != null) {
                f = f2.floatValue();
                return new AnimationVector1D(f);
            }
        }
        f = 0.0f;
        return new AnimationVector1D(f);
    }

    public final boolean getScaleRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isScaleMutated()) || this.lastScale != 1.0f;
    }

    /* renamed from: getSlideHandoffValue-JyOPPKE, reason: not valid java name */
    public final IntOffset m166getSlideHandoffValueJyOPPKE() {
        if (isHandoffActive()) {
            return IntOffset.m8164boximpl(this.lastSlide);
        }
        return null;
    }

    public final AnimationVector2D getSlideHandoffVelocity() {
        os0 offsetVelocityProvider$animation;
        if (!isHandoffActive()) {
            return null;
        }
        MutableTransform mutableTransform = this.lastMutableData;
        Offset offset = (mutableTransform == null || (offsetVelocityProvider$animation = mutableTransform.getOffsetVelocityProvider$animation()) == null) ? null : (Offset) offsetVelocityProvider$animation.invoke();
        if (offset != null && (offset.m5100unboximpl() & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (offset.m5100unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m5100unboximpl() & 4294967295L)));
        }
        VelocityTracker velocityTracker = this.offsetVelocityTracker;
        long m6684calculateVelocity9UxMQ8M = velocityTracker != null ? velocityTracker.m6684calculateVelocity9UxMQ8M() : Velocity.Companion.m8294getZero9UxMQ8M();
        Float valueOf = Float.valueOf(Velocity.m8283getXimpl(m6684calculateVelocity9UxMQ8M));
        if (Float.isNaN(valueOf.floatValue())) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : 0.0f;
        Float valueOf2 = Float.valueOf(Velocity.m8284getYimpl(m6684calculateVelocity9UxMQ8M));
        Float f = Float.isNaN(valueOf2.floatValue()) ? null : valueOf2;
        return new AnimationVector2D(floatValue, f != null ? f.floatValue() : 0.0f);
    }

    public final boolean getSlideRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isOffsetMutated()) || !IntOffset.m8172equalsimpl0(this.lastSlide, IntOffset.Companion.m8184getZeronOccac());
    }

    /* renamed from: getTransformOriginHandoffValue-0uW6WK0, reason: not valid java name */
    public final TransformOrigin m167getTransformOriginHandoffValue0uW6WK0() {
        if (isHandoffActive()) {
            return TransformOrigin.m5731boximpl(this.lastTransformOrigin);
        }
        return null;
    }

    public final boolean getTransformOriginRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isTransformOriginMutated()) || !TransformOrigin.m5738equalsimpl0(this.lastTransformOrigin, TransformOrigin.Companion.m5744getCenterSzJe1aQ());
    }

    public final TransformScopeImpl getTransformScope$animation() {
        return this.transformScope;
    }

    /* renamed from: getVeilHandoffValue-QN2ZGVo, reason: not valid java name */
    public final Color m168getVeilHandoffValueQN2ZGVo() {
        if (isHandoffActive()) {
            return Color.m5322boximpl(this.lastVeil);
        }
        return null;
    }

    public final boolean getVeilRequiresAnimation() {
        MutableTransform mutableTransform = this.mutableData;
        return ((mutableTransform != null ? mutableTransform.getBlock$animation() : null) != null && this.transformScope.isVeilMutated()) || !Color.m5333equalsimpl0(this.lastVeil, Color.Companion.m5367getTransparent0d7_KjU());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHandoffActive() {
        return ((Boolean) this.isHandoffActive$delegate.getValue()).booleanValue();
    }

    public final boolean isMutating() {
        return this._isMutating.getValue().booleanValue();
    }

    public final void setLastAlpha(float f) {
        this.lastAlpha = f;
    }

    public final void setLastManualScale(float f) {
        this.lastManualScale = f;
    }

    /* renamed from: setLastManualSlide--gyyYBs, reason: not valid java name */
    public final void m169setLastManualSlidegyyYBs(long j) {
        this.lastManualSlide = j;
    }

    public final void setLastScale(float f) {
        this.lastScale = f;
    }

    /* renamed from: setLastSlide--gyyYBs, reason: not valid java name */
    public final void m170setLastSlidegyyYBs(long j) {
        this.lastSlide = j;
    }

    /* renamed from: setLastTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m171setLastTransformOrigin__ExYCQ(long j) {
        this.lastTransformOrigin = j;
    }

    /* renamed from: setLastVeil-8_81llA, reason: not valid java name */
    public final void m172setLastVeil8_81llA(long j) {
        this.lastVeil = j;
    }

    public final void setMutableData(MutableTransform mutableTransform) {
        if (mutableTransform != null) {
            this.lastMutableData = mutableTransform;
        }
        this.mutableData = mutableTransform;
    }

    public final void setMutating(boolean z) {
        if (this._isMutating.getValue().booleanValue() && !z) {
            setHandoffActive(true);
        } else if (z) {
            setHandoffActive(false);
        }
        this._isMutating.setValue(Boolean.valueOf(z));
    }

    public final void setParentLayoutCoordinates$animation(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates = layoutCoordinates;
    }
}
