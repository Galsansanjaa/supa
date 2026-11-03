package androidx.compose.ui.geometry;

import androidx.collection.SieveCacheKt;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5150constructorimpl(0);
    private static final long Unspecified = m5150constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc$annotations */
        public static /* synthetic */ void m5165getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations */
        public static /* synthetic */ void m5166getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc */
        public final long m5167getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc */
        public final long m5168getZeroNHjbRc() {
            return Size.Zero;
        }
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Size m5147boximpl(long j) {
        return new Size(j);
    }

    /* renamed from: component1-impl */
    public static final float m5148component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl */
    public static final float m5149component2impl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: constructor-impl */
    public static long m5150constructorimpl(long j) {
        return j;
    }

    /* renamed from: copy-xjbvk4A */
    public static final long m5151copyxjbvk4A(long j, float f, float f2) {
        return m5150constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default */
    public static /* synthetic */ long m5152copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m5151copyxjbvk4A(j, f, f2);
    }

    /* renamed from: div-7Ah8Wj8 */
    public static final long m5153div7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m5150constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m5154equalsimpl(long j, Object obj) {
        return (obj instanceof Size) && j == ((Size) obj).m5164unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m5155equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl */
    public static final float m5156getHeightimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl */
    public static final float m5157getMaxDimensionimpl(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask)));
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl */
    public static final float m5158getMinDimensionimpl(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask)));
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl */
    public static final float m5159getWidthimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: hashCode-impl */
    public static int m5160hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: isEmpty-impl */
    public static final boolean m5161isEmptyimpl(long j) {
        return (j == InlineClassHelperKt.UnspecifiedPackedFloats) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* renamed from: times-7Ah8Wj8 */
    public static final long m5162times7Ah8Wj8(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return m5150constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl */
    public static String m5163toStringimpl(long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? wa2.t("Size(", GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j >> 32)), 1), ", ", GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j & 4294967295L)), 1), ")") : "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return m5154equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5160hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5163toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m5164unboximpl() {
        return this.packedValue;
    }
}
