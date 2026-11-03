package androidx.compose.ui.platform;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private int blendMode;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = renderEffect;
        this.blendMode = i9;
        this.colorFilter = colorFilter;
        this.compositingStrategy = i10;
    }

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10, sb0 sb0Var) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10);
    }

    /* renamed from: copy-qCc9W8c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m7173copyqCc9W8c$default(DeviceRenderNodeData deviceRenderNodeData, long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10, int i11, Object obj) {
        int i12;
        ColorFilter colorFilter2;
        long j2 = (i11 & 1) != 0 ? deviceRenderNodeData.uniqueId : j;
        int i13 = (i11 & 2) != 0 ? deviceRenderNodeData.left : i;
        int i14 = (i11 & 4) != 0 ? deviceRenderNodeData.top : i2;
        int i15 = (i11 & 8) != 0 ? deviceRenderNodeData.right : i3;
        int i16 = (i11 & 16) != 0 ? deviceRenderNodeData.bottom : i4;
        int i17 = (i11 & 32) != 0 ? deviceRenderNodeData.width : i5;
        int i18 = (i11 & 64) != 0 ? deviceRenderNodeData.height : i6;
        float f13 = (i11 & 128) != 0 ? deviceRenderNodeData.scaleX : f;
        float f14 = (i11 & 256) != 0 ? deviceRenderNodeData.scaleY : f2;
        float f15 = (i11 & 512) != 0 ? deviceRenderNodeData.translationX : f3;
        float f16 = (i11 & 1024) != 0 ? deviceRenderNodeData.translationY : f4;
        float f17 = (i11 & 2048) != 0 ? deviceRenderNodeData.elevation : f5;
        int i19 = (i11 & 4096) != 0 ? deviceRenderNodeData.ambientShadowColor : i7;
        long j3 = j2;
        int i20 = (i11 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i8;
        float f18 = (i11 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f6;
        float f19 = (i11 & 32768) != 0 ? deviceRenderNodeData.rotationX : f7;
        float f20 = (i11 & 65536) != 0 ? deviceRenderNodeData.rotationY : f8;
        float f21 = (i11 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f9;
        float f22 = (i11 & 262144) != 0 ? deviceRenderNodeData.pivotX : f10;
        float f23 = (i11 & 524288) != 0 ? deviceRenderNodeData.pivotY : f11;
        boolean z3 = (i11 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z;
        boolean z4 = (i11 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z2;
        float f24 = (i11 & 4194304) != 0 ? deviceRenderNodeData.alpha : f12;
        RenderEffect renderEffect2 = (i11 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        int i21 = (i11 & 16777216) != 0 ? deviceRenderNodeData.blendMode : i9;
        ColorFilter colorFilter3 = (i11 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? deviceRenderNodeData.colorFilter : colorFilter;
        if ((i11 & 67108864) != 0) {
            colorFilter2 = colorFilter3;
            i12 = deviceRenderNodeData.compositingStrategy;
        } else {
            i12 = i10;
            colorFilter2 = colorFilter3;
        }
        return deviceRenderNodeData.m7176copyqCc9W8c(j3, i13, i14, i15, i16, i17, i18, f13, f14, f15, f16, f17, i19, i20, f18, f19, f20, f21, f22, f23, z3, z4, f24, renderEffect2, i21, colorFilter2, i12);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25-0nO6VwU, reason: not valid java name */
    public final int m7174component250nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component26() {
        return this.colorFilter;
    }

    /* renamed from: component27--NrFUSI, reason: not valid java name */
    public final int m7175component27NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* renamed from: copy-qCc9W8c, reason: not valid java name */
    public final DeviceRenderNodeData m7176copyqCc9W8c(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, ColorFilter colorFilter, int i10) {
        return new DeviceRenderNodeData(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, colorFilter, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && jh2.k(this.renderEffect, deviceRenderNodeData.renderEffect) && BlendMode.m5247equalsimpl0(this.blendMode, deviceRenderNodeData.blendMode) && jh2.k(this.colorFilter, deviceRenderNodeData.colorFilter) && CompositingStrategy.m5417equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m7177getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m7178getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        long j = this.uniqueId;
        int i = yo0.i(this.alpha, (((yo0.i(this.pivotY, yo0.i(this.pivotX, yo0.i(this.cameraDistance, yo0.i(this.rotationY, yo0.i(this.rotationX, yo0.i(this.rotationZ, (((yo0.i(this.elevation, yo0.i(this.translationY, yo0.i(this.translationX, yo0.i(this.scaleY, yo0.i(this.scaleX, ((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.width) * 31) + this.height) * 31, 31), 31), 31), 31), 31) + this.ambientShadowColor) * 31) + this.spotShadowColor) * 31, 31), 31), 31), 31), 31), 31) + (this.clipToOutline ? 1231 : 1237)) * 31) + (this.clipToBounds ? 1231 : 1237)) * 31, 31);
        RenderEffect renderEffect = this.renderEffect;
        int m5248hashCodeimpl = (BlendMode.m5248hashCodeimpl(this.blendMode) + ((i + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return CompositingStrategy.m5418hashCodeimpl(this.compositingStrategy) + ((m5248hashCodeimpl + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m7179setBlendModes9anfk8(int i) {
        this.blendMode = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m7180setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    public String toString() {
        long j = this.uniqueId;
        int i = this.left;
        int i2 = this.top;
        int i3 = this.right;
        int i4 = this.bottom;
        int i5 = this.width;
        int i6 = this.height;
        float f = this.scaleX;
        float f2 = this.scaleY;
        float f3 = this.translationX;
        float f4 = this.translationY;
        float f5 = this.elevation;
        int i7 = this.ambientShadowColor;
        int i8 = this.spotShadowColor;
        float f6 = this.rotationZ;
        float f7 = this.rotationX;
        float f8 = this.rotationY;
        float f9 = this.cameraDistance;
        float f10 = this.pivotX;
        float f11 = this.pivotY;
        boolean z = this.clipToOutline;
        boolean z2 = this.clipToBounds;
        float f12 = this.alpha;
        RenderEffect renderEffect = this.renderEffect;
        String m5249toStringimpl = BlendMode.m5249toStringimpl(this.blendMode);
        ColorFilter colorFilter = this.colorFilter;
        String m5419toStringimpl = CompositingStrategy.m5419toStringimpl(this.compositingStrategy);
        StringBuilder sb = new StringBuilder("DeviceRenderNodeData(uniqueId=");
        sb.append(j);
        sb.append(", left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        sb.append(", right=");
        sb.append(i3);
        sb.append(", bottom=");
        sb.append(i4);
        sb.append(", width=");
        sb.append(i5);
        sb.append(", height=");
        sb.append(i6);
        sb.append(", scaleX=");
        sb.append(f);
        sb.append(", scaleY=");
        sb.append(f2);
        sb.append(", translationX=");
        sb.append(f3);
        sb.append(", translationY=");
        sb.append(f4);
        sb.append(", elevation=");
        sb.append(f5);
        sb.append(", ambientShadowColor=");
        sb.append(i7);
        sb.append(", spotShadowColor=");
        sb.append(i8);
        sb.append(", rotationZ=");
        sb.append(f6);
        sb.append(", rotationX=");
        sb.append(f7);
        sb.append(", rotationY=");
        sb.append(f8);
        sb.append(", cameraDistance=");
        sb.append(f9);
        sb.append(", pivotX=");
        sb.append(f10);
        sb.append(", pivotY=");
        sb.append(f11);
        sb.append(", clipToOutline=");
        sb.append(z);
        sb.append(", clipToBounds=");
        sb.append(z2);
        sb.append(", alpha=");
        sb.append(f12);
        sb.append(", renderEffect=");
        sb.append(renderEffect);
        sb.append(", blendMode=");
        sb.append(m5249toStringimpl);
        sb.append(", colorFilter=");
        sb.append(colorFilter);
        return sg3.t(sb, ", compositingStrategy=", m5419toStringimpl, ")");
    }
}
