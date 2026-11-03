package androidx.compose.ui.unit;

import defpackage.lt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m8167constructorimpl(0);
    private static final long Max = m8167constructorimpl(9223372034707292159L);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m8183getMaxnOccac() {
            return IntOffset.Max;
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m8184getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m8164boximpl(long j) {
        return new IntOffset(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m8165component1impl(long j) {
        return m8173getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m8166component2impl(long j) {
        return m8174getYimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8167constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m8168copyiSbpLlY(long j, int i, int i2) {
        return m8167constructorimpl((i << 32) | (i2 & 4294967295L));
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m8169copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m8168copyiSbpLlY(j, i, i2);
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m8170divBjo55l4(long j, float f) {
        return m8167constructorimpl((Math.round(((int) (j >> 32)) / f) << 32) | (Math.round(((int) (j & 4294967295L)) / f) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8171equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m8182unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8172equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m8173getXimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m8174getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8175hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m8176minusqkQi6aY(long j, long j2) {
        return m8167constructorimpl(((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m8177plusqkQi6aY(long j, long j2) {
        return m8167constructorimpl(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m8178remBjo55l4(long j, int i) {
        return m8167constructorimpl(((((int) (j >> 32)) % i) << 32) | ((((int) (j & 4294967295L)) % i) & 4294967295L));
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m8179timesBjo55l4(long j, float f) {
        return m8167constructorimpl((Math.round(((int) (j >> 32)) * f) << 32) | (Math.round(((int) (j & 4294967295L)) * f) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8180toStringimpl(long j) {
        return lt.x("(", m8173getXimpl(j), ", ", m8174getYimpl(j), ")");
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m8181unaryMinusnOccac(long j) {
        return m8167constructorimpl(((-((int) (j & 4294967295L))) & 4294967295L) | ((-((int) (j >> 32))) << 32));
    }

    public boolean equals(Object obj) {
        return m8171equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m8175hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8180toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8182unboximpl() {
        return this.packedValue;
    }
}
