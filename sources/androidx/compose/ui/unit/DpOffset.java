package androidx.compose.ui.unit;

import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m8105constructorimpl(0);
    private static final long Unspecified = m8105constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m8119getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m8120getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m8104boximpl(long j) {
        return new DpOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8105constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m8106copytPigGR8(long j, float f, float f2) {
        return m8105constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m8107copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m8110getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m8112getYD9Ej5fM(j);
        }
        return m8106copytPigGR8(j, f, f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8108equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).m8118unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8109equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m8110getXD9Ej5fM(long j) {
        return Dp.m8049constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8111getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m8112getYD9Ej5fM(long j) {
        return Dp.m8049constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8113getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8114hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m8115minusCBMgk4(long j, long j2) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8110getXD9Ej5fM(j) - m8110getXD9Ej5fM(j2));
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8112getYD9Ej5fM(j) - m8112getYD9Ej5fM(j2));
        return m8105constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8049constructorimpl2)));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m8116plusCBMgk4(long j, long j2) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8110getXD9Ej5fM(j2) + m8110getXD9Ej5fM(j));
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8112getYD9Ej5fM(j2) + m8112getYD9Ej5fM(j));
        return m8105constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8049constructorimpl2)));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8117toStringimpl(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? wa2.t("(", Dp.m8060toStringimpl(m8110getXD9Ej5fM(j)), ", ", Dp.m8060toStringimpl(m8112getYD9Ej5fM(j)), ")") : "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m8108equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m8114hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8117toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8118unboximpl() {
        return this.packedValue;
    }
}
