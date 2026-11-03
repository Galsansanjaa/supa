package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import defpackage.ej1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class FractionLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float aheadFraction;
    private final float behindFraction;

    public FractionLazyLayoutCacheWindow(float f, float f2) {
        this.aheadFraction = f;
        this.behindFraction = f2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i) {
        return ej1.K(i * this.aheadFraction);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i) {
        return ej1.K(i * this.behindFraction);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FractionLazyLayoutCacheWindow) {
            FractionLazyLayoutCacheWindow fractionLazyLayoutCacheWindow = (FractionLazyLayoutCacheWindow) obj;
            if (fractionLazyLayoutCacheWindow.aheadFraction == this.aheadFraction && fractionLazyLayoutCacheWindow.behindFraction == this.behindFraction) {
                return true;
            }
        }
        return false;
    }

    public final float getAheadFraction() {
        return this.aheadFraction;
    }

    public final float getBehindFraction() {
        return this.behindFraction;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.behindFraction) + (Float.floatToIntBits(this.aheadFraction) * 31);
    }
}
