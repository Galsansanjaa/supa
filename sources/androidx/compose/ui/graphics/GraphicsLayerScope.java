package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import defpackage.lt;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@PlacementScopeMarker
/* loaded from: classes3.dex */
public interface GraphicsLayerScope extends Density {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m5518getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        @Deprecated
        /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
        public static int m5519getBlendMode0nO6VwU(GraphicsLayerScope graphicsLayerScope) {
            return BlendMode.Companion.m5278getSrcOver0nO6VwU();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        public static ColorFilter getColorFilter(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m5520getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return CompositingStrategy.Companion.m5421getAutoNrFUSI();
        }

        @Deprecated
        public static LayerOutsets getOutsets(GraphicsLayerScope graphicsLayerScope) {
            return LayerOutsets.Companion.getZero();
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return null;
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5521getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return Size.Companion.m5167getUnspecifiedNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m5522getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScopeKt.getDefaultShadowColor();
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5523roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j) {
            return lt.a(graphicsLayerScope, j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5524roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f) {
            return lt.b(graphicsLayerScope, f);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m5525setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j) {
        }

        @Deprecated
        /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
        public static void m5526setBlendModes9anfk8(GraphicsLayerScope graphicsLayerScope, int i) {
        }

        @Deprecated
        public static void setColorFilter(GraphicsLayerScope graphicsLayerScope, ColorFilter colorFilter) {
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m5527setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i) {
        }

        @Deprecated
        public static void setOutsets(GraphicsLayerScope graphicsLayerScope, LayerOutsets layerOutsets) {
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m5528setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j) {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5529toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j) {
            return yo0.b(graphicsLayerScope, j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5530toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f) {
            return lt.d(graphicsLayerScope, f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5531toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i) {
            return lt.e(graphicsLayerScope, i);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5532toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j) {
            return lt.f(graphicsLayerScope, j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5533toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j) {
            return lt.g(graphicsLayerScope, j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5534toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f) {
            return graphicsLayerScope.getDensity() * f;
        }

        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return lt.h(graphicsLayerScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5535toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j) {
            return lt.i(graphicsLayerScope, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5536toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f) {
            return yo0.c(graphicsLayerScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5537toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f) {
            return lt.j(graphicsLayerScope, f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5538toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i) {
            return lt.k(graphicsLayerScope, i);
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo5507getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo5508getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo5509getCompositingStrategyNrFUSI();

    LayerOutsets getOutsets();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    long mo5510getSizeNHjbRc();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo5511getSpotShadowColor0d7_KjU();

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo5512getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo5513setAmbientShadowColor8_81llA(long j);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo5514setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo5515setCompositingStrategyaDBOjCE(int i);

    void setOutsets(LayerOutsets layerOutsets);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo5516setSpotShadowColor8_81llA(long j);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo5517setTransformOrigin__ExYCQ(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
