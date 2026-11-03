package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowMetrics {
    private final Bounds _bounds;
    private final float density;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect rect, float f) {
        this(new Bounds(rect), f);
        rect.getClass();
    }

    public WindowMetrics(Bounds bounds, float f) {
        bounds.getClass();
        this._bounds = bounds;
        this.density = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WindowMetrics.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        return jh2.k(this._bounds, windowMetrics._bounds) && this.density == windowMetrics.density;
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public final float getDensity() {
        return this.density;
    }

    public final float getHeightDp() {
        return getBounds().height() / this.density;
    }

    public final float getWidthDp() {
        return getBounds().width() / this.density;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.density) + (this._bounds.hashCode() * 31);
    }

    public String toString() {
        return "WindowMetrics(_bounds=" + this._bounds + ", density=" + this.density + ')';
    }
}
