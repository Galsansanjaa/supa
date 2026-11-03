package androidx.compose.material.ripple;

import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RippleAlpha {
    public static final int $stable = 0;
    private final float draggedAlpha;
    private final float focusedAlpha;
    private final float hoveredAlpha;
    private final float pressedAlpha;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.draggedAlpha = f;
        this.focusedAlpha = f2;
        this.hoveredAlpha = f3;
        this.pressedAlpha = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.draggedAlpha == rippleAlpha.draggedAlpha && this.focusedAlpha == rippleAlpha.focusedAlpha && this.hoveredAlpha == rippleAlpha.hoveredAlpha && this.pressedAlpha == rippleAlpha.pressedAlpha;
    }

    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.pressedAlpha) + yo0.i(this.hoveredAlpha, yo0.i(this.focusedAlpha, Float.floatToIntBits(this.draggedAlpha) * 31, 31), 31);
    }

    public String toString() {
        float f = this.draggedAlpha;
        float f2 = this.focusedAlpha;
        float f3 = this.hoveredAlpha;
        float f4 = this.pressedAlpha;
        StringBuilder v = yo0.v("RippleAlpha(draggedAlpha=", f, ", focusedAlpha=", f2, ", hoveredAlpha=");
        v.append(f3);
        v.append(", pressedAlpha=");
        v.append(f4);
        v.append(")");
        return v.toString();
    }
}
