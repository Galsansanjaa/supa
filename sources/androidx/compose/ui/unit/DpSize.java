package androidx.compose.ui.unit;

import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m8138constructorimpl(0);
    private static final long Unspecified = m8138constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m8156getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m8157getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m8135boximpl(long j) {
        return new DpSize(j);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m8136component1D9Ej5fM(long j) {
        return m8147getWidthD9Ej5fM(j);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m8137component2D9Ej5fM(long j) {
        return m8145getHeightD9Ej5fM(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8138constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m8139copyDwJknco(long j, float f, float f2) {
        return m8138constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m8140copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m8147getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m8145getHeightD9Ej5fM(j);
        }
        return m8139copyDwJknco(j, f, f2);
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m8141divGh9hcWk(long j, float f) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j) / f);
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j) / f);
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (Float.floatToRawIntBits(m8049constructorimpl2) & 4294967295L));
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m8142divGh9hcWk(long j, int i) {
        float f = i;
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j) / f);
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j) / f);
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (Float.floatToRawIntBits(m8049constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8143equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).m8155unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8144equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m8145getHeightD9Ej5fM(long j) {
        return Dp.m8049constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8146getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m8147getWidthD9Ej5fM(long j) {
        return Dp.m8049constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8148getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8149hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m8150minuse_xh8Ic(long j, long j2) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j) - m8147getWidthD9Ej5fM(j2));
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j) - m8145getHeightD9Ej5fM(j2));
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8049constructorimpl2)));
    }

    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m8151pluse_xh8Ic(long j, long j2) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j2) + m8147getWidthD9Ej5fM(j));
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j2) + m8145getHeightD9Ej5fM(j));
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m8049constructorimpl2)));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m8152timesGh9hcWk(long j, float f) {
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j) * f);
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j) * f);
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (Float.floatToRawIntBits(m8049constructorimpl2) & 4294967295L));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m8153timesGh9hcWk(long j, int i) {
        float f = i;
        float m8049constructorimpl = Dp.m8049constructorimpl(m8147getWidthD9Ej5fM(j) * f);
        float m8049constructorimpl2 = Dp.m8049constructorimpl(m8145getHeightD9Ej5fM(j) * f);
        return m8138constructorimpl((Float.floatToRawIntBits(m8049constructorimpl) << 32) | (Float.floatToRawIntBits(m8049constructorimpl2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8154toStringimpl(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? wa2.s(Dp.m8060toStringimpl(m8147getWidthD9Ej5fM(j)), " x ", Dp.m8060toStringimpl(m8145getHeightD9Ej5fM(j))) : "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return m8143equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8149hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8154toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8155unboximpl() {
        return this.packedValue;
    }
}
