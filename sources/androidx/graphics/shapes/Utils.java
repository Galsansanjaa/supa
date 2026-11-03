package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import defpackage.os0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m14constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f, float f2) {
        float atan2 = (float) Math.atan2(f2, f);
        float f3 = TwoPi;
        return (atan2 + f3) % f3;
    }

    public static final void debugLog(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
    }

    public static final long directionVector(float f) {
        double d = f;
        return FloatFloatPair.m14constructorimpl((float) Math.cos(d), (float) Math.sin(d));
    }

    public static final long directionVector(float f, float f2) {
        float distance = distance(f, f2);
        if (distance > 0.0f) {
            return FloatFloatPair.m14constructorimpl(f / distance, f2 / distance);
        }
        v5.m("Required distance greater than zero");
        return 0L;
    }

    public static final float distance(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static final float distanceSquared(float f, float f2) {
        return (f2 * f2) + (f * f);
    }

    public static final float findMinimum(float f, float f2, float f3, FindMinimumFunction findMinimumFunction) {
        findMinimumFunction.getClass();
        while (f2 - f > f3) {
            float f4 = ((2.0f * f) + f2) / 3.0f;
            float f5 = ((2.0f * f2) + f) / 3.0f;
            if (findMinimumFunction.invoke(f4) < findMinimumFunction.invoke(f5)) {
                f2 = f5;
            } else {
                f = f4;
            }
        }
        return (f + f2) / 2.0f;
    }

    public static /* synthetic */ float findMinimum$default(float f, float f2, float f3, FindMinimumFunction findMinimumFunction, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.001f;
        }
        return findMinimum(f, f2, f3, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float positiveModulo(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    /* renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m8354radialToCartesianL6JJ3z0(float f, float f2, long j) {
        return PointKt.m8339plusybeJwSQ(PointKt.m8341timesso9K2fw(directionVector(f2), f), j);
    }

    /* renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m8355radialToCartesianL6JJ3z0$default(float f, float f2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = Zero;
        }
        return m8354radialToCartesianL6JJ3z0(f, f2, j);
    }

    /* renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m8356rotate90DnnuFBc(long j) {
        return FloatFloatPair.m14constructorimpl(-PointKt.m8336getYDnnuFBc(j), PointKt.m8335getXDnnuFBc(j));
    }

    public static final float square(float f) {
        return f * f;
    }
}
