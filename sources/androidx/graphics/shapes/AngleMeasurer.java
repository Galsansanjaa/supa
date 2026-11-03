package androidx.graphics.shapes;

import androidx.graphics.shapes.AngleMeasurer;
import androidx.graphics.shapes.Cubic;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AngleMeasurer implements Measurer {
    private final float centerX;
    private final float centerY;

    public AngleMeasurer(float f, float f2) {
        this.centerX = f;
        this.centerY = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float findCubicCutPoint$lambda$1(Cubic cubic, AngleMeasurer angleMeasurer, float f, float f2, float f3) {
        cubic.getClass();
        angleMeasurer.getClass();
        long m8323pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m8323pointOnCurveOOQOV4g$graphics_shapes_release(f3);
        return Math.abs(Utils.positiveModulo(Utils.angle(PointKt.m8335getXDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release) - angleMeasurer.centerX, PointKt.m8336getYDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release) - angleMeasurer.centerY) - f, Utils.getTwoPi()) - f2);
    }

    @Override // androidx.graphics.shapes.Measurer
    public float findCubicCutPoint(final Cubic cubic, final float f) {
        cubic.getClass();
        final float angle = Utils.angle(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
        return Utils.findMinimum(0.0f, 1.0f, 1.0E-5f, new FindMinimumFunction() { // from class: h7
            @Override // androidx.graphics.shapes.FindMinimumFunction
            public final float invoke(float f2) {
                float findCubicCutPoint$lambda$1;
                findCubicCutPoint$lambda$1 = AngleMeasurer.findCubicCutPoint$lambda$1(Cubic.this, this, angle, f, f2);
                return findCubicCutPoint$lambda$1;
            }
        });
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    @Override // androidx.graphics.shapes.Measurer
    public float measureCubic(Cubic cubic) {
        cubic.getClass();
        float positiveModulo = Utils.positiveModulo(Utils.angle(cubic.getAnchor1X() - this.centerX, cubic.getAnchor1Y() - this.centerY) - Utils.angle(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY), Utils.getTwoPi());
        if (positiveModulo > Utils.getTwoPi() - 1.0E-4f) {
            return 0.0f;
        }
        return positiveModulo;
    }
}
