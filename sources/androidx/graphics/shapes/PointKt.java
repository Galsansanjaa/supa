package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointKt {
    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m8326clockwiseybeJwSQ(long j, long j2) {
        return (m8336getYDnnuFBc(j2) * m8335getXDnnuFBc(j)) - (m8335getXDnnuFBc(j2) * m8336getYDnnuFBc(j)) > 0.0f;
    }

    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m8327copy5P9i7ZU(long j, float f, float f2) {
        return FloatFloatPair.m14constructorimpl(f, f2);
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m8328copy5P9i7ZU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m8327copy5P9i7ZU(j, f, f2);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m8329divso9K2fw(long j, float f) {
        return FloatFloatPair.m14constructorimpl(m8335getXDnnuFBc(j) / f, m8336getYDnnuFBc(j) / f);
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m8330dotProduct5P9i7ZU(long j, float f, float f2) {
        return (m8336getYDnnuFBc(j) * f2) + (m8335getXDnnuFBc(j) * f);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m8331dotProductybeJwSQ(long j, long j2) {
        return (m8336getYDnnuFBc(j2) * m8336getYDnnuFBc(j)) + (m8335getXDnnuFBc(j2) * m8335getXDnnuFBc(j));
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m8332getDirectionDnnuFBc(long j) {
        float m8333getDistanceDnnuFBc = m8333getDistanceDnnuFBc(j);
        if (m8333getDistanceDnnuFBc > 0.0f) {
            return m8329divso9K2fw(j, m8333getDistanceDnnuFBc);
        }
        v5.m("Can't get the direction of a 0-length vector");
        return 0L;
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m8333getDistanceDnnuFBc(long j) {
        return (float) Math.sqrt((m8336getYDnnuFBc(j) * m8336getYDnnuFBc(j)) + (m8335getXDnnuFBc(j) * m8335getXDnnuFBc(j)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m8334getDistanceSquaredDnnuFBc(long j) {
        return (m8336getYDnnuFBc(j) * m8336getYDnnuFBc(j)) + (m8335getXDnnuFBc(j) * m8335getXDnnuFBc(j));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m8335getXDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m8336getYDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m8337interpolatedLqxh1s(long j, long j2, float f) {
        return FloatFloatPair.m14constructorimpl(Utils.interpolate(m8335getXDnnuFBc(j), m8335getXDnnuFBc(j2), f), Utils.interpolate(m8336getYDnnuFBc(j), m8336getYDnnuFBc(j2), f));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m8338minusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m14constructorimpl(m8335getXDnnuFBc(j) - m8335getXDnnuFBc(j2), m8336getYDnnuFBc(j) - m8336getYDnnuFBc(j2));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m8339plusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m14constructorimpl(m8335getXDnnuFBc(j2) + m8335getXDnnuFBc(j), m8336getYDnnuFBc(j2) + m8336getYDnnuFBc(j));
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m8340remso9K2fw(long j, float f) {
        return FloatFloatPair.m14constructorimpl(m8335getXDnnuFBc(j) % f, m8336getYDnnuFBc(j) % f);
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m8341timesso9K2fw(long j, float f) {
        return FloatFloatPair.m14constructorimpl(m8335getXDnnuFBc(j) * f, m8336getYDnnuFBc(j) * f);
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m8342transformedso9K2fw(long j, PointTransformer pointTransformer) {
        pointTransformer.getClass();
        long mo8344transformXgqJiTY = pointTransformer.mo8344transformXgqJiTY(m8335getXDnnuFBc(j), m8336getYDnnuFBc(j));
        return FloatFloatPair.m14constructorimpl(Float.intBitsToFloat((int) (mo8344transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (mo8344transformXgqJiTY & 4294967295L)));
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m8343unaryMinusDnnuFBc(long j) {
        return FloatFloatPair.m14constructorimpl(-m8335getXDnnuFBc(j), -m8336getYDnnuFBc(j));
    }
}
