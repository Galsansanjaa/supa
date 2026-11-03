package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import defpackage.dv1;
import defpackage.f31;
import defpackage.sb0;
import defpackage.v5;
import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class Cubic {
    public static final Companion Companion = new Companion(null);
    private final float[] points;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Cubic circularArc(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = f3 - f;
            float f8 = f4 - f2;
            long directionVector = Utils.directionVector(f7, f8);
            float f9 = f5 - f;
            float f10 = f6 - f2;
            long directionVector2 = Utils.directionVector(f9, f10);
            long m8356rotate90DnnuFBc = Utils.m8356rotate90DnnuFBc(directionVector);
            long m8356rotate90DnnuFBc2 = Utils.m8356rotate90DnnuFBc(directionVector2);
            boolean z = PointKt.m8330dotProduct5P9i7ZU(m8356rotate90DnnuFBc, f9, f10) >= 0.0f;
            float m8331dotProductybeJwSQ = PointKt.m8331dotProductybeJwSQ(directionVector, directionVector2);
            if (m8331dotProductybeJwSQ > 0.999f) {
                return straightLine(f3, f4, f5, f6);
            }
            float sqrt = (((((float) Math.sqrt(2.0f * r5)) - ((float) Math.sqrt(1.0f - (m8331dotProductybeJwSQ * m8331dotProductybeJwSQ)))) * ((Utils.distance(f7, f8) * 4.0f) / 3.0f)) / (1.0f - m8331dotProductybeJwSQ)) * (z ? 1.0f : -1.0f);
            return CubicKt.Cubic(f3, f4, (PointKt.m8335getXDnnuFBc(m8356rotate90DnnuFBc) * sqrt) + f3, (PointKt.m8336getYDnnuFBc(m8356rotate90DnnuFBc) * sqrt) + f4, f5 - (PointKt.m8335getXDnnuFBc(m8356rotate90DnnuFBc2) * sqrt), f6 - (PointKt.m8336getYDnnuFBc(m8356rotate90DnnuFBc2) * sqrt), f5, f6);
        }

        public final Cubic straightLine(float f, float f2, float f3, float f4) {
            return CubicKt.Cubic(f, f2, Utils.interpolate(f, f3, 0.33333334f), Utils.interpolate(f2, f4, 0.33333334f), Utils.interpolate(f, f3, 0.6666667f), Utils.interpolate(f2, f4, 0.6666667f), f3, f4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private Cubic(long j, long j2, long j3, long j4) {
        this(new float[]{PointKt.m8335getXDnnuFBc(j), PointKt.m8336getYDnnuFBc(j), PointKt.m8335getXDnnuFBc(j2), PointKt.m8336getYDnnuFBc(j2), PointKt.m8335getXDnnuFBc(j3), PointKt.m8336getYDnnuFBc(j3), PointKt.m8335getXDnnuFBc(j4), PointKt.m8336getYDnnuFBc(j4)});
    }

    public /* synthetic */ Cubic(long j, long j2, long j3, long j4, sb0 sb0Var) {
        this(j, j2, j3, j4);
    }

    public Cubic(float[] fArr) {
        fArr.getClass();
        this.points = fArr;
        if (fArr.length == 8) {
            return;
        }
        v5.m("Points array size should be 8");
        throw null;
    }

    public /* synthetic */ Cubic(float[] fArr, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? new float[8] : fArr);
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: calculateBounds");
            return;
        }
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = false;
        }
        cubic.calculateBounds$graphics_shapes_release(fArr, z);
    }

    public static final Cubic circularArc(float f, float f2, float f3, float f4, float f5, float f6) {
        return Companion.circularArc(f, f2, f3, f4, f5, f6);
    }

    public static final Cubic straightLine(float f, float f2, float f3, float f4) {
        return Companion.straightLine(f, f2, f3, f4);
    }

    private final boolean zeroIsh(float f) {
        return Math.abs(f) < 1.0E-4f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void calculateBounds$graphics_shapes_release(float[] r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.shapes.Cubic.calculateBounds$graphics_shapes_release(float[], boolean):void");
    }

    public final Cubic div(float f) {
        return times(1.0f / f);
    }

    public final Cubic div(int i) {
        return div(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) obj).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    public final float[] getPoints$graphics_shapes_release() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Cubic plus(Cubic cubic) {
        cubic.getClass();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.points[i] + cubic.points[i];
        }
        return new Cubic(fArr);
    }

    /* renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m8323pointOnCurveOOQOV4g$graphics_shapes_release(float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float control1X = (getControl1X() * f6) + (getControl0X() * f5) + (getAnchor0X() * f3);
        float f7 = f * f * f;
        return FloatFloatPair.m14constructorimpl((getAnchor1X() * f7) + control1X, (getAnchor1Y() * f7) + (getControl1Y() * f6) + (getControl0Y() * f5) + (getAnchor0Y() * f3));
    }

    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final dv1 split(float f) {
        float f2 = 1.0f - f;
        long m8323pointOnCurveOOQOV4g$graphics_shapes_release = m8323pointOnCurveOOQOV4g$graphics_shapes_release(f);
        float f3 = f2 * f2;
        float f4 = 2.0f * f2 * f;
        float f5 = f * f;
        return new dv1(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f2) + (getControl0X() * f), (getAnchor0Y() * f2) + (getControl0Y() * f), (getControl1X() * f5) + (getControl0X() * f4) + (getAnchor0X() * f3), (getControl1Y() * f5) + (getControl0Y() * f4) + (getAnchor0Y() * f3), PointKt.m8335getXDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m8336getYDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m8335getXDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m8336getYDnnuFBc(m8323pointOnCurveOOQOV4g$graphics_shapes_release), (getAnchor1X() * f5) + (getControl1X() * f4) + (getControl0X() * f3), (getAnchor1Y() * f5) + (getControl1Y() * f4) + (getControl0Y() * f3), (getAnchor1X() * f) + (getControl1X() * f2), (getAnchor1Y() * f) + (getControl1Y() * f2), getAnchor1X(), getAnchor1Y()));
    }

    public final Cubic times(float f) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = this.points[i] * f;
        }
        return new Cubic(fArr);
    }

    public final Cubic times(int i) {
        return times(i);
    }

    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    public final Cubic transformed(PointTransformer pointTransformer) {
        pointTransformer.getClass();
        MutableCubic mutableCubic = new MutableCubic();
        wd.m0(this.points, 0, 14, mutableCubic.getPoints$graphics_shapes_release());
        mutableCubic.transform(pointTransformer);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes_release() {
        return Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f;
    }
}
