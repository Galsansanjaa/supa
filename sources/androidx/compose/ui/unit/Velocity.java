package androidx.compose.ui.unit;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m8277constructorimpl(0);
    private final long packedValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m8293getZero9UxMQ8M$annotations() {
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m8294getZero9UxMQ8M() {
            return Velocity.Zero;
        }
    }

    private /* synthetic */ Velocity(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m8274boximpl(long j) {
        return new Velocity(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m8275component1impl(long j) {
        return m8283getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m8276component2impl(long j) {
        return m8284getYimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8277constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m8278copyOhffZ5M(long j, float f, float f2) {
        return m8277constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m8279copyOhffZ5M$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m8278copyOhffZ5M(j, f, f2);
    }

    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m8280divadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m8277constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8281equalsimpl(long j, Object obj) {
        return (obj instanceof Velocity) && j == ((Velocity) obj).m8292unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8282equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m8283getXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m8284getYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8285hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m8286minusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m8277constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m8287plusAH228Gc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return m8277constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m8288remadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) % f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) % f;
        return m8277constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m8289timesadjELrA(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m8277constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8290toStringimpl(long j) {
        return sg3.q("(", m8283getXimpl(j), ", ", m8284getYimpl(j), ") px/sec");
    }

    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m8291unaryMinus9UxMQ8M(long j) {
        return m8277constructorimpl(j ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m8281equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8285hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8290toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8292unboximpl() {
        return this.packedValue;
    }
}
