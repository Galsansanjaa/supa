package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder v = yo0.v("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            v.append(f3);
            v.append(", ");
            v.append(f4);
            v.append(".");
            PreconditionsKt.throwIllegalArgumentException(v.toString());
        }
        long computeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (computeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (computeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f) {
        float f2 = this.a;
        float f3 = this.b;
        float f4 = this.c;
        float f5 = this.d;
        StringBuilder v = yo0.v("The cubic curve with parameters (", f2, ", ", f3, ", ");
        v.append(f4);
        v.append(", ");
        v.append(f5);
        v.append(") has no solution at ");
        v.append(f);
        throw new IllegalArgumentException(v.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.d) + yo0.i(this.c, yo0.i(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder v = yo0.v("CubicBezierEasing(a=", f, ", b=", f2, ", c=");
        v.append(f3);
        v.append(", d=");
        v.append(f4);
        v.append(")");
        return v.toString();
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        if (f > 0.0f && f < 1.0f) {
            float max = Math.max(f, 1.1920929E-7f);
            float findFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - max, this.a - max, this.c - max, 1.0f - max);
            if (Float.isNaN(findFirstCubicRoot)) {
                throwNoSolution(f);
            }
            f = BezierKt.evaluateCubic(this.b, this.d, findFirstCubicRoot);
            float f2 = this.min;
            float f3 = this.max;
            if (f < f2) {
                f = f2;
            }
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }
}
