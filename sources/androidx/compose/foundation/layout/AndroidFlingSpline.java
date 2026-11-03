package androidx.compose.foundation.layout;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.lt;
import defpackage.vg1;
import defpackage.wa2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[TypedValues.TYPE_TARGET];
    private static final float[] SplineTimes = new float[TypedValues.TYPE_TARGET];

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j) {
            this.packedValue = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m760boximpl(long j) {
            return new FlingResult(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m761constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m762equalsimpl(long j, Object obj) {
            return (obj instanceof FlingResult) && j == ((FlingResult) obj).m768unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m763equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m764getDistanceCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m765getVelocityCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m766hashCodeimpl(long j) {
            return (int) (j ^ (j >>> 32));
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m767toStringimpl(long j) {
            return vg1.B(j, "FlingResult(packedValue=", ")");
        }

        public boolean equals(Object obj) {
            return m762equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m766hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m767toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m768unboximpl() {
            return this.packedValue;
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float l = wa2.l(f, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f12;
                float f15 = f14;
                if (Math.abs(l - f13) < 1.0E-5d) {
                    break;
                }
                if (l > f13) {
                    f14 = f;
                    f12 = f5;
                } else {
                    f10 = f;
                    f12 = f5;
                    f14 = f15;
                }
            }
            float f16 = 0.5f;
            SplinePositions[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float l2 = wa2.l(f7, f16, f6, f8) + f9;
                if (Math.abs(l2 - f13) >= 1.0E-5d) {
                    if (l2 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                    }
                    f16 = 0.5f;
                }
            }
            SplineTimes[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m759flingPositionLfoxSSI(float f) {
        float f2;
        float f3;
        int i = (int) (100.0f * f);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = SplinePositions;
            float f5 = fArr[i];
            f3 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            f2 = lt.M(f, f4, f3, f5);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return FlingResult.m761constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }
}
